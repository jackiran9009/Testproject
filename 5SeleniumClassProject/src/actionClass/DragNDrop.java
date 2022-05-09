package actionClass;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\salenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		//what is different between .build() and .perform()
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppable']"));

		Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).perform();
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}