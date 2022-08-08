package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogIn 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in");
		WebElement signinButton = driver.findElement(By.linkText("Sign in"));
		signinButton.click();
		Thread.sleep(3000);
		
		
		WebElement emailId = driver.findElement(By.id("ap_email"));
		emailId.sendKeys("rchaudhari990@gmail.com");
		Thread.sleep(3000);
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Rajeshwar@1");
		
		WebElement submitButton = driver.findElement(By.id("signInSubmit"));
		submitButton.click();
	}

}
