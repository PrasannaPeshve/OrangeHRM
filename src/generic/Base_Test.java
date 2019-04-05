package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_Const {
	
	public WebDriver driver;
	static{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@BeforeMethod
	public void openApp(){
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
	@AfterMethod
	public void closeApp(){
		driver.quit();
	}

}
