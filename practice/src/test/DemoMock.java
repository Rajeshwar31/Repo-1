package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMock {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		WebElement topictextb = driver.findElement(By.xpath("/html/body/input"));
		boolean selectedverify = topictextb.isEnabled();
		topictextb.sendKeys("Hello world");
		System.out.println(selectedverify+" -textbox enabled?");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		
		//switching to from frame1 to frame3 
		WebElement frame3 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(frame3);
		
		WebElement checkbox = driver.findElement(By.id("a"));
		checkbox.click();
		boolean verifycheck = checkbox.isSelected();
		System.out.println(verifycheck+ " -checkbox clicked?");
		
		//from frame 3 to frame 2
		
		
		
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class=' ezlazyloaded'])[2]"));
		driver.switchTo().frame(frame2);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		dropdown.click();
		
		Select s = new Select(dropdown);
		s.selectByValue("big baby cat");
	}

}
