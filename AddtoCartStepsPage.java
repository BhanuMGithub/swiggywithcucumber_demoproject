package in.swiggy.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCartStepsPage extends Driver{
	
	@Given("A user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
	  Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	  System.out.print(driver.getTitle());
	    
	}
	@When("The user enters a part of Complete Delivery location")
	public void the_user_enters_a_part_of_complete_delivery_location() {
		landingPage.Enterocation();
		
	   
	}
	@When("selects the delivery location")
	public void selects_the_delivery_location() {
	   landingPage.selectLocation();
		
		
	}
	@Then("All the restaurants in the selected location should be displayed")
	public void all_the_restaurants_in_the_selected_location_should_be_displayed() {
		String actual_loc =allRestaurantsPage.locationofRestaurant();
		String expected_loc =landingPage.locationname_selected();
		String[] string1=actual_loc.split(",");
		String a="",b="";
		for(int i=0;i<string1.length;i++) {
			//System.out.println(string1[i]);
			a=string1[2];
			
		}
		String[] string2=expected_loc.split(",");
		for(int i=0;i<string2.length;i++) {
			//System.out.println(string2[i]);
			b=string2[2];
			
		}
		System.out.println(b);
		System.out.println(b);
		Assert.assertEquals(a,b);
	}
	@Then("The user clicks on first available restaurant")
	public void the_user_clicks_on_first_available_restaurant() {
		 allRestaurantsPage .selectRestaurant();
				
	}
	
	@Then("The user clicks on ADD button")
	public void the_user_clicks_on_add_button() {
	    
		promotedRestaurantPage.clickAddbutton();
		
	}
	@Then("The food item added to the cart should be displayed")
	public void the_food_item_added_to_the_cart_should_be_displayed() {
	 
		promotedRestaurantPage.verifyCartIsDisplayed();
		
		
	}
	@Then("The user clicks on CHECKOUT button")
	public void the_user_clicks_on_checkout_button()
	{
		
  		promotedRestaurantPage.clickCheckOut();
		}
	@Then("CHECKOUT page should be displayed")
	public void checkout_page_should_be_displayed() {
		
		 String txt=promotedRestaurantPage.CheckOutMsg();
    	 String expected_txt="SECURE CHECKOUT"; 
	     Assert.assertEquals(txt, expected_txt);
		
		
		
		
	}



}
