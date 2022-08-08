package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyLogIn {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://accounts.spotify.com/en/login");
		
		
	WebElement userName = driver.findElement(By.id("login-username"));  //Storing the find element method in WebElement Interface.
	
	
		userName.sendKeys("rchaudhari990@gmail.com"); //calling the sendkeys method which is of WebElement interface. for user name.
	
	
		WebElement password = driver.findElement(By.id("login-password"));
		
		password.sendKeys("rupesh31"); // here we are providing the password.
		
		Thread.sleep(5000);
		
		
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
	}

}
