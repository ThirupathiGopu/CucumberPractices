package Utilities;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.BaseClass.BaseTest;


public class Hooks extends BaseTest
{
	@Before
	public void Setup()
	{
		String browername="chrome";

		if(browername.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		      driver. manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browername.equals("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	}
	@After
	public void closebrowser()
	{
		driver.close();
	}
	
	
	

}
