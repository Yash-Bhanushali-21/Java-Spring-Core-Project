package com.yash.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApp {

	public static void main(String[] args) {
		//get the config file instead of xml file context.
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		
		ComponentAnnotationBean c = context.getBean("componentAnnotationBean",ComponentAnnotationBean.class);
		
		c.testRun();
		
		context.close();
		

	}

}
