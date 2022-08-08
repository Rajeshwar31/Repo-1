package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VelocitySite {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement practice = driver.findElement(By.xpath("//a[text()='PRACTICE']"));
		practice.click();
		
		
		WebElement dropDownSelect = driver.findElement(By.id("dropdown-class-example"));
		dropDownSelect.click();
		Thread.sleep(3000);
		
		
		Select s = new Select(dropDownSelect);
		s.selectByIndex(1);
		
		
		//boolean selected1 = dropDownSelect.isSelected();
		//System.out.println(selected1);
		
		
	
	}

}
