package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("");
		
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("");
		
		WebElement login = driver.findElement(By.linkText("Log In"));
		login.click();	
		}

}
