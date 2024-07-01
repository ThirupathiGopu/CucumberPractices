package pageObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage 
{
	static WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Admin area demo']")
	@CacheLookup
	WebElement isdisplaytext;
@FindBy(xpath="//input[@id='Email']")
//@FindBy(css="#Email")
@CacheLookup
WebElement usernamel;


@FindBy(xpath="//input[@id='Password']")
@CacheLookup
WebElement passwordl;

@FindBy(xpath="//button[@type='submit']")
@CacheLookup

WebElement loginbtnl;

@FindBy(xpath="//a[text()='Logout']")
@CacheLookup
WebElement Logoutbtnl;
public void Launchbrowser()
{
	System.out.println("broswer open");
}
//public void Openurl(String url)
//{
//	driver.get(url);
//}

public void isdisplaytextmsg()
{
	if(isdisplaytext.isDisplayed())
	{
		String inf=isdisplaytext.getText();
		System.out.println(inf);
		Assert.assertEquals(inf, "Admin area demo","test case is pass");
	}
	else
	{
		System.out.println("not matched or not find webelement");
	}
}

public void EnterUsername(String username) throws InterruptedException, Exception
{
	usernamel.clear();
	Thread.sleep(4000);
	passwordl.click();
    Thread.sleep(2000);
	usernamel.sendKeys(username);
}

public void Enterpassword(String password) throws InterruptedException
{
	passwordl.clear();
	Thread.sleep(4000);
	passwordl.click();
    Thread.sleep(2000);
	passwordl.sendKeys(password);
    

}
public void ClickOnLoginbtn()
{
	loginbtnl.click();
}
public void clickonLogout()
{
	Logoutbtnl.click();
}
/*
 
Scenario Outline:Data driven 
Given Lanch chrome browser
When open url"https://admin-demo.nopcommerce.com/login"
And Enter user name "<email>" and Password "<password>"
And click on login link
Then Page Title should be "Dashboard / nopCommerce administration"
When click on logout button
Then Page Title should be "Your store.Login"
And close browser


Examples:
          |email |password|
          |admin@yourstore.com|admin|
          |admin@yourstore.com|admin123|
 */

}
