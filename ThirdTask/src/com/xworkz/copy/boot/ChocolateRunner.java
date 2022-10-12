package com.xworkz.copy.boot;

import com.xworkz.copy.things.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		Chocolate chocolateData=new Chocolate();
		
		
		System.out.println(chocolateData.name);
		System.out.println(chocolateData.brand);
		System.out.println(chocolateData.price);
		System.out.println(chocolateData.flavour);
		
		chocolateData.name="Dairy Milk";
		chocolateData.brand="Cadbury";
		chocolateData.price=180;
		chocolateData.flavour="Roasted Almond";
		

		System.out.println(chocolateData.name);
		System.out.println(chocolateData.brand);
		System.out.println(chocolateData.price);
		System.out.println(chocolateData.flavour);
		
	}

}
