package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a contact page POM class
 * @author Soundarya
 * @version 25.03.10
 */
public class ContactPage {
	
	@FindBy(xpath="//img[@title='create contact...']")
	private WebElement createnewContactsIcon;
	
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatenewContactsIcon()
	{
		return createnewContactsIcon;
	}
	
	/**
	 * This is a business library to click on Create New Contact Icon
	 */
	public void clickOnCreateNewContactIcon()
	{
		getCreatenewContactsIcon().click();
	}

}
