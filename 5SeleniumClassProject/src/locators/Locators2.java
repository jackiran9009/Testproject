package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.className("nav-line-2")).click();
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		Thread.sleep(3000);
		//driver.navigate().back();
		driver.findElement(By.partialLinkText("Laptops ")).click();
		driver.quit();

	}

}