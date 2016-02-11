package ar.gov.rosario.administracionweb.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ar.gov.rosario.administracionweb.form.ExampleForm;


public class ExampleValidator implements Validator {

	

	public ExampleValidator() {
	
	}


	@Override
	public boolean supports(Class<?> arg0) {
		return ExampleForm.class.equals(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ExampleForm exampleForm = (ExampleForm)obj;
				
	
	}
	
	




	
}
