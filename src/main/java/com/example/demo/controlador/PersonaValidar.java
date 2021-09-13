package com.example.demo.controlador;

import org.springframework.validation.*;
import java.util.regex.*;

public class PersonaValidar implements Validator {

	/**
	 * IMPLEMENTACION DE LOS METODOS
	 */
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private Pattern pattern;
	private Matcher matcher;

	/**
	 * 
	 * @param type
	 */
	@Override()
	public boolean supports(Class<?> type) {
		// TODO - implement PersonaValidar.supports
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param edad
	 * @param errors
	 */
	private void validarEdad(int edad, Errors errors) {
		// TODO - implement PersonaValidar.validarEdad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 * @param errors
	 */
	@Override()
	public void validate(Object o, Errors errors) {
		// TODO - implement PersonaValidar.validate
		throw new UnsupportedOperationException();
	}

	

}