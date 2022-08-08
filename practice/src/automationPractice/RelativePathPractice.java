package automationPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativePathPractice 
{

	public static void main(String[] args) 
	{

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in");
		WebElement signinButton = driver.findElement(By.xpath("(//html//a//span)[39]"));
		boolean show =signinButton.isDisplayed();
		System.out.println(show+" -Displyed or not");
		signinButton.click();
		
		
		WebElement emailId = driver.findElement(By.id("ap_email"));
		emailId.sendKeys("rchaudhari990@gmail.com");
		
		WebElement continueButton = driver.findElement(By.xpath("//html//div//span//input"));
		continueButton.click();
		
		WebElement password = driver.findElement(By.xpath("(//html//div//div//input)[9]"));
		                                                                                                                          password.sendKeys("Rajeshwar@1");
		WebElement signin = driver.findElement(By.xpath("//html//div//div//span//input"));
		signin.click();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone 13");
		boolean enabled = searchbox.isEnabled();
		System.out.println(enabled+" -Enabled or not");
		String getattribute = searchbox.getAttribute("id");
		System.out.println(getattribute);
		String tagname = searchbox.getTagName();
		System.out.println(tagname);
		
		
		
		
		
		
		WebElement submitsearch = driver.findElement(By.xpath("//html//div//div//div//div//span//input"));
		submitsearch.click();
		
		
		
		WebElement checkboxapple = driver.findElement(By.xpath("(//html//div//div//ul//li)[10]"));
		checkboxapple.click();
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		boolean selectedapple = checkboxapple.isSelected();
//		System.out.println(selectedapple +" -Selected Apple or not");
		
				
		
		
		
	}

}
