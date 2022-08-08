package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogIn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.linkText("Sign in"));
		button.click();
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.id("identifierId"));
		userName.sendKeys("rchaudhari990@gmail.com");
		
		
		WebElement nextButton = driver.findElement(By.id("identifierNext"));
		nextButton.click();	
		
		}

}
