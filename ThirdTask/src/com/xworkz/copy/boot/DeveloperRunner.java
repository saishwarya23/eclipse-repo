package com.xworkz.copy.boot;

import com.xworkz.copy.things.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		 Developer developerData=new  Developer();
		 
		 
		 System.out.println(developerData.name);
		 System.out.println(developerData.education);
		 System.out.println(developerData.experience);
		 System.out.println(developerData.salary);
		 System.out.println(developerData.company);

		 developerData.name="Shilpa U";
		 developerData.education="B.E in EEE";
		 developerData.experience=1;
		 developerData.salary=30000;
		 developerData.company="Brighosha";
		 
		 System.out.println(developerData.name);
		 System.out.println(developerData.education);
		 System.out.println(developerData.experience);
		 System.out.println(developerData.salary);
		 System.out.println(developerData.company);


	}

}
