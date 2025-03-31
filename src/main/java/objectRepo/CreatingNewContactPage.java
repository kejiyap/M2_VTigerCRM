package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	
	@FindBy(id="title")
	private WebElement titleTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement mailingcityTextField;
	
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingstateTextField;
	
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	private WebElement getFirstNameTextField() 
	{
		return firstNameTextField;
	}

	private WebElement getLastNameTextField()
	{
		return lastNameTextField;
	}

	private WebElement getTitleTextField() 
	{
		return titleTextField;
	}

	private WebElement getEmailTextField() 
	{
		return emailTextField;
	}

	private WebElement getMobileTextField()
	{
		return mobileTextField;
	}

	private WebElement getMailingcityTextField() 
	{
		return mailingcityTextField;
	}

	private WebElement getMailingstateTextField() 
	{
		return mailingstateTextField;
	}

	private WebElement getMailingCountryTextField()
	{
		return mailingCountryTextField;
	}

	private WebElement getSaveButton()
	{
		return saveButton;
	}
	/**
	 * This is a business library to create a new Contact
	 * @param firstName
	 * @param lastName
	 * @param title
	 */
	public void creatingContact(String firstName,String lastName,String title)
	{
	getFirstNameTextField().sendKeys(firstName);
	getLastNameTextField().sendKeys(lastName);
	getTitleTextField().sendKeys(title);
	getSaveButton().click();
	}
	/**
	 * This is a business library to create a new contact
	 * @param lastName
	 * @param title
	 * @param email
	 * @param mobile
	 */
	public void createContact(String lastName,String title,String email,String mobile)
	{
		getLastNameTextField().sendKeys(lastName);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	/**
	 * This is a business library to create a new contact
	 * @param lastName
	 * @param mobile
	 * @param email
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void CreatingNewContact(String lastName,String mobile,String email,
									String mailingCity,String mailingState,String mailingCountry)
	{
		getLastNameTextField().sendKeys(lastName);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getMailingcityTextField().sendKeys(mailingCity);
		getMailingstateTextField().sendKeys(mailingState);
		getMailingCountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
	}
	
	      }
	
