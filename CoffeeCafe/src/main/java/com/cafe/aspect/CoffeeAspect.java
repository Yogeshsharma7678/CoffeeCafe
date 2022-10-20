package com.cafe.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CoffeeAspect {                //aspect class to print some lines in console without touching the method whenever method executes 

	private static final Logger log=LoggerFactory.getLogger(CoffeeAspect.class);
	
	@Before("execution (public * com.cafe.controller.CoffeeController.getAllCoffee())")      //to print just before the execution of getAllCoffee method
	public void logBeforeCoffee() {
		log.info("Getting coffees....");
}

	@After("execution (public * com.cafe.controller.CoffeeController.getAllCoffee())")       //to print just after the execution of getAllCoffee method
	public void logAfterCoffee() {
		log.info("Coffees are appeared");
}
	
	@Before("execution (public * com.cafe.controller.CoffeeController.getCoffeeByName())")   //to print just before the execution of getCoffeeByName method
	public void logBeforeCoffeeAddAll() {
		log.info("Getting Coffees by name....");
}

	@After("execution (public * com.cafe.controller.CoffeeController.getCoffeeByName())")     //to print just after the execution of getCoffeeByName method
	public void logAfterCoffeeAddAll() {
		log.info("Coffee are Appeared");
}
}