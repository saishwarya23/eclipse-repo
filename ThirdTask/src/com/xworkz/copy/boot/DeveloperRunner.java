package com.xworkz.copy.boot;

import com.xworkz.copy.things.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		 Developer name1=new  Developer();
		 Developer qualification=new  Developer();
		 Developer expInYears=new  Developer();
		 Developer sal=new  Developer();
		 Developer companyName=new  Developer();
		 
		 System.out.println(name1.name);
		 System.out.println(qualification.education);
		 System.out.println(expInYears.experience);
		 System.out.println(sal.salary);
		 System.out.println(companyName.company);

		 name1.name="Shilpa U";
		 qualification.education="B.E in EEE";
		 expInYears.experience=1;
		 sal.salary=30000;
		 companyName.company="Brighosha";
		 
		 System.out.println(name1.name);
		 System.out.println(qualification.education);
		 System.out.println(expInYears.experience);
		 System.out.println(sal.salary);
		 System.out.println(companyName.company);


	}

}
