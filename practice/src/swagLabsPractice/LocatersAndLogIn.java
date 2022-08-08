package swagLabsPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LocatersAndLogIn 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		
		
		WebElement userName = driver.findElement(By.id("user-name"));  //Storing the find element method in WebElement Interface.
	    userName.sendKeys("standard_user"); //calling the sendkeys method which is of WebElement interface. for user name.
	    Thread.sleep(2000);
	
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce"); // here we are providing the password.
		Thread.sleep(2000);
		
		
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		//ts.getScreenshotAs(null);//this will generate the ss in byte code. we have to convert that byte code any image file format.
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Rupesh\\Desktop\\Sel SS\\HomePage.jpg");
		FileHandler.copy(sourcefile, destfile);
		
		
		WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addToCart.click();
		Thread.sleep(2000);
		
		WebElement goTocart = driver.findElement(By.className("shopping_cart_badge"));
		goTocart.click();
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Raj");
		Thread.sleep(2000);
		
		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Chaudhari");
		Thread.sleep(2000);
		
		WebElement postalCode = driver.findElement(By.id("postal-code"));
		postalCode.sendKeys("410201");
		Thread.sleep(2000);
		
		WebElement submitButton = driver.findElement(By.id("continue"));
		submitButton.click();
		Thread.sleep(2000);
		
		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();
		Thread.sleep(2000);
		
		WebElement backHomeButton = driver.findElement(By.id("back-to-products"));
		backHomeButton.click();
		Thread.sleep(2000);
		
		WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
		burgerMenu.click();
		Thread.sleep(2000);
		
		
		WebElement logoutButton =driver.findElement(By.id("logout_sidebar_link"));
		logoutButton.click();
		
		
		
	
	
	}
	
	

}
