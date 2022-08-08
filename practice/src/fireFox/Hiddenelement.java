package fireFox;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hiddenelement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\FireFoxDriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
		username.sendKeys("7776983259");

		WebElement password = driver.findElement(By.xpath("//html//form//div[2]//input"));
		password.sendKeys("Rajeshwar@1");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(4000);

		WebElement homecategory = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]"));
		homecategory.click();
		Thread.sleep(2000);

		WebElement homecategory1 = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions act = new Actions(driver);
		act.moveToElement(homecategory1).perform();
		Thread.sleep(2000);

		WebElement homecategory2 = driver.findElement(By.xpath("//a[@title='Beds']"));
		homecategory2.click();
		Thread.sleep(2000);
	}

}
