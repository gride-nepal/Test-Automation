package com.nationwide.www;

public class Profile {
	
	int userid;
	String username;
	String password;
	boolean isActive;
	private int age;
	public String city;
	String phone;
	String email;
	String profileImage;
	
	
	public Profile() {
		
	}
	
	public void retriveProfileData(String calledFrom) {
		//Business Logic Here
		System.out.println("retriveProfileData FROM Profile class: "+calledFrom);
	}
	
	public void retriveProfileData(String calledFrom, int age) {
		//Business Logic Here
		System.out.println("retriveProfileData FROM Profile class: "+calledFrom);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
