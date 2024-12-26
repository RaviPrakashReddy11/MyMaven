package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import source.HomePage;
@Listeners(test.NListener.class)
public class TestCase1 extends LaunchandQuit
{
	@Test(retryAnalyzer=test.Retry01.class)
	@Parameters("browser")
	public void method1()
	{
		
		HomePage h1=new HomePage(driver);
		NListener.setListener(driver);
		h1.aandList();
		h1.register();
		Assert.assertEquals(driver.getTitle(), "Amazon Registration");
		h1.un();
		h1.mn();
		h1.pwd();
		
		
	}
}
