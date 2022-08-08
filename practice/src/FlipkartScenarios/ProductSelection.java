package FlipkartScenarios;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ProductSelection 
{

	static WebDriver driver;
	
	static void screenshotMethod() throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		String date = d1.format(d);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Rupesh\\Desktop\\Sel SS\\ScreeshotsFlip"+ date + ".jpg");
		FileHandler.copy(source, destination);
		System.out.println(" ***Screenshot Taken*** ");
	}
	
	
	public static void main(String[] args) throws InterruptedException , IOException
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched & maximized successfully.");
//		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/");
		System.out.println("URL Launched successfully.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String ExpectedURL ="https://www.flipkart.com/";
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);
		if (ExpectedURL.equalsIgnoreCase(ActualURL))
		{
			System.out.println("URL Test Case Passed!");
		}
		else
		{
			System.out.println("URL Test Case Failed!");
		}
//		Thread.sleep(2000);
		
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Title Matched!");
		}
		else
		{
			System.out.println("Title did not Matched!");
		}
		screenshotMethod();
		
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.sendKeys("7776983259");
//		Thread.sleep(2000);
		System.out.println("Valid mobile number submitted.");
		
		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("Rajeshwar@1");
//		Thread.sleep(2000);
		System.out.println("Valid password submitted.");
		screenshotMethod();
		
		WebElement loginbutton = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		loginbutton.click();
		System.out.println("successfully logged into account.");
//		Thread.sleep(2000);
		
		WebElement fashionsection = driver.findElement(By.xpath("//div[text()='Fashion']"));
		fashionsection.click();
		System.out.println("Selected the fasion section from home page.");
//		Thread.sleep(2000);
		screenshotMethod();
		
		Actions act = new Actions(driver);
		WebElement mensection = driver.findElement(By.xpath("//span[text()='Men']"));
		act.moveToElement(mensection).perform();
		System.out.println("Hovering over men section from fashion.");
//		Thread.sleep(3000);
		screenshotMethod();
		
		WebElement shirts = driver.findElement(By.xpath("//a[text()='Formal Shirts']"));
		shirts.click();
		System.out.println("Selection of formal shirts collection successfull.");
//		Thread.sleep(2000);
		screenshotMethod();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4100)");
		System.out.println("Scrolling downward to have a look at shirts.");
		screenshotMethod();
//		Thread.sleep(2000);
		
		
		WebElement shirtselected = driver.findElement(By.xpath("(//html//div//div//a)[104]"));
		act.moveToElement(shirtselected).perform();
		screenshotMethod();
//		Thread.sleep(5000);
		
		act.click(shirtselected).perform();
		System.out.println("Shirt selection successful & moved to the new tab.");

		
		
		
	}
}
