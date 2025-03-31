package genericUtility;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility1 {
	/**
	 * This is a generic method to open an application
	 * @param driver
	 * @param url
	 */
	public void navigateToApplication(WebDriver driver,String url)
	{
		driver.get(url);
	}
	/** 
	 * This is a generic method to maximixe the browser
	 * @param driver
	 */
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();

	}
	/**
	 * This is a generic method to provide implicit wait to the execution
	 * @param driver
	 * @param maxTime
	 */
	public void impliciWait(WebDriver driver,int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}


	//////Handling Alert Pouup///////
	/**
	 * This is a generic methodto accept the alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * This is a generic method to cancel the alert popup
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This is a generic method to alert Message
	 * @param driver
	 * @return
	 */


	public String getAlertMessage(WebDriver driver)
	{
		String value=driver.switchTo().alert().getText();
		return value;
	}
	/**
	 * This is a generic method to send value to alert popup
	 * @param driver
	 * @param value
	 */
	public void sendValueToAlert(WebDriver driver,String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	/////////////Handling dropdown/////////
	/**
	 * This is ageneric method to select option in adropdown using the Index
	 * @param element
	 * @param Index
	 */
	public void selectOptionByIndex(WebElement element,int Index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(Index);
	}
	/**
	 * This is a generic method to select option is dropdown using the value attributes
	 * @param element
	 * @param value
	 */
	public void selectOptionByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	/**
	 * This is a generic method to select option a dropdown using the VisibleText
	 * @param element
	 * @param visibleText
	 */
	public void selectOptionByvisibleText(WebElement element,String visibleText)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	////////////////////MouseAction//////////////////////
	/**
	 * This is a generic method to select option a MouseAction operation
	 * @param driver
	 */
	public void scrollWebpageToWebElement(WebDriver driver, WebElement ele)
	{
		Action act=new Action(driver);
		act.scrollToElement(ele).perform();

	}
	////////////////////////////////ScreenShot////////////////
	/**
	 * This is a generic method to select ScreenShot operation
	 * @param driver
	 * @return 
	 * @throws IOException
	 */
	public String takeScreenshot(WebDriver driver, String dateTimeStamp) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("com.crm.vtiger\\screenshotoperation\\image - "+dateTimeStamp+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();		//for listeners
	}

}


