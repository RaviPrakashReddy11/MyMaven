package source;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(linkText="Start here.")
	WebElement new_user;
	
	@FindBy(name="customerName")
	WebElement user_name;
	
	@FindBy(id="ap_phone_number")
	WebElement mobile_num;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement verify;
	
	@FindBy(linkText="Sign in")
	WebElement signin;
	
	@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[4]")
	WebElement address;
	
	@FindBy(id="ya-myab-address-delete-btn-2")
	WebElement remove;
	public void aandList()
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist);
	}
	public void clickAandList()
	{
		accountandlist.click();
	}
	
	public void register()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(new_user));
		new_user.click();
	}
	
	public void un()
	{
		user_name.sendKeys("ravi" + Keys.ENTER);
	}
	
	public void mn()
	{
		mobile_num.sendKeys("8688038521" + Keys.ENTER);
	}
	public void pwd()
	{
		password.sendKeys("68bgyy01" + Keys.ENTER);
	}
	
	public void verify_num()
	{
		verify.click();
	}
	
	public void sign_in()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}
	public void your_address()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(address));
		address.click();
	}
	
	public void rm()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(remove));
		remove.click();
	}
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
