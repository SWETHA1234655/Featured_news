package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider="dp")
	public void test(String name1)
	{
		System.out.println("Name is: "+name1);
	}
	@DataProvider(name="dp")
	String[] data()
	{
		String data[]= {"Rithu","Hari","Thara"};
		                
		return data;
	}

}
