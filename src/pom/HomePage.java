package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.*;

import generic.Base_Page;
//import junit.framework.Assert;

public class HomePage extends Base_Page{

	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//a[@id='welcome']")
	private WebElement helpbtn;
	
	@FindBy(xpath="//a[.='About']")
	private WebElement about;
	
	@FindBy(xpath="//p[contains(.,'Orangehrm')]")
	private WebElement version;
	
	@FindBy(xpath="(//a[.='×'])[1]")
	private WebElement closebtn;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Developing Methods for all the above elements
	
	public void clicklogout(){
		logoutbtn.click();
	}
	public void help(){
		helpbtn.click();
	}
	public void abouttab(){
		about.click();
	}
	public void clickclose(){
		closebtn.click();
	}
	public void verifyHomePage(String hp_title){
		verify_title(hp_title);
	}

	public void orangeVersion(String expectedversion){
		String actualversion = version.getText();
		try{
			Assert.assertEquals(expectedversion, actualversion);
			Reporter.log("Version matching", true);
		}
		catch(Exception e){
			Reporter.log("Version NOT matching", true);
			Assert.fail();
			
		}
	}
	
}
