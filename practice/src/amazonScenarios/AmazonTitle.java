package amazonScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTitle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		WebElement signinButton = driver.findElement(By.linkText("Sign in"));
		signinButton.click();
		Thread.sleep(3000);
		
		
		WebElement emailId = driver.findElement(By.id("ap_email"));
		emailId.sendKeys("rchaudhari990@gmail.com");
		Thread.sleep(2000);
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("ap_password"));
		                                                                                                                             password.sendKeys("");
		
		WebElement submitButton = driver.findElement(By.id("signInSubmit"));
		submitButton.click();
		Thread.sleep(2000);
		
		WebElement burgermenu = driver.findElement(By.id("nav-hamburger-menu"));
		burgermenu.click();
		Thread.sleep(2000);
		
		WebElement seemore = driver.findElement(By.xpath("//i[@class='nav-sprite hmenu-arrow-more']"));
		seemore.click();
		Thread.sleep(2000);
		
		WebElement booksButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/ul/li[7]/a"));
		booksButton.click();
		Thread.sleep(2000);
		
		WebElement allbooksB = driver.findElement(By.xpath("//a[text()='All Books']"));
		allbooksB.click();
		Thread.sleep(2000);
		
		
		
		

	
		
		
		
		
	}

}
