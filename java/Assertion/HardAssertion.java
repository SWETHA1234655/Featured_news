package Assertion;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
  @Test
  public void f() {
	  Assert.assertEquals("rithu", "rithu");
  }
  @Test
  public void M() {
	  
	  Assert.assertEquals("RITHU", "rithu");
	  System.out.println("Rithu/rithu failed");
//problem in hard assertion if before statement is failed then after statement will not get executed!!
	  Assert.assertEquals("123", "123");
	  System.out.println("123/123 passed");
	  
  }
  @Test
  public void S() {
	  String name1="Krishnamoorthy.T";
	  String name2="Krishnamoorthy.T";
//	  Assert.assertEquals(name1, name2);
	  
	  if(name1.equals(name2))
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.assertTrue(false); 
	  }
  }
}
