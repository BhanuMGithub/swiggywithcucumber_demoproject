package in.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.swiggy.pages.AllRestaurantsPage;
import in.swiggy.pages.LandingPage;
import in.swiggy.pages.PromotedRestaurantPage;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static PromotedRestaurantPage promotedRestaurantPage;
	protected static AllRestaurantsPage allRestaurantsPage;
	
 public static void init() {
	 System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
	 driver =new ChromeDriver();
	 landingPage=new LandingPage(driver);
	 allRestaurantsPage =new AllRestaurantsPage(driver);
	 promotedRestaurantPage =new PromotedRestaurantPage(driver);
		 
 }

}
