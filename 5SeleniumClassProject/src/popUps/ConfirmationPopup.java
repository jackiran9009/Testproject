package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id = 'confirmButton']")).click();
		Thread.sleep(3000);
		
		Alert ele = driver.switchTo().alert();
		System.out.println(ele.getText());
		ele.accept();
		Thread.sleep(5000);
		
		System.out.println("====================");
		
		driver.findElement(By.xpath("//button[@id = 'confirmButton']")).click();
		Alert ele1 = driver.switchTo().alert();
		System.out.println(ele1.getText());
		ele1.dismiss();
		Thread.sleep(5000);
		
		driver.quit();
	}

}