package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class LoginPage extends Base_Page{

	
	// LOCATING ELEMENTS IN LOGIN PAGE
	@FindBy(id="txtUsername")
	private WebElement unbox;
	
	@FindBy(id="txtPassword")
	private WebElement pwdbox;
	
	@FindBy(id="btnLogin")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(.,'Invalid credentials')]")
	private WebElement errmsg;
		
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	// CREATING METHODS FOR ALL THE ABOVE ELEMENTS
	public void setUsername(String un){
		unbox.sendKeys(un);
	}
	public void setPassword(String pwd){
		pwdbox.sendKeys(pwd);
	}
	public void clicklogin(){
		loginbtn.click();
	}
	public void verifyLoginPage(String lp_title){
		verify_title(lp_title);
	}
	public void verifyErrmsg(){
		verify_ele(errmsg);
	}
}