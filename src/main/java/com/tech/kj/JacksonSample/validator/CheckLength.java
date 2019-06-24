package com.tech.kj.JacksonSample.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { LengthValidator.class })
@Documented
public @interface CheckLength {

	String message() default "{org.hibernate.validator.referenceguide.chapter06.CheckCase.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String value() default"{field.length}";
}
