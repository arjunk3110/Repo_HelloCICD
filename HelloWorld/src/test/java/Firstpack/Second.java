

package Firstpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Second
{
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void test()
	{
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Test
	public void aim()
	{
		driver.get("https://www.linkedin.com/");
		 System.out.println(" Page title is : " + driver.getTitle());
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}


