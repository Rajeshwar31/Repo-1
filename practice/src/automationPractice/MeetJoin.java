package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MeetJoin {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\EdgeDriver\\msedgedriver.exe");
	
		
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://meet.google.com/kng-qmbw-qvy");
		
	}

}
