package script;


import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.HomePage;
import pom.LoginPage;

public class VerifyVersion extends Base_Test {

	@Test
	public void testVerifyVersion() throws InterruptedException{
		
		String un = Excel.getCellValue(PATH, "VerifyVersion", 1, 0);
		String pwd = Excel.getCellValue(PATH, "VerifyVersion", 1, 1);
		String lp_title = Excel.getCellValue(PATH, "VerifyVersion", 1, 2);
		String hp_title = Excel.getCellValue(PATH, "VerifyVersion", 1, 3);
		String version = Excel.getCellValue(PATH, "VerifyVersion", 1, 4);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pwd);
		lp.clicklogin();
		
		HomePage hp = new HomePage(driver);
		hp.verifyHomePage(hp_title);
		Thread.sleep(3000);
		hp.help();
		Thread.sleep(3000);
		hp.abouttab();
		Thread.sleep(3000);
		hp.orangeVersion(version);
		Thread.sleep(3000);
		hp.clickclose();
		Thread.sleep(3000);
		hp.clicklogout();
		Thread.sleep(3000);
		lp.verifyLoginPage(lp_title);
	}
}
