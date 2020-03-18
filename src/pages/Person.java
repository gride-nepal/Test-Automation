package pages;

import java.util.List;

public class Person {
	
	String name ="Andy", Name ="Sandy", NAME = "Mandy";
	
	int age ;
	
	boolean goesToSchool;
	double earning;
	int jj = 0;
	
	
	public int anyNewMethod(int age) {
		if(age > 18) {
			return age;
		}else {
			return 0;
		}
	}
	
	public void anyMethod(String name ,int age) {
		/*One way of casting from one data type
		to other data type*/
		String car1 = "Volvo";
		String car2 ="Honda";
		String car3 = "Ford";
		String car4 = "Mazda";
		//ARRAYS  				{0,1,2,3}
		String[] carlist = {car1, car2, car3, car4};
		
		int[][] miles = {{2,4},{3,5}};
		
		//FOR LOOP USING ARRAY
		for (String mile : carlist) {
			System.out.println(mile);
			//miles
		}
		
		
		
		// Outputs Volvo
		
		//BREAK WITHOUT INCREMENT FOR INISITAL COUNTER FOR LOOP
		for (int ii = 0; ii < 10;) {
			
			
			  if (jj == 4) {
				 // System.out.println(ii+"          "+jj);
			    break;
			  }
			  System.out.println(ii+"          "+jj);
			  jj++;
			}
		
		//FOR EACH
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		 System.out.println("=======================================");
		 
		 //WHILE LOOP
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		 System.out.println("=======================================");
		 
		 //DO WHILE LOOP
		int j = 0;
		do {
		  System.out.println(j);
		  j++;
		}
		while (j < 5);
		
		 System.out.println("=======================================");
		
		 //SWITCH CONDITION
		String device = "ANDRID";
		
		switch (device) {
		
		case "APPLE":
			System.out.println("APPLE");
			break;
			
		case "ANDROID":
			System.out.println("ANDROID");
			break;
			
		default:
			System.out.println("UNKNOWN");
			break;
			
		}
		
		
		
		
		
		
		
		
		//FOR LOOP
		 for (int x = 20 ; x >= 10 ;x--) {
			 
				//System.out.println( "====== "+x);
				
			 }
	
		//IF CONDITION
		 
//		String fname = "KS123456UI0000RRR555";
//		String initialN = "d";
//		
//		if(fname.length() > 0) {
//			System.out.println(" =====IF=== "+fname);
//			
//			
//			String[] stringList = fname.split("KS") ;
//			
//		
//		 
//		}
		
//		if(x == 3) {
//			System.out.println("=====IF=== "+x);
//		}else if(x > 3) {
//			System.out.println("===ELSE==IF=== "+x);
//		}else {
//			//
//			System.out.println("=====ELSE=== "+x);
//		}
//		
		
		
		
		
		
		
		
		
	}
	
	
}



