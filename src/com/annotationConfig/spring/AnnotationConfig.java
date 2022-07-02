package com.annotationConfig.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 This file is like applicationContext.xml file for beans, only with pure Java configuration in play.
 */
@Configuration
@ComponentScan("com.annotationConfig.spring")
public class AnnotationConfig {
	
	
}
