package amazonScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuantityDropDown {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/Levis-Plain-Regular-T-Shirt-PR680613_Navy/dp/B07XMDGJMS/ref=sr_1_1_sspa?crid=3RB7V1Q7UG97C&keywords=t+shirt+for+men&qid=1658080791&sprefix=t+%2Caps%2C175&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFYQldGQjEyUEg2R04mZW5jcnlwdGVkSWQ9QTA1MjM3NzUxOVhBSktFRkM2UlI4JmVuY3J5cHRlZEFkSWQ9QTA4ODY2ODRZWE9LVVBEVThNMVkmd2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");
		
		
		
		WebElement dropDownSelect = driver.findElement(By.id("quantity"));
		dropDownSelect.click();
		Thread.sleep(3000);
		
		Select s = new Select(dropDownSelect);
		s.selectByValue("5");
		Thread.sleep(3000);
	 
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		


		// int x =100;
		//double y = (double)x;  Implicit casting example
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;   //same here we implicit casted the driver var from WebDriver to JavaScriptExecutor.

		js.executeScript("window.scrollBy(0,5000)");  //down scroll
		
		Thread.sleep(3000);
	
		js.executeScript("window.scrollBy(0,-5000)");  //up scroll
		
	
	 
	}

}
