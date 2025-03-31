package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {


	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;

	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastNameTextField;

	@FindBy(xpath="//input[@name='Company']")
	private WebElement companyTextField;

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement leadSourceTextField;
	
	@FindBy(xpath="//input[@name='noOfEmployees]")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement stateTextField;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement CountryTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	private WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	private WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	private WebElement getCompanyTextField() {
		return companyTextField;
	}
	
	private WebElement getLeadSourceTextField() {
		return leadSourceTextField;
	}
	
	private WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	private WebElement getEmailTextField() {
		return emailTextField;
	}

	private WebElement getMobileTextField() {
		return mobileTextField;
	}

	private WebElement getCityTextField() {
		return cityTextField;
	}

	private WebElement getStateTextField() {
		return stateTextField;
	}
	
	private WebElement getCountryTextField() {
		return CountryTextField;
	}

	private WebElement getSaveButton() {
		return saveButton;
	}

    /**
	 * *This is a Business Library to create a new Lead
	 * @param firstname
	 * @param lastname
	 * @param company
	 */
	public void CreatingNewLead(String firstname,String lastname,String company)
	{
		getFirstNameTextField().sendKeys(firstname);
		getLastNameTextField().sendKeys(lastname);
		getCompanyTextField().sendKeys(company);
		getSaveButton().click();
	}
	/**
	 * This is a Business Library to create a new Lead
	 * @param lastname
	 * @param company
	 * @param leadsource 
	 * @param noOfEmployees
	 * @param mobile
	 */
	public void CreatingNewLead(String lastname,String company,String leadsource,String noOfEmployees,String mobile)
	{
		getLastNameTextField().sendKeys(lastname);
		getCompanyTextField().sendKeys(company);
		getLeadSourceTextField().sendKeys(leadsource);
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	/**
	 * This is a Business library create new lead
	 * @param lastname
	 * @param company
	 * @param noOfEmployees
	 * @param mobile
	 * @param email
	 * @param city
	 * @param country
	 * @param state
	 */
	public void CreatingNewLead(String lastname,String company,String noOfEmployees,String mobile,String email,String city,String country,String state)
	{
		getLastNameTextField().sendKeys(lastname);
		getCompanyTextField().sendKeys(company);
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getCityTextField().sendKeys(city);
		getStateTextField().sendKeys(state);
		getCountryTextField().sendKeys(country);
		getSaveButton().click();
		
	}

}