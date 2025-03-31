package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()='Leads' and href=' index.php?module=Leads&action=index']")
	private WebElement leadMenu;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement ContactMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath="//a[@text()='Sign Out']")
	private WebElement signOutOperation;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	private WebElement getLeadMenu() {
		return leadMenu;
	}

	private WebElement getContactMenu() {
		return ContactMenu;
	}

	private WebElement getAccountsIcon() {
		return accountsIcon;
	}

	private WebElement getSignOutOperation() {
		return signOutOperation;
	}
	/**
	 * This is a business library to click on Leads Menu
	 */
	public void clickonLeadMenu()
	{
		getLeadMenu().click();
	}
	/**
	 * This is a business llibrary to click on contacts Menu
	 */
	public void clickonContactMenu()
	{
		getContactMenu().click();
	}
	/**
	 * This is a business library to perform signout operation
	 * @param driver
	 */
	public void signOutOperation(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(getAccountsIcon()).perform();
		getSignOutOperation().click();
	}

}
