/*its a model class to declare all the variable
 * which are gonna used in further program
 */
package com.cafe.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {

	@Id
	private int coffeeId;
	private String coffeeName;
	private String coffeeSize;
	private String coffeeType;
	private int coffeePrice;
	private int coffeeAvail;
	
}
