package News;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class NewClass {
  
  @BeforeClass
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
  @AfterClass
  public void logout() {
	  System.out.println("logout success");
  }	
}
