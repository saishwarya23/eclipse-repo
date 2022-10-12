package com.xworkz.copy.boot;

import com.xworkz.copy.things.Cigaratte;

public class CigaratteRunner {

	public static void main(String[] args) {
		
		Cigaratte cigaratteData=new Cigaratte();
		
		System.out.println(cigaratteData.color);
		System.out.println(cigaratteData.name);
		System.out.println(cigaratteData.brand);
		System.out.println(cigaratteData.founder);
		System.out.println(cigaratteData.price);
		System.out.println(cigaratteData.type);
		System.out.println(cigaratteData.quantity);
		System.out.println(cigaratteData.Manufacturer);
		System.out.println(cigaratteData.companyName);
		
		System.out.println("**************************");
		
		cigaratteData.flavour="Tobacco";
		System.out.println(cigaratteData.flavour);
		cigaratteData.smell="bad";
		System.out.println(cigaratteData.smell);
		cigaratteData.shopName="Shilpa Shop";
		System.out.println(cigaratteData.shopName);
		cigaratteData.manufactureDate="01 jan 2021";
		System.out.println(cigaratteData.manufactureDate);
		cigaratteData.ownerName="Ramesh";
		System.out.println(cigaratteData.ownerName);
		cigaratteData.quality=false;
		System.out.println(cigaratteData.quality);
		cigaratteData.expiryDate="01 june 2021";
		System.out.println(cigaratteData.expiryDate);
		cigaratteData.taste=false;
		System.out.println(cigaratteData.taste);
		cigaratteData.country="India";
		System.out.println(cigaratteData.country);
	}

}
