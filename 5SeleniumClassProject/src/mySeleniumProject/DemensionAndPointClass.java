package mySeleniumProject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemensionAndPointClass {
public static void main(String[] args) 
throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "\\E:selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
Dimension d = new Dimension(400,800);
driver.manage().window().setSize(d);
 Thread.sleep(3000);
 
 Point p = new Point(400,400);
driver.manage().window().setPosition(p);
Thread.sleep(3000);
driver.quit();
}
}