package script;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.LoginPage;

public class InvalidLogin extends Base_Test{
	@Test
	public void testInvalidLogin(){
		String un = Excel.getCellValue(PATH, "InvalidLogin", 1, 0);
		String pwd = Excel.getCellValue(PATH, "InvalidLogin", 1, 1);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pwd);
		lp.clicklogin();
		lp.verifyErrmsg();
	}

}
