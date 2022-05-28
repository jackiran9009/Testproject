import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xyz {
	WebDriver driver;
	@BeforeMethod             //
	public void start()         //
	{
		String br="chrome";
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		else
		{
			System.out.println("please write correct br name");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.google.com/");
}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
