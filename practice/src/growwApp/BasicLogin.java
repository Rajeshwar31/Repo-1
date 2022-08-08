package growwApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.groww.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//span[text()='Login/Register']"));
		loginbutton.click();
//		Thread.sleep(2000);
		
		WebElement emailid = driver.findElement(By.id("login_email1"));
		emailid.sendKeys("rchaudhari990@gmail.com");
//		Thread.sleep(2000);
		
		WebElement continueB = driver.findElement(By.xpath("//div[@class='lils382ContinueBtn']"));
		continueB.click();
//		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("login_password1"));
		                                                                                                                    password.sendKeys("Mechanical@1");
//		Thread.sleep(2000);
		
		WebElement submitB = driver.findElement(By.xpath("(//div[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]"));
		submitB.click();
//		Thread.sleep(2000);
		
		WebElement pininput1 = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		                                                                                                                              pininput1.sendKeys("3");
		
		WebElement pininput2 = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		                                                                                                                                 pininput2.sendKeys("1");
		
		WebElement pininput3 = driver.findElement(By.xpath("(//input[@type='number'])[3]"));
		                                                                                                                                      pininput3.sendKeys("0");
		
		WebElement pininput4 = driver.findElement(By.xpath("(//input[@type='number'])[4]"));
		                                                                                                                                   pininput4.sendKeys("1");
//		Thread.sleep(2000);
		
		
		WebElement globalsearch1 = driver.findElement(By.id("globalSearch23"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(globalsearch1));
		globalsearch1.sendKeys("TCS");
//	    Thread.sleep(2000);
		
		
		WebElement selecttcs1 = driver.findElement(By.xpath("//span[text()='Tata Consultancy Services Ltd.']"));
		WebDriverWait waitTCS = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitTCS.until(ExpectedConditions.visibilityOf(selecttcs1));
		selecttcs1.submit();
//		Thread.sleep(2000);
		
		WebElement accountshort = driver.findElement(By.xpath("(//div[@class='dropdown__trigger '])[1]"));
		accountshort.click();
//		Thread.sleep(2000);
		
		WebElement logoutB = driver.findElement(By.xpath("//div[text()='Log Out']"));
		logoutB.click();
//		Thread.sleep(2000);
		
		
		
		
	}

}
