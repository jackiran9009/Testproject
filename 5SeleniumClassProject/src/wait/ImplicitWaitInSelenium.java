package wait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\E:selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);--3.141.59
		driver.get("https://jqueryui.com/droppable/");
		driver.quit();
		
	}
}