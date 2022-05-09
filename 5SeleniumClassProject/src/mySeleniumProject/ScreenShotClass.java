package mySeleniumProject;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "\\E:selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		 Thread.sleep(3000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//takes ss
        File f = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumClassProject\\src\\mySeleniumProject\\Ss.png");
        FileHandler.copy(src, f);
        
        Thread.sleep(2000);
        
        driver.quit();
	}

}