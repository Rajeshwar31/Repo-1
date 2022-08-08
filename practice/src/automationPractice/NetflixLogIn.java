package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogIn {

	public static void main(String[] args) throws InterruptedException {

		
	
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
			
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			
			driver.get("https://www.netflix.com/in/login?nextpage=https%3A%2F%2Fwww.netflix.com%2Fbrowse");
			
			
		WebElement userName = driver.findElement(By.id("id_userLoginId"));
		userName.sendKeys("day33ndh@kjain786.com");
		
		
		WebElement password = driver.findElement(By.id("id_password"));
		password.sendKeys("152607");
		
		
		
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/form/button"));
		loginButton.click();		
		
		WebElement rupesh = driver.findElement(By.xpath("//html//a//div//div)[2]"));
		rupesh.click();
		
	}

}
