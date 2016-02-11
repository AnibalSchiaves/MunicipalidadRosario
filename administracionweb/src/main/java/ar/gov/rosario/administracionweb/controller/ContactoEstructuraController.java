package ar.gov.rosario.administracionweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ar.gov.rosario.administracionweb.core.AbmManager;
import ar.gov.rosario.administracionweb.core.ContactoEstructuraManager;
import ar.gov.rosario.administracionweb.form.ABMForm;
import ar.gov.rosario.administracionweb.form.ContactoEstructuraForm;
import ar.gov.rosario.administracionweb.model.ContactoEstructura;

@Controller
@RequestMapping("/contactoestructura")
public class ContactoEstructuraController extends
		ABMController<ContactoEstructura, ContactoEstructuraForm> {
	
	@Autowired
	private ContactoEstructuraManager contactoEstructuraManager; 
	
	@Override
	protected Validator getValidator() {
		return new ContactoEstructuraValidator(this.contactoEstructuraManager); 
	}

	@Override
	protected String getPageInit() {
		return "contactoestructura/list";
	}

	@Override
	protected String getPageEdit() {
		return "contactoestructura/edit";
	}

	@Override
	protected ABMForm getABMForm() {
		return new ContactoEstructuraForm();
	}

	@Override
	protected String getUsuario() {
		return "Anibal";
	}

	@Override
	protected AbmManager getABMManager() {
		return this.contactoEstructuraManager;
	}

	@Override
	protected String getTituloGrilla() {
		return "ABM Contactos Estructura";
	}

}
