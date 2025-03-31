package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	@Test
	public void strictlevelComparison()
	{
		String expectedName="Binod";
		String actualName="Bino";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualName,expectedName);
		s.assertTrue(actualName.equals(expectedName));
		System.out.println("soft Assertion strict level completed");
		s.assertAll();
	}
	@Test
	public void containslevelComparison()
	{
		String a1="hel";
		String a2="hello";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(a2.contains(a2), true);
		s.assertAll();
		System.out.println("Soft Assertion contains level completed");
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



