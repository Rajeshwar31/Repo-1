package amazonByPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLogin 
{

	private WebDriver driver;
	
	@FindBy (xpath="//a[@id='nav-link-accountList']")
	private WebElement signInDropdown;
	private Actions act;
	
	public void signInDropDownMethod()
	{
		Actions act = new Actions(driver);

		act.moveToElement(signInDropdown).perform();
	}
	
	@FindBy (xpath="(html//div//span)[26]")
	private WebElement signIn;
	
	
	public void signInButton()
	{
		Actions act = new Actions(driver);
		act.click(signIn).perform();
	}
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement emailId;
	
	public void sendEmailId()
	{
		emailId.sendKeys("rchaudhari990@gmail.com");
	}
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement countinueButton;
	
	
	public void cotinueButton()
	{
		countinueButton.click();
	}
	
	@FindBy (xpath="//input[@id='ap_password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("Rajeshwar@1");
	}
	
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement sigin;
	
	public void siginSubmit()
	{
		sigin.click();
	}
	
	public POMLogin(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
}
