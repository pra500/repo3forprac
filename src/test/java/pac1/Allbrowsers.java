package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Allbrowsers {

	private static WebDriver driver;
	
	
	
	@Test
	@Parameters("brow")
	public void getbroser(String br)
	{
		if(br.equalsIgnoreCase("Chrome"))
		{
						
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver= new ChromeDriver();	
			
		}
//		else if(br.equalsIgnoreCase("Firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
//		    driver=new FirefoxDriver();
//		}
		else if(br.equalsIgnoreCase("IE"))
		{
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}

		
		
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com");
		System.out.println(driver.getTitle());
		
		System.out.println("successful execution");
		
		System.out.println("successful execution 1");
		
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
