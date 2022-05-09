package popUps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id = 'promtButton']")).click();
		Thread.sleep(3000);
		
		Alert ert = driver.switchTo().alert();
		System.out.println(ert.getText());
		ert.sendKeys("My 18 dec Family");
		Thread.sleep(6000);
		ert.accept();
		Thread.sleep(6000);
		driver.quit();
	}

}