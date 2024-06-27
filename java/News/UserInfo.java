package News;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserInfo {
	@Test(priority=1)
	public void openapp(){
		System.out.println("Name");
		
	}
	@Test(priority=2)
	public void search()
	{
		System.out.println("watsapp");
	}
	@Test(priority=3)
	public void closeapp()
	{
		System.out.println("gmail");
	}

	

}
