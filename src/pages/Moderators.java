package pages;

import com.nationwide.www.Vendor;

public class Moderators extends Vendor{
	UserProfile up = new UserProfile();

	public String getmyusername(String username) {
		return "NW"+username;
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	 class UserProfile{
		
		
		public void doSomething() {
			
			System.out.println("DOING SOMETHING");
			
		}
		
		public void triggerDoSomeThing() {
			
			doSomething();
			
			System.out.println(getmyusername("ANDY"));
			
		}
		
	}
	
	
 class SocialProfile{
		
	
		
		
	}
	

}
