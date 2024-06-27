package dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depends {
	@Test(priority=1)
	public void openapp()
	{
		
		System.out.println("app opened");
		
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	public void login()
	{
		Assert.assertTrue(false);
		System.out.println("login sucess//");
	
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	public void search()
	{
		System.out.println("search product");
	}
	
	@Test(priority=4,dependsOnMethods= {"login"})
	public void logout()
	{
		System.out.println("logout success//");
	}
	

}
