package amazonScenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithExcel {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		WebElement signinButton = driver.findElement(By.linkText("Sign in"));
		signinButton.click();
		
		String address = "\\D:\\Excel Lib\\New Microsoft Excel Worksheet.xlsx";
		FileInputStream file = new FileInputStream(address);
		
		
		XSSFWorkbook excelbook = new XSSFWorkbook(file);
		String username = excelbook.getSheet("Rupesh").getRow(0).getCell(0).getStringCellValue();
		System.out.println("Amazon username- "+ username);
		
		WebElement emailId = driver.findElement(By.id("ap_email"));
		emailId.sendKeys(username);
		
		
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();

		
		String password = excelbook.getSheet("Rupesh").getRow(1).getCell(0).getStringCellValue();
		System.out.println("Amazon password- "+ password);

		
		WebElement passwordele = driver.findElement(By.id("ap_password"));
		passwordele.sendKeys(password);
		
		WebElement submitButton = driver.findElement(By.id("signInSubmit"));
		submitButton.click();



		
	}

}
