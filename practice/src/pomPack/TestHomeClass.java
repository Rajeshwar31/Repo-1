package pomPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomeClass 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser lauched & maximized.");
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("URL launched successfully.");
		
		POMLoginClass lg = new POMLoginClass(driver);
		lg.sendusername();
		System.out.println("username passed.");
		
		lg.sendpassword();
		System.out.println("password passed.");
		
		lg.clickLogIn();
		System.out.println("clicked on login.");
		
		HomePOMClass hp = new HomePOMClass(driver);
		hp.addTocart();
		System.out.println("product added to the cart.");
		
		String expectedamount ="6";
		String actualamount=hp.shoopingCart();
		if(actualamount.equals(expectedamount))
		{
			System.out.println("TC passed");
		}
		else
		{
			System.out.println("TC failed");
		}
		hp.hamBurger();
		System.out.println("clicked on the menu");
		
		hp.logOut();
		System.out.println("logged out successfully");
		
		driver.quit();
		System.out.println("browser closed");
		
		
		
		
	}
}
