package ar.gov.rosario.administracionweb.utils;



import java.net.Authenticator;
import java.net.PasswordAuthentication;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class ProxyAuthenticator extends Authenticator {

	/** */
    private static final Logger log = Logger.getLogger(ProxyAuthenticator.class);
    
    /** */
    private static final String IP_INTERNA = "192.168.";
    
    /** */
    private String user, password;

    /** */
    public ProxyAuthenticator() {
    	
    }
    
    /**
     * @param request
     * @return
     * Metodo que devuelve la ip para los servidores con nginx que es lo que se esta usando
     * a diferencia de como se usan en otros proyectos con apache request.getLocalAddr();
     */
    public static String getAddress(HttpServletRequest request){
    	String add = request.getHeader("X-Forwarded-For");
    	if(add == null){
    		return request.getRemoteAddr();
    	}else{
    		return add;
    	}
    }
    
    /**
     * @param ip
     * @return
     */
    public static boolean isInterna(String ip) {
        log.info("entrando a isInterna ...");
        boolean isInterna = false;
        if (ip != null) {
            isInterna = ip.indexOf(IP_INTERNA) >= 0;
        } else {
            log.warn("ip invalida: " + ip);
        }
        if (log.isDebugEnabled()) {
            log.debug("usuario interno: " + isInterna + ", ip: " + ip);
        }
        log.info("saliendo de isInterna ...");
        return isInterna;
    }
    
    /**
     * @param user
     * @param password
     */
    public ProxyAuthenticator(String user, String password) {
        this.user = user;
        this.password = password;
    }

    /**
     */
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(user, password.toCharArray());
    }
}
