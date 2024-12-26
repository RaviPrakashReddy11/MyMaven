package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchandQuit 
{
	static WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
