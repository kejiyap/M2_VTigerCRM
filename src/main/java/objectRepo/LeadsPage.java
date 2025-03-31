package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Leads Page POM class
 * @author Soundarya
 * @version 25.03.10
 */
public class LeadsPage {
	@FindBy(xpath="//a[@text()='Sign Out']")
	private WebElement createNewLeadsIcon;
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	private WebElement getCreateNewLeadsIcon() 
	{
		return createNewLeadsIcon;
	}
	public void clickOnCreateingNewLeadIcon()
	{
		getCreateNewLeadsIcon().click();
	}
	
}
