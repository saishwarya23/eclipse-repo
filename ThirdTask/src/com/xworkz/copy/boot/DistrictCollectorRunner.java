package com.xworkz.copy.boot;

import com.xworkz.copy.things.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector collectorData=new DistrictCollector();
		
		System.out.println( collectorData.name);
		System.out.println( collectorData.age);
		System.out.println( collectorData.district);
		System.out.println( collectorData.batchNo);
		
		collectorData.name="Veena S";
		collectorData.age=23;
		collectorData.district="Shimoga";
		collectorData.batchNo=68;
		
		System.out.println(collectorData.name);
		System.out.println(collectorData.age);
		System.out.println(collectorData.district);
		System.out.println(collectorData.batchNo);
		
	}

}
