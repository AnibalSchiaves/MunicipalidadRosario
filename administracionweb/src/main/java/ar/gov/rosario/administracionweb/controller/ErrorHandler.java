package ar.gov.rosario.administracionweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorHandler {
	
	private static Logger logger = LoggerFactory.getLogger(ErrorHandler.class);

    public ErrorHandler() {
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception e) {
    	ModelAndView model = new ModelAndView("error");
    	model.addObject("message", e.getMessage());
    	e.printStackTrace();//Quitar
    	logger.error(e.getMessage());
    	return model;

    }

}