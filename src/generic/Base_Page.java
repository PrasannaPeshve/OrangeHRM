package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Base_Page {
	public WebDriver driver;
	
	// creating a constructor to initialize all elements 
	public Base_Page (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Verifying title
	public void verify_title(String title){
		WebDriverWait wait = new WebDriverWait(driver, 12);
		try{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("title IS VERIFIED", true);
		
		}
		catch(Exception e){
		Reporter.log("title NOT matching", true);
		Assert.fail();
		}
	}
	
	// Verifying Element
	public void verify_ele(WebElement ele){
		WebDriverWait wait = new WebDriverWait(driver, 12);
		try{
		wait.until(ExpectedConditions.visibilityOf(ele));
		Reporter.log("element IS PRESENT", true);
		
		}
		catch(Exception e){
		Reporter.log("element IS NOT PRESENT", true);
		Assert.fail();
		}
	}		
	}