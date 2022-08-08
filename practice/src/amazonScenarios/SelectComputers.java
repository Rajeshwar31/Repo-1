package amazonScenarios;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectComputers {

	public static void main(String[] args)  {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement signinButton = driver.findElement(By.linkText("Sign in"));
		signinButton.click();
		
		
		WebElement emailId = driver.findElement(By.id("ap_email"));
		emailId.sendKeys("rchaudhari990@gmail.com");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Rajeshwar@1");
		
		
		WebElement submitButton = driver.findElement(By.id("signInSubmit"));
		submitButton.click();
		

		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Rework by David Heinemeier Hansson");
		
		
		WebElement searchsubmit = driver.findElement(By.id("nav-search-submit-button"));
		searchsubmit.click();
		
		
		WebElement bookselect = driver.findElement(By.xpath("//span[text()='ReWork: Change the Way You Work Forever']"));
		bookselect.click();	
		
		//childPage 

//		Set <String> addresses = driver.getWindowHandles();
		// *** System.out.println("All page addresses- " + addresses); // we will not use set because it does not support index  or sequence
		List<String> allPagesAdresses = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("List wise ad- " + allPagesAdresses.get(1));
		driver.close();
		driver.switchTo().window(allPagesAdresses.get(1));

		
		WebElement addtoCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtoCart.click();
		
		WebElement burgermenu = driver.findElement(By.xpath("(//span[text()='All'])[2]"));
		burgermenu.click();
		
		
		
		WebElement signout = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
		signout.click();
		
		
		
		
		
		
		
	}

}
