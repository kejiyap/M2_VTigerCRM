 package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass {
	@Test
	public void CON_002() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickonContactMenu();
		
		ContactPage cp=new ContactPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		String lastName=eUtil.getDataFromExcelFile("Contacts", 5, 1);
		String title=eUtil.getDataFromExcelFile("Contacts", 5, 2);
		String email=eUtil.getDataFromExcelFile("Contacts", 5, 3);
		String mobile=eUtil.getDataFromExcelFile("contacts", 5, 4);
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.createContact(lastName,title,email,mobile);
		}

}
