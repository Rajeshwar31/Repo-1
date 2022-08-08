package amazonByPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched & maximized.");
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		POMLogin lg = new POMLogin(driver);
		
		lg.signInDropDownMethod();
		System.out.println("hovered to dropdown.");
		
		
		lg.signInButton();
		System.out.println("clicked on signin button");
		
		lg.sendEmailId();
		System.out.println("emailId passed.");
		
		lg.cotinueButton();
		System.out.println("continue button clicked");
		
		lg.sendPassword();
		System.out.println("password  passed.");
		
		lg.siginSubmit();
		System.out.println("sign in successful.");
		
	}

}
