package ar.gov.rosario.administracionweb.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ar.gov.rosario.administracionweb.core.ExampleManager;
import ar.gov.rosario.administracionweb.form.ExampleForm;


@Controller
@SessionAttributes("exampleForm")
public class ExampleController {
	
	protected static final Logger logger = Logger.getLogger(ExampleController.class);


	
	@Autowired
	private ExampleManager exampleManager;
	
	@Autowired
	private Mapper mapper;
	
	
	

	@InitBinder("exampleForm")
    protected void initBinder(WebDataBinder binder) {


    	
    }
	
	
	
	
	@RequestMapping(value = "/example.htm")
	public String example(Model model) {
		
		ExampleForm exampleForm = new ExampleForm();
		model.addAttribute("exampleForm", exampleForm);
		
		return "example";
		
		
	}
	
	

	@RequestMapping(value = "/aceptarExample.htm")
	public String aceptarExample(Model model, @Valid @ModelAttribute ExampleForm exampleForm, BindingResult result) {
		
		
		if (result.hasErrors()){
			return "example";
		}
			
		
		
		return "redirect:/example.htm";
		
		
	}

}
