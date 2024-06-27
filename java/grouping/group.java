package grouping;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class group {
  
  @Test(priority=1,groups= {"regression"})
  public void login() {
	  System.out.println("login success");
  }
  @Test(priority=2,groups= {"regression","sanity","functional"})
  public void search() {
	  System.out.println("searched");
  }
  @Test(priority=3,groups= {"sanity"})
  public void advsearch() {
	  System.out.println("advanced search done"); 
  }
  @Test(priority=4,groups= {"regression"})
  public void logout() {
	  System.out.println("logout success");
  }	
  
}
