package ar.gov.rosario.administracionweb.ws.tramitesweb.client;

import java.util.Iterator;

import javax.xml.transform.dom.DOMResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapFaultDetailElement;
import org.springframework.ws.soap.client.SoapFaultClientException;

import ar.gov.rosario.administracionweb.ws.tramitesweb.model.AuditarTramiteWebRequest;
import ar.gov.rosario.administracionweb.ws.tramitesweb.model.AuditarTramiteWebResponse;



public class TramiteswebClient  extends WebServiceGatewaySupport{
	
	
	private static Logger log = LoggerFactory.getLogger(TramiteswebClient.class);
		
     
    
    public AuditarTramiteWebResponse callAuditarTramiteWeb(AuditarTramiteWebRequest request)   {
    	
    	
    	log.debug("Iniciando llamada al servicio auditarTramiteWeb");
    	AuditarTramiteWebResponse res = null;
    	try {
			
    		
    		res = (AuditarTramiteWebResponse)
    				super.getWebServiceTemplate().marshalSendAndReceive(request); 
			
				
			log.debug("Se efectuo correctamente la llamada al servicio");
			if (!res.isResultado()){
				log.error("Error interno del servicio" );
				throw new RuntimeException("Error interno del servicio");
			}
			
			
			
    	} catch (SoapFaultClientException e1) {
    		if (e1.getSoapFault().getFaultDetail() != null) {
	    		Iterator<SoapFaultDetailElement> d = e1.getSoapFault().getFaultDetail().getDetailEntries();
	    		while (d.hasNext()){
	    			log.error(((DOMResult)d.next().getResult()).getNode().getTextContent());
	    		}
    		}
    		log.error("Falla respuesta del servicio ", e1 );
    		throw new RuntimeException("Falla respuesta del servicio ", e1);
    		
    		
    		
    	} catch (Exception e2) {
    		log.error("Hubo problemas al intentar llamar al servicio ", e2 );
    		throw new RuntimeException("Falla respuesta del servicio ", e2);
    		
    		
    		
    	} 
    	return res;
    	
    	
    }
    
	

}
