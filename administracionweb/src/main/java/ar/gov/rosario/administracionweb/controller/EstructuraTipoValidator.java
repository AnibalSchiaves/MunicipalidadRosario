package ar.gov.rosario.administracionweb.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ar.gov.rosario.administracionweb.core.EstructuraTipoManager;
import ar.gov.rosario.administracionweb.form.ABMForm;
import ar.gov.rosario.administracionweb.form.EstructuraTipoForm;
import ar.gov.rosario.administracionweb.model.EstructuraTipo;

public class EstructuraTipoValidator implements Validator {
	
	EstructuraTipoManager estructuraTipoManager;
	
	public EstructuraTipoValidator(EstructuraTipoManager manager) {
		estructuraTipoManager = manager;
	}

	@Override
	public boolean supports(Class<?> arg0) {
		//return EstructuraTipoForm.class.equals(arg0);
		return true;
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		EstructuraTipoForm form = (EstructuraTipoForm) arg0;
		if (form.getModo().equals(ABMForm.ELIMINACION)) {
			if (this.estructuraTipoManager.datosRelacionados(estructuraTipoManager.selectById(form.getId()))) {
				errors.reject("validacion.eliminar.registrorelacionado");
			}
		} else {
			if (form.getId()==null || form.getId()==0) {
				errors.reject("validation.codido.empty");
			} else {
				if (form.getModo().equals(ABMForm.ALTA)) {
					EstructuraTipo e = estructuraTipoManager.selectById(form.getId());
					if (e!=null)
						errors.reject("validation.estructuratipo.duplicado");
				}
			}
			if (form.getDescripcion()==null || form.getDescripcion().isEmpty()) {
				errors.reject("validation.descripcion.empty");
			}
		}
	}

}
