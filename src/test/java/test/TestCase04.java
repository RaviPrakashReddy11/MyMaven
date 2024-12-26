package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
@Listeners(test.NListener.class)
public class TestCase04 extends LaunchandQuit
{
	@Test(retryAnalyzer=test.Retry01.class)
	@Parameters("browser")
	public void method()
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
	h1.clickAandList();
	
	h1.rm();
	Assert.assertEquals(driver.getTitle(), "Your Addresses");
	
	}
}
