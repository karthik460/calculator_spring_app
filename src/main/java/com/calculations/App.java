package com.calculations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
@SuppressWarnings("resource")
ApplicationContext context=new AnnotationConfigApplicationContext("com.calculations");
 	Calculator calc= (Calculator) context.getBean("calculator");
 	calc.compute("mul", 2, 3);
	}

}
