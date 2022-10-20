package com.cafe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cafe.model.Coffee;

@Repository
public interface CoffeeRepository extends JpaRepository <Coffee,Integer>{                //this class is used to provide connection to the database

    List<Coffee> findByCoffeeType(String coffeeType);        //creation of findByCoffeeType(which is not available in jpa repository) method to connect with db

    //query is used to print all the coffees whose price less than any specific amount
	@Query(value="select * from Coffee where coffee_Price<= ?1" , nativeQuery = true)
	List<Coffee> findByCoffeePrice(int coffeePrice);                                      //creation of findByCoffeePrice method to connect with db

	List<Coffee> findByCoffeeName(String coffeeName);                                     //creation of findByCoffeeName method to connect with db

	List<Coffee> findByCoffeeSize(String coffeeSize);                                     //creation of findByCoffeeSize method to connect with db

}
