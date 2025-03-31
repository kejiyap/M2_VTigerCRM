package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a Login page POM class
 * @author Soundarya
 * @version25.03.07
 */
public class LoginPage {

	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTextFiled;

	@FindBy(xpath="//input[@password='user-password']")
	private WebElement passwordTextfild;

	@FindBy(id="submitButton")
	private WebElement loginButton;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUsernameTextFiled()
	{
		return usernameTextFiled;
	}
	public WebElement getUsernameTextField()
	{
		return passwordTextfild;
	}

	public WebElement getLoginButton()
	{
		return loginButton;
	}

	public WebElement getPasswordTextfild() {
		return passwordTextfild;
	}

	/**
	 * This is a businesslibrary to perform login operation
	 * @param username
	 * @param password
	 */
	public void logintoApplication(String username,String password)
	{
		getUsernameTextField().sendKeys(username);
		getPasswordTextfild().sendKeys(password);
		getLoginButton().click();
	}


}