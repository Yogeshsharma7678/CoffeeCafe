/*This is the main class of basic spring boot jpa project 
  which is named as CoffeeCafe and written by 
  Yogesh Sharma
 */
package com.cafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//this annotation describes that our application is spring boot application
@SpringBootApplication
public class CoffeeCafeApplication {

	public static void main(String[] args) {
		//
		SpringApplication.run(CoffeeCafeApplication.class, args);
	}

}
