package framework.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.freecrm.util.Constants;

public class HomePage extends TestBase{

	@FindBy(linkText = "Contacts")
	WebElement contactsTab;

	WebElement contactsTab1= driver.findElement(By.linkText("Contacts"));

	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement newContactLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsTab;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle(){
		return driver.getTitle();
	}
	
	public void switchToFrame()
	{
		driver.switchTo().frame(Constants.MAIN_PANEL_FRAME_NAME);
	}
	
	public void clickContactsTab(){

		contactsTab.click();
	}
	
	public ContactInformationPage clickOnNewContact(){

		newContactLink.click();
		
		return new ContactInformationPage(driver);
	}
	
	
	public void clickDealsTab(){
		dealsTab.click();
	}
	
	
	
	
	
}
