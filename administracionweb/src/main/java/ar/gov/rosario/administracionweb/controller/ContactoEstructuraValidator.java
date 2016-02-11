package ar.gov.rosario.administracionweb.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ar.gov.rosario.administracionweb.core.ContactoEstructuraManager;
import ar.gov.rosario.administracionweb.form.ABMForm;
import ar.gov.rosario.administracionweb.form.ContactoEstructuraForm;
import ar.gov.rosario.administracionweb.model.ContactoEstructura;

public class ContactoEstructuraValidator implements Validator {
	
	private ContactoEstructuraManager contactoEstructuraManager;
	
	public ContactoEstructuraValidator(ContactoEstructuraManager manager) {
		this.contactoEstructuraManager = manager;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		//return ContactoEstructuraForm.class.equals(clazz);
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		ContactoEstructuraForm form = (ContactoEstructuraForm) target;
		if (form.getModo().equals(ABMForm.ELIMINACION)) {
			if (this.contactoEstructuraManager.datosRelacionados(contactoEstructuraManager.selectById(form.getId()))) {
				errors.reject("validacion.eliminar.registrorelacionado");
			}
		} else {
			if (form.getId()==null || form.getId()==0) {
				errors.reject("validation.codido.empty");
			} else {
				if (form.getModo().equals(ABMForm.ALTA)) {
					ContactoEstructura e = contactoEstructuraManager.selectById(form.getId());
					if (e!=null)
						errors.reject("validation.contactoestructura.duplicado");
				}
			}
			if (form.getNombre()==null || form.getNombre().isEmpty()) {
				errors.reject("validation.apellido.empty");
			}
			if (form.getEmail()==null || form.getEmail().isEmpty()) {
				errors.reject("validation.email.empty");
			}
		}
	}

}
