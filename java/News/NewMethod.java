package News;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewMethod {
	
  @BeforeMethod
  public void login() {
	  System.out.println("login success");
  }
  @Test(priority=1)
  public void search() {
	  System.out.println("searched");
  }
  @Test(priority=2)
  public void advsearch() {
	  System.out.println("advanced search done"); 
  }
  @AfterMethod
  public void logout() {
	  System.out.println("logout success");
  }	
  
}
