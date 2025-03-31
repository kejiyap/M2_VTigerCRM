package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	//public static WebDriver sDriver; //used for listerners
	public SeleniumUtility1 sUtil=new SeleniumUtility1();
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	
	
	//For making WebDriver reference variable as thread safe
	public static ThreadLocal<WebDriver>driverInstance=new ThreadLocal<>();
	@BeforeSuite(alwaysRun=true)
	public void dbConnection() 
	{
		System.out.println("DB/ connection created");
	}
	@Parameters("Broswer")
	@BeforeClass(alwaysRun=true)
	public void launchBroswer(@Optional("chrome")String BROWSER) throws Exception
	{
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if (BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
		driver=new ChromeDriver();
		}
		//sDriver=driver;  //initilizing  static driver for listener
		//Used in listeners for screenshot for making driver as thread safe in parallel execution
		setDriver(driver); 
		sUtil.maximizewindow(driver);
		sUtil.impliciWait(driver, 15);
		
		String URL=pUtil.getDataFromPropertiesFile("url");
		sUtil.navigateToApplication(driver, URL);
		System.out.println("Browser launched sucessfully");
	}
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws Exception
	{
		String UN=pUtil.getDataFromPropertiesFile("username");
		String PWD=pUtil.getDataFromPropertiesFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.logintoApplication(UN,PWD);
		System.out.println("Login done sucessfully");
	}
	@AfterMethod(alwaysRun=true)
	public void logoutOperation()
	{
		HomePage hp=new HomePage(driver);
		hp.signOutOperation(driver);
		System.out.println("Logout done sucessfully");
	}
	@AfterClass(alwaysRun=true)
	public void closeBrower()
	{
		driver.quit();
		System.out.println("Browser closed sucessfully");
	}
	@AfterSuite(alwaysRun=true)
	public void closeDBConnection()
	{
		System.out.println("DB Connection closed");
	}
	//Set the current thread's copy of this thread-local variable to the spexified value
	public static void setDriver(WebDriver driver)
	{
		driverInstance.set(driver);
	}
	//Return the value in the current thread's copy of this thread-local variable
	public static WebDriver getDriver()
	{
		return driverInstance.get();
	}
}
