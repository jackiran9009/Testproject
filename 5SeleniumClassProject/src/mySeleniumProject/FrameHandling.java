package mySeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@id = 'a']")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).sendKeys("My 18 dec Eveng batch");
		
		Thread.sleep(7000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame2");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id = 'animals']"));
		
		Select s = new Select(ele);
		s.selectByVisibleText("Avatar");
		Thread.sleep(7000);
		driver.quit();
	}

}
