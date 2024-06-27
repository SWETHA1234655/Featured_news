package News;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void launch() {
	  System.out.println("launched website");
  }
  @BeforeTest
  public void createdriver() {
	  System.out.println("driver created successfully");
	  
  }
  @AfterTest
  public void closedriver() {
	  System.out.println("driver closed successfully");
	  
  }
  
}
