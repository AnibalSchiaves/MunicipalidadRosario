package ar.gov.rosario.administracionweb.controller;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.gov.rosario.administracionweb.core.DomicilioManager;
import ar.gov.rosario.administracionweb.core.PersonaWSManager;
import ar.gov.rosario.administracionweb.ws.persona.model.Localidad;
import ar.gov.rosario.administracionweb.ws.ubicacion.model.Calle;



@Controller
@RequestMapping("/domicilio")
public class DomicilioController implements Serializable {

	private static Logger logger = LoggerFactory.getLogger(DomicilioController.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6032596830403769752L;


	
	@Autowired
	private PersonaWSManager personaWSManager;

	@Autowired
	private DomicilioManager domicilioManager;
	
	 
	
    @RequestMapping(value = "/searchLocalidad")
    @ResponseBody
    public List<Localidad> seachLocalidad(@RequestParam("q") String localidad) {

    	logger.debug("Buscando localidad: " + localidad);
    	List<Localidad> list = personaWSManager.getAllLocalidad(localidad.toUpperCase());
    	
    	logger.debug("Encontradas: " + list.size());
    	
    	return list;
    }

    @RequestMapping(value = "/searchCalle")
    @ResponseBody
    public List<Calle> seachCalle(@RequestParam("q") String calle) {
    	
    	logger.debug("Buscando calle: " + calle);
    	List<Calle> list = domicilioManager.getAllCalle(calle.toUpperCase());
    	
    	logger.debug("Encontradas: " + list.size());
    	
    	return list;
    }
    

  
  
}
