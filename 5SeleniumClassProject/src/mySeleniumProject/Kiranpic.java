package mySeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kiranpic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\E:selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://steemitimages.com/p/ADdPNhvhBjYttVk5yE8qMPDszbyS8Ud19Vka1J4DpuMcTxNqMAD7vXgPVvohH4BzrHPBGSeKiG4mmdQL9VSRMMLr2?format=match&mode=fit&width=640");
	
	driver.quit();
	}
}
