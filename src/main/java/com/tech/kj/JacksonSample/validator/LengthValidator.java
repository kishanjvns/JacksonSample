package com.tech.kj.JacksonSample.validator;

import java.util.Locale;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LengthValidator implements ConstraintValidator<CheckLength, String> {
	protected String length;
	@Override
	public void initialize(CheckLength constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
		this.length=constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {		
		System.out.println(context.buildConstraintViolationWithTemplate(length));
		System.out.println(Locale.getDefault());
		if(value.length()<=Integer.valueOf(length))
			return true;
		return false;
	}

	

}
