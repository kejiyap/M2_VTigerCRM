package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericUtility.SeleniumUtility1;

public class POMPractice {
	@FindBy(id="name")
	WebElement element;

public POMPractice(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility1 sUtil=new SeleniumUtility1();
		
		WebDriver driver=new ChromeDriver();
		sUtil.maximizewindow(driver);
		sUtil.impliciWait(driver, 15);
		sUtil.navigateToApplication(driver, "https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		POMPractice p=new POMPractice(driver);
		p.element.sendKeys("robin");
		Thread.sleep(2000);
		driver.navigate().refresh();
		p.element.sendKeys("robin1");

		

	}

}
