package amazonScenarios;

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
import org.openqa.selenium.support.ui.Select;

public class HoverAndScroll {

	static WebDriver driver;
	
	public static void screenshotMethod() throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		String date = d1.format(d);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Rupesh\\Desktop\\Sel SS\\ScreenshotA"+date+".jpg");
		FileHandler.copy(sourcefile, destfile);
		System.out.println(" **Screenshot is taken** ");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		System.out.println("Browser launched and Maximized");

		
		driver.get("https://www.amazon.in/");
		String ExpectedURL = "https://www.amazon.in/";
		System.out.println("URL launched successfully");
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);
		if (ActualURL.equalsIgnoreCase(ExpectedURL))
		{
			System.out.println("**********Test Case passed for URL**********");
		}
		else
		{
			System.out.println("**********Test Case failed for URL**********");
		}
		
		String amazonTitle = driver.getTitle();
		System.out.println("Title-  "+amazonTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		screenshotMethod();
		
		
		WebElement signInInner = driver.findElement(By.xpath("(html//div//div//a//span)[39]"));
		boolean signInDisplay = signInInner.isDisplayed();
		System.out.println("Displaying Sign In button- "+signInDisplay);
		signInInner.click();
		System.out.println("Moved to the Sign In page");
		
		
		WebElement emailid = driver.findElement(By.xpath("//input[@id='ap_email']"));
		boolean emailIdTextbox = emailid.isEnabled();
		System.out.println("Email Id Text box is enabled- "+ emailIdTextbox);
		emailid.sendKeys("rchaudhari990@gmail.com");
		System.out.println("Valid email Id provided");
		
		WebElement continueB = driver.findElement(By.xpath("//input[@id='continue']"));
		continueB.click();

		
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		boolean passwordTextbox = password.isEnabled();
		System.out.println("Password text box is enabled- "+ passwordTextbox);
		password.sendKeys("Rajeshwar@1");
		System.out.println("valid Password provided");
		
		WebElement signInB = driver.findElement(By.xpath("(//html//div//span//span//input)[1]"));
		boolean signInPageB = signInB.isDisplayed();
		System.out.println("Is Sign In Button Displayed- "+ signInPageB);
		signInB.click();
		screenshotMethod();
		System.out.println("Successfully Signed In");
		
		
		WebElement hoverOver = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(hoverOver).perform();
		System.out.println("Hovering Over user account details in home page");
		Thread.sleep(3000);

		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		dropDown.click();
		System.out.println("clicked on the drop down menu to select the category");
		Thread.sleep(2000);
		
		Select allDropDown = new Select(dropDown);
		allDropDown.selectByValue("search-alias=computers");
		System.out.println("Selected 'Computers & Accessories' Section Successfully");
		
		WebElement searchB = driver.findElement(By.id("nav-search-submit-button"));
		searchB.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		System.out.println("Scrolling Downwards");

		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		System.out.println("*");
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		System.out.println("*");


		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1000)");

		js.executeScript("window.scrollBy(0,1000)");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		
		WebElement backToTop = driver.findElement(By.id("navBackToTop"));
		backToTop.click();
		System.out.println("Navigated back to Top");
		Thread.sleep(1000);
		
		WebElement allB = driver.findElement(By.xpath("(//html//div//a//i)[1]"));
		allB.click();
		System.out.println("Clicked the hambiurger menu named All");

		
		WebElement signout = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		Thread.sleep(1000);
		signout.click();
		System.out.println("Signed out of account Successfully");
		
		


		
		
		
		
		
		
		

		
		
	}

}
