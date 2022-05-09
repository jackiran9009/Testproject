package pomTestClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomConcept.ActiTimeHomePageClass;
import pomConcept.ActiTimeLoginPageClass;

public class PomTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		ActiTimeLoginPageClass log = new ActiTimeLoginPageClass(driver);
		log.enterActiTimeLoginPageUsername();
		//Thread.sleep(3000);
		log.enterActiTimeLoginPagePassword();
		//Thread.sleep(3000);
		log.clickActiTimeLoginButton();
		
		ActiTimeHomePageClass home = new ActiTimeHomePageClass(driver);
		home.verifyActiTimeHomePageLogo();
		//Thread.sleep(3000);
		home.clickOnLogoutLink();
		//Thread.sleep(3000);
		driver.quit();
		
		
	}

}