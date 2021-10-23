package org.java8.evaluacion1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Product {

	private int id;
	private String name;
	private Double price;
	private Integer stock;
	
}
