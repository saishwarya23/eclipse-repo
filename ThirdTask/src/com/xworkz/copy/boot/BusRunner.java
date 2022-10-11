package com.xworkz.copy.boot;

import com.xworkz.copy.things.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus number=new Bus();
		Bus start=new Bus();
		Bus dest=new Bus();
		
		System.out.println(number.busNo);
		System.out.println(start.starting);
		System.out.println(dest.destination);
		
		number.busNo=23;
		start.starting="Shimoga";
		dest.destination="Bangalore";
		
		System.out.println(number.busNo);
		System.out.println(start.starting);
		System.out.println(dest.destination);
	}
}
