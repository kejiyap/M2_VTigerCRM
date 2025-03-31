package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertPractice {

	@Test
	public void strictlevelComparison()
	{
		String expectedName="Raja";
		String actualName="Raja";
		
		Assert.assertEquals(actualName,expectedName);
		System.out.println("Hard assertion strict level Completed");
	}
	@Test
	public void containlevelComparison()
	{
		String a1="Don";
		String a2="London";
		Assert.assertTrue(a2.contains(a1));
		System.out.println("Hard assertion contains level completed");
	}
   
}
