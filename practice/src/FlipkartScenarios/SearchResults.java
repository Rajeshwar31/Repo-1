package FlipkartScenarios;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResults 
{

	static WebDriver driver;
	
	static void screenshotMethod() throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		String date = d1.format(d);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Rupesh\\Desktop\\Sel SS\\ScreeshotsFlip"+date+".jpg");
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
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("URL Launched successfully.");
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
		
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.sendKeys("");
//		Thread.sleep(2000);
		System.out.println("Valid mobile number submitted.");
		
		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("");
//		Thread.sleep(2000);
		System.out.println("Valid password submitted.");
		screenshotMethod();
		
		WebElement loginbutton = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		loginbutton.click();
		System.out.println("successfully logged into account.");
		screenshotMethod();
		Thread.sleep(3000);
		
		
		WebElement searchtextbox = driver.findElement(By.xpath("(//html//div//input)[1]"));
		searchtextbox.sendKeys("Mobile");
		System.out.println("Mobile input passed in search box successfully.");
		screenshotMethod();
//		Thread.sleep(2000);
		
		WebElement searchbutton = driver.findElement(By.xpath("//html//div//button"));
		
//		WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		exwait.until(ExpectedConditions.visibilityOf(searchbutton));
//		Thread.sleep(2000);
		searchbutton.click();
		System.out.println("clicked on seach button and showing the results for Mobile.");
		screenshotMethod();
//		Thread.sleep(2000);

		
		WebElement searchbrand = driver.findElement(By.xpath("(html//div//input)[7]"));
		searchbrand.sendKeys("Apple");
		System.out.println("Passing Apple as a input in brand search box.");
//		Thread.sleep(2000);
		
		WebElement applecheckbox = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]"));
		applecheckbox.click();
		boolean appleselection = applecheckbox.isSelected();
		System.out.println("Verify whether apple chcekbox is selected- "+ appleselection);
		System.out.println("Selecting the aaple checkbox.");
		screenshotMethod();
		
		
		WebElement selectapple13 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']"));
		selectapple13.click();
		System.out.println("Apple iphone 13 blue 128gb selected and moved to new tab.");
		screenshotMethod();
		
		List <String> allPageAddresses = new ArrayList <String>(driver.getWindowHandles());
		for(int i=0;i<allPageAddresses.size();i++)
		{
			System.out.println("Addresses for all pages- "+allPageAddresses.get(i));
		}
		
		driver.switchTo().window(allPageAddresses.get(1));
		
		WebElement addToCart = driver.findElement(By.xpath("(//html//button)[2]"));
		addToCart.click();
		screenshotMethod();
		
		WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']"));
		remove.click();
		screenshotMethod();
		
		WebElement confirmRemove = driver.findElement(By.xpath("(html//div)[10]"));
		confirmRemove.click();
		screenshotMethod();
		
		Actions act = new Actions(driver);

		WebElement outarrow = driver.findElement(By.xpath("//div[text()='Rajeshwar ']"));
		act.moveToElement(outarrow).perform();
		screenshotMethod();
		
		WebElement logoutB = driver.findElement(By.xpath("//div[text()='Logout']"));
		act.click(logoutB).perform();
		screenshotMethod();
		
		
		
	
	}
}
