
package FlipkartScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartloginandSearch {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
	
	
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement emailid = driver.findElement(By.xpath("(//html//div//form//div//input)[7]"));
		emailid.sendKeys("7776983259");
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		password.sendKeys("Rajeshwar@1");
		
		WebElement signIn = driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]"));
		signIn.click();
		
		
		WebElement fashionhover = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(fashionhover).perform();
		Thread.sleep(3000);
		

		
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='All']"));
		tshirt.click();
		
//		WebElement searchBox = driver.findElement(By.xpath("//html//form//div//div//input"));
//		searchBox.sendKeys("i phone 13");
//    	Thread.sleep(3000);
		
		
//		WebElement mobiles = driver.findElement(By.xpath("(html//div//a//div)[7]"));
//		mobiles.click();	
//		
//    	WebElement nothingphone = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/div[2]/div/div/a/div/img[2]"));
////		nothingphone.click();
//		
//	
//		act.doubleClick(nothingphone).perform();
//	
	
	
	
	}
	

}
