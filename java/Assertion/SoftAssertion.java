package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
  @Test
  public void f() {
	  //object created for SoftAssert class
	  SoftAssert sa=new SoftAssert();
	  
	  sa.assertEquals(123,567);
	  //Soft assertion--Eventhough the before statement got fail,the next statement got executed
	  System.out.println("Soft Assertion");
	  
	  //this will make my test method fail because of one failed test,otherwise it will make my test passed
	  sa.assertAll();
  }
}
