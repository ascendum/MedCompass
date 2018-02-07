package commonLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTestLib implements BasepageLib
{
	public WebDriver driver;
	
	@BeforeClass
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver", "D:/Asc_seleniumFramework/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://staging.assurecare.com/MC/home");
	}
	
	@AfterClass
	public void postcondition()
	{
		driver.close();
	}
}
