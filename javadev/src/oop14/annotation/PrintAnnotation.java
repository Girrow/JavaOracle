package oop14.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
