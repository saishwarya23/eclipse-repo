package com.xworkz.copy.boot;

import com.xworkz.copy.things.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		Chocolate name1=new Chocolate();
		Chocolate brand1=new Chocolate();
		Chocolate amount=new Chocolate();
		Chocolate flavour1=new Chocolate();
		
		System.out.println(name1.name);
		System.out.println(brand1.brand);
		System.out.println(amount.price);
		System.out.println(flavour1.flavour);
		
		name1.name="Dairy Milk";
		brand1.brand="Cadbury";
		amount.price=180;
		flavour1.flavour="Roasted Almond";
		

		System.out.println(name1.name);
		System.out.println(brand1.brand);
		System.out.println(amount.price);
		System.out.println(flavour1.flavour);
		
	}

}
