package popUpsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsBasic {

	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement clickme1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme1.click();	
		//Handle alert pop up first
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		
		WebElement  clickme2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickme2.click();
		alt.accept();
		
		WebElement clickme3 = driver.findElement(By.xpath("//buton[@id='confirmButton']"));
		clickme3.click();
		String textalert = alt.getText();
		System.out.println(textalert);
		alt.accept();
		
		
		
	}

}
