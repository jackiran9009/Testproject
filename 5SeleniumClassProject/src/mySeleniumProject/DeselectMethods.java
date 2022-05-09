package mySeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DeselectMethods {
public static void main(String[] args) 
throws InterruptedException {
System.setProperty("webdriver.chrome.driver","\\E:selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.get("https://demoqa.com/selectmenu");
WebElement ele = driver.findElement(By.xpath("//select[@id ='cars']"));
Select s = new Select(ele);
s.selectByVisibleText("Audi");
Thread.sleep(5000);
s.deselectByVisibleText("Audi");
Thread.sleep(4000);
driver.quit();
}
}