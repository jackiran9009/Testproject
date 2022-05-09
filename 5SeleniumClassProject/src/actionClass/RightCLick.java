package actionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightCLick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\E:selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		WebElement rightClick = driver.findElement(By.xpath("(//a[text()='jQuery UI'])[2]"));
	
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		
		Thread.sleep(4000);
		driver.quit();
	
	
	}

}
