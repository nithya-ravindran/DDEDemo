package com.horizon.dde.app.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.horizon.dde.app.Formatter.BaseFormatter;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD })
public @interface DDEFormat {
	Class formatterType() default BaseFormatter.class;
	String formatterMethod() default "";
	
}
