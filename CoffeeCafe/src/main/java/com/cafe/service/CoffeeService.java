package com.cafe.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.model.Coffee;
import com.cafe.repository.CoffeeRepository;

@Service
public class CoffeeService {              //service class to save details of all the methods

	@Autowired
	private CoffeeRepository repo;
	
	public String addCoffee(Coffee c1) {               //method to save/add coffee details one by one in the database
		
		repo.save(c1);
		return "add";
	}
	
	public String addAllCoffee(List<Coffee> cl) {       //method to save/add many coffees details in the database
	
		
		repo.saveAll(cl);
		return "added";
	}
	
	public List<Coffee> getAllCoffee(){                  //method to get all the coffee details from the database

		List<Coffee> coffeeList = new ArrayList<>();
		
		 repo.findAll().forEach(coffeeList :: add);
	
		 return coffeeList;
	}
	
	public Optional<Coffee> getCoffeeById(int coffeeId) {      //method to get coffee details by Id from the database
		
		return repo.findById(coffeeId);
	}
	
	public List<Coffee> getCoffeeByType(String coffeeType){     //method to get coffees by coffee type from the database
		
		return repo.findByCoffeeType(coffeeType);

	}
	
    public List<Coffee> getCoffeeByPrice(int coffeePrice){        //method to get coffees by price from the database
		
		return repo.findByCoffeePrice(coffeePrice);
		
	}
    
    public List<Coffee> getCoffeeByName(String coffeeName){        //method to get coffee details by name from the database
    	
    	return repo.findByCoffeeName(coffeeName);
    }
    
    public List<Coffee> getCoffeeBySize(String coffeeSize){         //method to get coffees by size from the database
    	
    	return repo.findByCoffeeSize(coffeeSize);
    	
    }
}
