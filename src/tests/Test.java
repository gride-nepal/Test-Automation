package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Firefox driver
		
	    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
		
	    System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
	 
	    
		 WebDriver driver = new ChromeDriver();
		 
		 String url = "http://qa.kolystyle.com";
	
		 
		 //Launch the Online Store Website
		 driver.get(url);
		 
		 // Print a Log In message to the screen
		 System.out.println("Successfully opened "+url);
		 
		 
		 
		 //Make FullScreen
		 
		 driver.manage().window().maximize();
		 
		 // Print a Log In message to the screen
		 System.out.println("Successfully maximized the window ");
		 
		 
		 
		 //Locator
		 /*
		  * ID
		  * CLASSNAME
		  * NAME
				 */
		WebElement searchField = driver.findElement(By.id("search-keyword"));
		searchField.sendKeys("Saree");
		
		driver.findElement(By.xpath("//*[@id='search-keyword']")).sendKeys("TEST");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).sendKeys("TEST TWO");
		 
		
		 driver.findElement(By.className("newsletteremail")).sendKeys("email@id.com");
		 
		// driver.findElement(By.name("dropdown"));
		 
		 
		
		 
		        // Close the driver
		 //       driver.quit();
		
		
	}

}


