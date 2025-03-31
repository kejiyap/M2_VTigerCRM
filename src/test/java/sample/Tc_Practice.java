package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.CreateContextParameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManagerOutput;
import org.testng.annotations.Test;

import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility1;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import objectRepo.LoginPage;





public class Tc_Practice {
	@Test
	public void textcase() throws Exception 
	{
		SeleniumUtility1 sUtil=new SeleniumUtility1();
		ExcelUtility eUtil=new ExcelUtility();
		PropertiesUtility pUtil=new PropertiesUtility();
		
		String URL=pUtil.getDataFromPropertiesFile("url");
		String UN=pUtil.getDataFromPropertiesFile("username");
		String PWD=pUtil.getDataFromPropertiesFile("password");
		
		String fName=eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lName=eUtil.getDataFromExcelFile("Leads", 2, 2);
		String Company=eUtil.getDataFromExcelFile("Leads",2, 3);
		
		WebDriver driver=new ChromeDriver();
		sUtil.impliciWait(driver, 15);
		sUtil.maximizewindow(driver);
		sUtil.navigateToApplication(driver, URL);
		
		LoginPage lp=new LoginPage(driver);
		lp.logintoApplication(UN, PWD);
		
		HomePage hp=new HomePage(driver);
		hp.clickonLeadMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreateingNewLeadIcon();
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.CreatingNewLead(fName,lName,Company);
		
		hp.signOutOperation(driver);
		
		driver.quit();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
