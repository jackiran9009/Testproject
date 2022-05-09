package pomConcept;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePageClass {
	
	//Pom class for homePage
	//declaration
	
	@FindBy (xpath = "//img[@src = '/img/default/top_nav/"
			+ "default-logo.png?hash=274618146']")  
     private WebElement logo;   
	
	@FindBy(xpath = "//a[@id = 'logoutLink']")
	private WebElement logout;
	
	//initialiazation
	
	public ActiTimeHomePageClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//usage
	
	public void verifyActiTimeHomePageLogo()
	{
		boolean result = logo.isDisplayed();
		if(result == true)
		{
			System.out.println("Logo is Visible");
		}
		else
		{
			System.out.println("Logo is NOT visible");
		}
				
	}
	
	public void clickOnLogoutLink()
	{
		logout.click();
	}
	
	
	
	
	
	
}