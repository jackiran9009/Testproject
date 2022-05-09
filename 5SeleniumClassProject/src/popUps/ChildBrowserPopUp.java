package popUps;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("//div[text()='Jobs']")).click();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		Set<String> ids = driver.getWindowHandles(); //does not store value base on index.
		
		ArrayList<String> a = new ArrayList<String>(ids); //it stores on basis of index
		System.out.println(a.get(0)); //parent
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Selenium MNC");
		System.out.println("=============");
		
		System.out.println(a.get(1));
		driver.switchTo().window((String) a.get(1)); //control changing statement
		String child1 = driver.getTitle();
		System.out.println(child1);
		
		System.out.println("=============");
		System.out.println(a.get(2));
		driver.switchTo().window((String) a.get(2)); //control changing statement
		String child2 = driver.getTitle();
		System.out.println(child2);
		driver.close();
	
		//Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}