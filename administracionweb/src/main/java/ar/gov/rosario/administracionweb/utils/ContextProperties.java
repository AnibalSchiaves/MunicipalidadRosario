package ar.gov.rosario.administracionweb.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ContextProperties {

    /** */
    private static Log log = LogFactory.getLog(ContextProperties.class);
    
	/** */
	private static final String INITIAL_CONTEXT = "java:comp/env/";
	
	/** */
	private static Context context;
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public static synchronized String getProperty(String property) {
		if (context == null) {
			Context initialContext;
			try {
				initialContext = new InitialContext();
				context = (Context) initialContext.lookup(INITIAL_CONTEXT);
			} catch (NamingException e) {
				log.error(e, e);
			}	
		}
		String value = null;	
		try {
			value = (String) context.lookup(property);
		} catch (NamingException e) {
			log.error(e, e);
		}
		return value;
	}

    /**
     * @throws Exception
     */
    private ContextProperties() {
        /* NULL */
    }
}
