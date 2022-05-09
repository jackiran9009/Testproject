package mySeleniumProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","\\E:selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(9000);
		//4.1.2
		//driver.manage().window().minimize();
		driver.get("https://www.flipkart.com/");//error???//InvalidArgumentException
		Thread.sleep(9000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(9000);
		//driver.get("https://www.amazon.in/");
		driver.navigate().back();
		Thread.sleep(9000);
		driver.navigate().forward();
		Thread.sleep(9000);
		driver.navigate().refresh();
		Thread.sleep(9000);
		String str = driver.getCurrentUrl();
		System.out.println(str);
		Thread.sleep(9000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(9000);
		/*String source = driver.getPageSource();
		System.out.println(source);*/
		driver.quit();
		

	}

}