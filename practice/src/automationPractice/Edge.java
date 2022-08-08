package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\EdgeDriver\\msedgedriver.exe");
		
		
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(5000);
		
		
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		
		Thread.sleep(3000);
		
		
		
		driver.navigate().to("https://facebook.com");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://flipkart.com");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.close();
		

	}

}
