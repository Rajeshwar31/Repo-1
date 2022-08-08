package pomPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass 
{

private WebDriver driver;
	
	@FindBy (xpath="//button[text()='Add to cart']")
//	private WebElement addToCart;
	private List<WebElement> allproducts;
	
	public void addTocart()
	{
		for (WebElement e : allproducts)
		{

			e.click();
			
		}
	}
	
	@FindBy (xpath="//span[@class='shopping_cart_badge']")
	private WebElement shoppingCart;
	
	public String shoopingCart()
	{
		String amount = shoppingCart.getText();
		return amount;
	}
	
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	private WebElement hamBurgerMenu;
	
	public void hamBurger()
	{
		hamBurgerMenu.click();
	}
	
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOut;
	
	public void logOut()
	{
		logOut.click();
	}
	public HomePOMClass(WebDriver driver) 
	{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
	}		
		
	

}
