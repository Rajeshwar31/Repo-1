package pomPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched & maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		POMLoginClass lp = new POMLoginClass(driver);
		lp.sendusername();
		System.out.println("username entered");
		lp.sendpassword();
		System.out.println("password entered");
		lp.clickLogIn();
		System.out.println("logIn button clicked");
		
		//home page
		

		
	}

}
