package actionClass;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ScroolDown {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "\\E:selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/select-menu");
			
			WebElement ser = driver.findElement(By.xpath("(//li[@id = 'item-8'])[2]"));
			Point loc = ser.getLocation();
			 System.out.println(loc);
			
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll(50, 1117)");//(+ive)vertically scroll down
			Thread.sleep(6000);
			
			 driver.quit();
			
			/*	js.executeScript("scroll(0,-800)");//(-ive)vertically scroll up
			Thread.sleep(6000);
			driver.quit();
			
			*/
			 
			 
			
			
		}

	}

