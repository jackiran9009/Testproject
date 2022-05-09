package mySeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "\\E:selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/r.php?r=101");
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Heloo");
WebElement day = 
driver.findElement(By.xpath("//select[@name= 'birthday_day']"));
WebElement month = 
driver.findElement(By.xpath("//select[@name= 'birthday_month']"));
WebElement year = 
driver.findElement(By.xpath("//select[@name= 'birthday_year']"));
Select s = new Select(day);
s.selectByVisibleText("19");
// s.selectByIndex(0);
// s.selectByValue("10");
Select s1 = new Select(month);
s1.selectByVisibleText("Oct");
Select s2 = new Select(year);
s2.selectByVisibleText("1990");
driver.findElement(By.xpath("//label[text()= 'Female']")).click();
driver.quit();
 }
}
