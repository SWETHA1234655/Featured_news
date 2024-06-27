package News;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewSuite {
  @BeforeSuite
  public void start() {
	  
	  System.out.println("---------suite started-------");
  }
  @AfterSuite
  public void end() {
	  
	  System.out.println("---------suite ended-------");
  }
  
}
