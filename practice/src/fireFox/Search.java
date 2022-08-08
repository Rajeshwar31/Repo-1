package fireFox;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {

		


				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\FireFoxDriver\\geckodriver.exe");

				WebDriver driver = new FirefoxDriver();

//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

				driver.get("https://www.flipkart.com/");

				WebElement username = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
				username.sendKeys("7776983259");

				WebElement password = driver.findElement(By.xpath("//html//form//div[2]//input"));
				password.sendKeys("Rajeshwar@1");
				Thread.sleep(2000);

				WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
				login.click();
				Thread.sleep(2000);

				WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
				search.sendKeys("mobile");
				Thread.sleep(2000);

				WebElement clicksearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
				clicksearch.click();

			}

		
	}


