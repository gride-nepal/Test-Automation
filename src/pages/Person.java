package pages;

public class Person {
	
	String name ="Andy", Name ="Sandy", NAME = "Mandy";
	int age ;
	
	

	
//	boolean goesToSchool;
//	double earning;
	
	public void anyMethod(String name ,int age) {
		/*One way of casting from one data type
		to other data type*/
		int abc = 24;
		int c = 2;
		abc--;
		System.out.println(abc);
		
		double xy = abc;
		
		/*Second way of casting from one data type
		to other data type*/
		double orderTotal = 500.98;
		int xyz = (int) orderTotal;
		
		String hobby = "Football";
		
		System.out.println("My name is "+name + " and I am "+age);
	
		hobby = "Basketball";
		
		System.out.println(hobby);
		orderTotal = 100.98;
		//return orderTotal;
	}
	
	
}



