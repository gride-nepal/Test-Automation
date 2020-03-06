package pages;

public class Home {
	
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		Person person1 = new Person();
		//person1.age = 15;
		
		
		Person person2 = new Person();
		person2.name="Mandy";
		person2.age = 24;
		
		System.out.println(person1.name);
		
		
		person1.anyMethod(person2.name,person1.age+person2.age);

	}

}
