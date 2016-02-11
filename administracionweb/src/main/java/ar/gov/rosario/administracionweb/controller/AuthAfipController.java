package ar.gov.rosario.administracionweb.controller;

import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Iterator;

import javax.security.cert.X509Certificate;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthAfipController {

	@Autowired
	private String fileNameCert;
	
	private static final Logger log = Logger.getLogger(AuthAfipController.class); 

	

	@RequestMapping("/authAfip")
	public String validate(@RequestParam("sign") String sign64, 
			@RequestParam("token") String token64, 
			@RequestParam(value="cuitPrincipal", required=false) String cuitPrincipal,
			@RequestParam(value="listCuitRel", required=false) String listCuitRel,
			Model model,
			final RedirectAttributes redirectAttributes) {
		
		
		try {
			
			log.debug(sign64);
			log.debug(token64);
			
			log.debug("Nombre del archivo de firma: " + fileNameCert);
			
			
			// es un request hecho por la afip? 
			boolean valido = verificar(fileNameCert, sign64, token64);
			if (!valido) {
				model.addAttribute("mensaje", "error al verificar datos");
				return "errorAfip";				
			}
			
			log.debug("Datos verificados exitosamente");
//			log.debug("Test verificar datos invalidos devuelve: " + verificar("ee"+sign64, "67%$"+token64));
//			log.debug("Test verificar datos invalidos devuelve: " + verificar("xx"+sign64, token64));
//			log.debug("Test verificar datos invalidos devuelve: " + verificar(sign64, "($·3"+token64));
			
			// parseamos el xml para extaer los cuit
			StringBuilder cuitPrincipalSB = new StringBuilder();
			StringBuilder csvCuitRelSB = new StringBuilder();
			boolean okxml = parsedata(token64, cuitPrincipalSB, csvCuitRelSB);
			
			if (!okxml) {				
				model.addAttribute("mensaje", "error al parsear datos");
				return "errorAfip";				
			}
			
			log.info("Datos parseados exitosamente");			
			log.debug("cuitPrincipal: " + cuitPrincipalSB.toString());
			log.debug("listCuitRel: " + csvCuitRelSB.toString());
			
			
			// if envian parametros tomamos esos en vezde los del token.
			// en ese caso el token y sign solo se usa para autenticar el mensaje.
			redirectAttributes.addFlashAttribute("cuitPrincipal",  
					(cuitPrincipal != null) ? cuitPrincipal : cuitPrincipalSB.toString());
			redirectAttributes.addFlashAttribute("listCuitRel",   
					(listCuitRel != null)? listCuitRel : csvCuitRelSB.toString());
			
			
			// forward a gestion del contribuyente
			return "redirect:/cuits.htm";
					
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			model.addAttribute("errorAfip", e.getMessage());
			return "error";				
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
