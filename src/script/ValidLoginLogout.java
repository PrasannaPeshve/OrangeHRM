package script;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.HomePage;
import pom.LoginPage;

public class ValidLoginLogout extends Base_Test {
	@Test
	public void testValidLoginLogout() throws InterruptedException{
		String un = Excel.getCellValue(PATH, "ValidLoginLogout", 1, 0);
		String pwd = Excel.getCellValue(PATH, "ValidLoginLogout", 1, 1);
		String lp_title = Excel.getCellValue(PATH, "ValidLoginLogout", 1, 2);
		String hp_title = Excel.getCellValue(PATH, "ValidLoginLogout", 1, 3);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pwd);
		lp.clicklogin();
		
		HomePage hp = new HomePage(driver);
		hp.verifyHomePage(hp_title);
		Thread.sleep(3000);
		hp.help();
		Thread.sleep(3000);
		hp.clicklogout();
		lp.verifyLoginPage(lp_title);
	}

}
