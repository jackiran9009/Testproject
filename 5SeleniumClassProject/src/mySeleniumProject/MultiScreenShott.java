package mySeleniumProject;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultiScreenShott {
   static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?r=101");
		Thread.sleep(2000);
		screenShot("First");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Helloooo");
		Thread.sleep(2000);
		screenShot("Second");
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	public static void screenShot(String Filename) throws IOException 
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumClassProject\\"+Filename+".png");

	FileHandler.copy(src, f);
	
	}
}