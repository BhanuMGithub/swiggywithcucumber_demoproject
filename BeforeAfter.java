package in.swiggy.testscripts;

import in.swiggy.testscripts.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	@Before
	public void setUp(Scenario scenario)
	{
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://swiggy.com");
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}



