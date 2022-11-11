package basic_frametng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_urlbase {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeMethod
	public void oppenapp()
	{
		System.setProperty("webdriver.gecko.driver", "./sofi/geckodriver.exe");
		 driver=new FirefoxDriver();
		wait=new WebDriverWait(driver, 10);
		driver.get("https://www.google.co.in/");		
	}
	
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
	
	
	
}
