package com.cafe.controller;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.model.Coffee;
import com.cafe.service.CoffeeService;

@RestController
public class CoffeeController {                                    //controller class to control all methods of service class

	@Autowired
	private CoffeeService service;
	
	@RequestMapping(method = RequestMethod.POST,value = "/coffee")
	public String addCoffee(@RequestBody Coffee c1) {                //method to add one coffee
		
		return service.addCoffee(c1);

	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/coffee/AllAdded")   //method to add many coffees in one call
	public String addAllCoffee(@RequestBody List<Coffee> cl){
		
		return service.addAllCoffee(cl);
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/coffee/AllCoffee")    //method to get all the coffees available at cafe
	public List<Coffee> getAllCoffee(){
		
			return service.getAllCoffee();	
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/coffee/Id/{coffeeId}")   //method to get any specific coffee details by id
	public Optional<Coffee> getCoffeeById(@PathVariable int coffeeId) {
		
		return service.getCoffeeById(coffeeId);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/coffee/coffeeType/{coffeeType}")  //method  to get any specific coffee by coffee Type
	public List<Coffee> getCoffeeByType(@PathVariable String coffeeType){
		
		return service.getCoffeeByType(coffeeType);
    }
	
	@RequestMapping(method = RequestMethod.GET , value = "/coffee/coffeePrice/{coffeePrice}")   //method to get any type of coffee on the basis of price
	public List<Coffee> getCoffeeByPrice(@PathVariable int coffeePrice){
		
		return service.getCoffeeByPrice(coffeePrice);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/coffee/coffeeName/{coffeeName}")     //method to get any coffee with thier name
	public List<Coffee> getCoffeeByName(@PathVariable String coffeeName){
		
		return service.getCoffeeByName(coffeeName);
	}
	
	@RequestMapping(method = RequestMethod.GET , value ="/coffee/coffeeSize/{coffeeSize}")      //method to get coffee by the coffee size
    public List<Coffee> getCoffeeBySize(@PathVariable String coffeeSize){
		
		return service.getCoffeeBySize(coffeeSize);
	}
}
