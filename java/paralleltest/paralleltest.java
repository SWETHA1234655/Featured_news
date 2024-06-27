package paralleltest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltest {
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void driver(String val)
	{
		switch(val)
		{
		case "chrome": driver=new ChromeDriver();
		break;
		case "edge": driver=new EdgeDriver();
		break;
		default: System.out.println("Invalid input");
		return;
		}
		driver.get("https://onecognizant.cognizant.com/Home");
		
		
	}

}
