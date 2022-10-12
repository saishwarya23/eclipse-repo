package com.xworkz.copy.boot;

import com.xworkz.copy.things.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus busData=new Bus();
		
		System.out.println(busData.busNo);
		System.out.println(busData.starting);
		System.out.println(busData.destination);
		
		busData.busNo=23;
		busData.starting="Shimoga";
		busData.destination="Bangalore";
		
		System.out.println(busData.busNo);
		System.out.println(busData.starting);
		System.out.println(busData.destination);
	}
}
