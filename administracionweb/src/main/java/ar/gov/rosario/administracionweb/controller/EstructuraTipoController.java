package ar.gov.rosario.administracionweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ar.gov.rosario.administracionweb.core.AbmManager;
import ar.gov.rosario.administracionweb.core.EstructuraTipoManager;
import ar.gov.rosario.administracionweb.form.ABMForm;
import ar.gov.rosario.administracionweb.form.EstructuraTipoForm;
import ar.gov.rosario.administracionweb.model.EstructuraTipo;

@Controller
@RequestMapping("/estructuratipo")
public class EstructuraTipoController extends ABMController<EstructuraTipo, EstructuraTipoForm> {
	
	@Autowired
	private EstructuraTipoManager estructuraTipoManager;
	
	@Override
	protected String getPageInit() {
		return "estructuratipo/list";
	}

	@Override
	protected String getPageEdit() {
		return "estructuratipo/edit";
	}

	@Override
	protected ABMForm getABMForm() {
		return new EstructuraTipoForm();
	}

	@Override
	protected String getUsuario() {
		return "Anibal";
	}

	@Override
	protected Validator getValidator() {
		return new EstructuraTipoValidator(estructuraTipoManager);
	}

	@Override
	protected AbmManager getABMManager() {
		return this.estructuraTipoManager;
	}

	@Override
	protected String getTituloGrilla() {
		return "ABM Tipos de Estructuras";
	}

}
