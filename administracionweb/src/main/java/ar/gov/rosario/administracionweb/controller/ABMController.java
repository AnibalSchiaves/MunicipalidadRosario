package ar.gov.rosario.administracionweb.controller;

import java.lang.reflect.ParameterizedType;

import javax.validation.Valid;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ar.gov.rosario.administracionweb.core.AbmManager;
import ar.gov.rosario.administracionweb.form.ABMForm;
import ar.gov.rosario.administracionweb.model.Entidad;

@SessionAttributes("form")
public abstract class ABMController<E extends Entidad, F extends ABMForm> {
	
	@Autowired
	private Mapper mapper;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(getValidator());
	}
	
	protected abstract Validator getValidator();
	
	protected void actualizarLista(Model model) {
		model.addAttribute("listaInicial", getABMManager().selectAll());
	}
	
	@RequestMapping(value="/init.htm")
	public String init(Model model) {
		this.actualizarLista(model);
		model.addAttribute("tituloGrilla",getTituloGrilla());
		return getPageInit();
	}
	
	@RequestMapping(value="/nuevo.htm")
	public String nuevo(Model model) {
		
		model.addAttribute("modo", ABMForm.ALTA);
		ABMForm form = getABMForm();
		form.setModo(ABMForm.ALTA);
		model.addAttribute("form", form);
		return getPageEdit();
	}
	
	@RequestMapping(value="/editar.htm")
	public String editar(Model model, @RequestParam String id) {
		Integer idI = Integer.valueOf(id);
		E edit = (E) getABMManager().selectById(idI);
		Class<F> classForm = (Class<F>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		ABMForm form = this.mapper.map(edit, classForm);
		form.setModo(ABMForm.EDICION);
		model.addAttribute("form", form);
		model.addAttribute("modo", ABMForm.EDICION);
		return getPageEdit();
	}
	
	@RequestMapping(value="/confirmarEliminar.htm")
	public String confirmarEliminar(Model model, @RequestParam String id) {
		Integer idI = Integer.valueOf(id);
		E edit = (E) getABMManager().selectById(idI);
		Class<F> classForm = (Class<F>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		ABMForm form = this.mapper.map(edit, classForm);
		form.setModo(ABMForm.ELIMINACION);
		model.addAttribute("form", form);
		model.addAttribute("modo", ABMForm.ELIMINACION);
		return getPageEdit();
	}
	
	@RequestMapping(value="/guardar.htm")
	//public String guardar(Model model, @Valid @ModelAttribute("form") ABMForm form, BindingResult result) {
	public String guardar(Model model, @Valid @ModelAttribute("form") F form, BindingResult result) {
		boolean exito = false;
		
		model.addAttribute("modo",form.getModo());
		if (!result.hasErrors()) {
			Class<E> classE = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
			E nuevo = (E) this.mapper.map(form, classE);
			nuevo.setUsuario(getUsuario());
			getABMManager().save(nuevo);
			exito = true;
			this.actualizarLista(model);
			model.addAttribute("modo", ABMForm.CONSULTA);
		}
		model.addAttribute("exitoGuardar", exito);
		return exito?getPageInit():getPageEdit();
	}
	
	@RequestMapping(value="/eliminar.htm")
	//public String eliminar(Model model, @Valid @ModelAttribute("form") ABMForm form, BindingResult result) {
	public String eliminar(Model model, @Valid @ModelAttribute("form") F form, BindingResult result) {
		boolean exito = false;
		model.addAttribute("modo", ABMForm.ELIMINACION);
		if (!result.hasErrors()) {
			Class<E> classE = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
			E borrar = (E) this.mapper.map(form, classE);
			getABMManager().delete(borrar);
			exito = true;
			this.actualizarLista(model);
			model.addAttribute("modo", ABMForm.CONSULTA);
		}
		model.addAttribute("exitoEliminar", exito);
		return exito?getPageInit():getPageEdit();
	}
	
	protected abstract String getPageInit();
	
	protected abstract String getPageEdit();
	
	protected abstract ABMForm getABMForm();
	
	protected abstract String getUsuario();
	
	protected abstract AbmManager getABMManager();
	
	protected abstract String getTituloGrilla();

}
