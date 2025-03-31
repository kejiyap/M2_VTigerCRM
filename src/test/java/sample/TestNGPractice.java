package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {
	@Ignore
	@Test(priority=2)
	public void createUser()
	{
		System.out.println("User create");
	}
	@Test(priority=2,dependsOnMethods= {"delete User"})
	public void modifyUser()
	{
		System.out.println("User modified");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
	
			}
	
	
	


