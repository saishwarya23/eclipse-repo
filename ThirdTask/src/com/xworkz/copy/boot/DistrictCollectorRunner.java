package com.xworkz.copy.boot;

import com.xworkz.copy.things.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector name1=new DistrictCollector();
		DistrictCollector age1=new DistrictCollector();
		DistrictCollector district1=new DistrictCollector();
		DistrictCollector no=new DistrictCollector();
		
		System.out.println(name1.name);
		System.out.println(age1.age);
		System.out.println(district1.district);
		System.out.println(no.batchNo);
		
		name1.name="Veena S";
		age1.age=23;
		district1.district="Shimoga";
		no.batchNo=68;
		
		System.out.println(name1.name);
		System.out.println(age1.age);
		System.out.println(district1.district);
		System.out.println(no.batchNo);
		
	}

}
