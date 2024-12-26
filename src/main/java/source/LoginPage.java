package source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	WebDriver driver;
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement btn_continue;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement signin_submit;
	public void un()
	{
		username.sendKeys("9849916886");
	}
	
	public void clickContinue()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btn_continue));
		
		btn_continue.click();
	}
	public void user_pwd()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(pwd));
		
		pwd.sendKeys("BubuSwan@1106");
	}
	
	public void used_signin()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signin_submit));
		signin_submit.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	}
}
