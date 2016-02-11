package ar.gov.rosario.administracionweb.servlet;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Iterator;

import javax.security.cert.X509Certificate;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class AuthAfipServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4297991477957224816L;
	
	private static final Logger log = Logger.getLogger(AuthAfipServlet.class); 

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}

	
	private void doRequest(HttpServletRequest request, 	HttpServletResponse response) throws IOException {
		/*
		Enumeration<String> parameterNames = request.getParameterNames();
		
		while (parameterNames.hasMoreElements()) {
			String key = parameterNames.nextElement();
			response.getWriter().append("<b>" + key + ":</b> " + request.getParameter(key) + "<br />");
		}
		*/
		
		try {
			String sign64 = request.getParameter("sign");
			String token64 = request.getParameter("token");
			
			log.debug(sign64);
			log.debug(token64);

			
			ServletContext servletContext = request.getSession().getServletContext();
			WebApplicationContext ctx = 
				WebApplicationContextUtils.getWebApplicationContext(servletContext);
			
			String fileNameCert = (String) ctx.getBean("fileNameCert");
			log.debug("Nombre del archivo de firma: " + fileNameCert);
			
			
			// es un request hecho por la afip? 
			boolean valido = verificar(fileNameCert, sign64, token64);
			if (!valido) {
				response.getWriter().append("<h1>error al verificar datos</h1>");
				return;
			}
			
			log.debug("Datos verificados exitosamente");
//			log.debug("Test verificar datos invalidos devuelve: " + verificar("ee"+sign64, "67%$"+token64));
//			log.debug("Test verificar datos invalidos devuelve: " + verificar("xx"+sign64, token64));
//			log.debug("Test verificar datos invalidos devuelve: " + verificar(sign64, "($·3"+token64));
			
			// parseamos el xml para extaer los cuit
			StringBuilder cuitPrincipal = new StringBuilder();
			StringBuilder csvCuitRel = new StringBuilder();
			boolean okxml = parsedata(token64, cuitPrincipal, csvCuitRel);
			
			if (!okxml) {
				response.getWriter().append("<h1>error al parsear datos</h1>");
				return;				
			}
			
			log.info("Datos parseados exitosamente");
			
			log.debug("cuitPrincipal: " + cuitPrincipal.toString());
			log.debug("listCuitRel: " + csvCuitRel.toString());
			
			// preparamos el forward a gestion por contribuyente
			request.setAttribute("cuitPrincipal", cuitPrincipal.toString());
			request.setAttribute("listCuitRel", csvCuitRel.toString());

			request.getSession().setAttribute("cuitPrincipal", cuitPrincipal.toString());
			request.getSession().setAttribute("listCuitRel", csvCuitRel.toString());

			// if envian parametros tomamos esos en vezde los del token.
			// en ese caso el token y sign solo se usa para autenticar el mensaje.
			String paramCuitPrincipal = request.getParameter("cuitPrincipal"); 
			if (paramCuitPrincipal != null && !paramCuitPrincipal.isEmpty()) {
				request.setAttribute("cuitPrincipal", request.getParameter("cuitPrincipal"));
				request.setAttribute("listCuitRel", request.getParameter("listCuitRel"));
			}
			
			// forward a gestion del contribuyente
			request.getRequestDispatcher("/ext/init1.htm").forward(request, response);			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			response.sendError(500);
		}
	}

	
	private boolean verificar(String fileNameCert, String sign64, String data64) throws Exception {
//		String certFilename = "/mnt/padron_proveedores/authhomo-external-signing.crt";
//		URL url2 = ClassLoader.getSystemResource("authhomo-external-signing.crt");

		URL url = getClass().getClassLoader().getResource(fileNameCert);
//		URL url = getClass().getClassLoader().getResource("authhomo-external-signing.crt");
		
		File c = new File(url.toURI());
		
		byte[] sign = Base64.decodeBase64(sign64.getBytes("ISO-8859-1"));
		byte[] data = Base64.decodeBase64(data64.getBytes("ISO-8859-1"));
		
		RandomAccessFile f = new RandomAccessFile(c, "r");
//		RandomAccessFile f = new RandomAccessFile(certFilename, "r");
		byte[] cert = new byte[(int)f.length()];
		f.read(cert);
		f.close();

		X509Certificate certificado = X509Certificate.getInstance(cert);

		PublicKey pubkey = certificado.getPublicKey();
		
		Signature sig = Signature.getInstance("SHA1withRSA");

		sig.initVerify(pubkey);
		sig.update(data);

		return sig.verify(sign);
	}
	
	private boolean parsedata(String token64, StringBuilder cuitPrincipal, StringBuilder csvCuitRel) {
		
		String xml = "";
		try {			
			xml = new String(Base64.decodeBase64(token64.getBytes("ISO-8859-1")));
			
			log.info("XML: " + xml);
			
			Document document = DocumentHelper.parseText(xml);
			Element e = document.getRootElement();
			Element operation = e.element("operation");
			Element login = operation.element("login");
			Attribute uid = login.attribute("uid"); 	// cuit de la persona logueada
			
			log.debug("uid: " + uid.getValue());
			
			cuitPrincipal.append(uid.getValue());
			
			Element relations = login.element("relations");
			for(Iterator<Element> rel = relations.elementIterator(); rel.hasNext();) {
				Element r = rel.next();
				Attribute key = r.attribute("key");
				log.debug("key: " + key.getValue());
				csvCuitRel.append("," + key.getValue());
			}
			
			if (csvCuitRel.length() > 0) {
				csvCuitRel.deleteCharAt(0); // sacamos primer ","
			}
			
			return true;
		} catch (Exception e) {
			log.error("Error parseando datos enviados: " + xml, e);
			
			return false;
		}
		
	}
	
	
	
}
