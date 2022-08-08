package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {

		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();		
		
		driver.close();
		
		
	}

}
