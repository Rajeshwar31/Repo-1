package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragNDrop {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched");

		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println("URL launched");
		
		
		WebElement cityele = driver.findElement(By.xpath("//div[@id='box3']"));  //Washington
		WebElement countryele =driver.findElement(By.xpath("//div[@id='box103']")); //USA
		
		Actions act = new Actions(driver);
		act.dragAndDrop(cityele, countryele).perform();
		System.out.println("Drag and Drop Successfully implemented");
		
	}

}
