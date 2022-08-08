package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginClass
{
	//Webdriver declare
	private WebDriver driver;
	
	//Don't follow the same method to find the element in POM model
	// we use annotation @FindBy---> Annotation
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}

	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	public void clickLogIn()
	{
		loginButton.click();
	}


		public POMLoginClass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//no main method since we dont have to execute this class

}
