package com.xworkz.copy.boot;

import com.xworkz.copy.things.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		
		Tea teaData;
		teaData=new Tea();
		System.out.println(teaData.color);
		System.out.println(teaData.name);
		System.out.println(teaData.flavour);
		System.out.println(teaData.shopName);
		System.out.println(teaData.ownerName);
		System.out.println(teaData.cupType);
		System.out.println(teaData.price);
		
		System.out.println("************************");
		
		teaData.type="Sugar";
		System.out.println(teaData.type);
		teaData.brand="Red Label";
		System.out.println(teaData.brand);
		teaData.fatherName="Damodardas Mulchand Modi";
		System.out.println(teaData.fatherName);
		teaData.motherName="Hiraben Modi";
		System.out.println(teaData.motherName);
		teaData.founder="Emperor Shen Nung";
		System.out.println(teaData.founder);
		teaData.quantity="By Two";
		System.out.println(teaData.quantity);
		teaData.taste=true;
		System.out.println(teaData.taste);
		teaData.teaPlantName="Camellia sinensis";
		System.out.println(teaData.teaPlantName);
		
	}

}
