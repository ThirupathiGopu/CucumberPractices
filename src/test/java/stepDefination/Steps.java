package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Utilities.Browser;
import Utilities.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Loginpage;

public class Steps 
{
	public WebDriver driver;
	public  Loginpage login;

	@Given("Lanch chrome browser")
	public void lanch_chrome_browser() throws Exception 
	{
		
		List<String> info = PropertyReader.getData("browser", 1);
		String browsername = info.get(0), drivername = info.get(1);
		Browser.LanchBrowser(browsername, drivername);
		login = new Loginpage(driver);
		System.out.println("browser will open ");
		
	}

	@When("open url{string}")
	public void open_url(String url) throws Exception 
	{
		List<String> info = PropertyReader.getData("browser", 1);
		String ur=info.get(2);
		Browser.openUrl(ur);

		Thread.sleep(3000);
		System.out.println("navigate to login page ");


	}

//	@When("Enter user name{string} ")
//	//@When("Enter user name  and Password ")
//	//public void enter_user_name_and_password(String username, String password) throws Exception
//	public void enter_user_name() throws Exception
//	{
//		List<String>info=PropertyReader.getData("loginspage", 1);
//		String usernam=info.get(0);
//		login.EnterUsername(usernam);
//		System.out.println("enter user name ");
//
//
//	}
//	@When("Enter user password {string} ")
//	public void enter_password() throws Exception
//	{
//		List<String>info=PropertyReader.getData("loginspage", 1);
//		String passwor=info.get(1);
//		login.Enterpassword(passwor);
//		System.out.println("enter user password ");
//
//	}
	
	@When("Enter user name {string}")
	public void enter_user_name(String username) {
	   
	  
	}

	@When("Enter Password {string}")
	public void enter_password(String password) {
	   
	    
	}

	
	@When("click on login link")
	public void click_on_login_link() {
		login.ClickOnLoginbtn();
	}
	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {

		  driver.getTitle();
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}

	}

	@When("click on logout button")
	public void click_on_logout_button() throws Exception {
		login.clickonLogout();
		Thread.sleep(3000);

	}

	@Then("close browser")
	public void close_browser() {

	}

}

//List<String> info=  PropertyReader.getData("browser", 1);
//String url=info.get(2);//		List<String > info=PropertyReader.getData("loginpage", 1);
//String usernam=info.get(0),passwor=info.get(1);
