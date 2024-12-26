package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
@Listeners(test.NListener.class)
public class TestCase2 extends LaunchandQuit
{
	@Test(retryAnalyzer=test.Retry01.class)
	@Parameters("browser")
	public void test2()
	{
		HomePage h1=new HomePage(driver);
		NListener.setListener(driver);
		h1.aandList();
		h1.sign_in();
		
		LoginPage l1=new LoginPage(driver);
		l1.un();
		l1.clickContinue();
		l1.user_pwd();
		l1.used_signin();
	}
}
