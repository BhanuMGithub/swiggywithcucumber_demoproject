package in.swiggy.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllRestaurantsPage {
	
	WebDriverWait wait;
	@FindBy(xpath="//div[@class='_1HEuF']")
	private List<WebElement> promotedRestaurant;

	@FindBy(xpath="//span[@class='_3odgy']")
	private WebElement location_area;
	
	@FindBy(xpath="//span[@class='_3HusE']")
	private WebElement location_city;
	
	public AllRestaurantsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	
	public void selectRestaurant() {
		wait.until(ExpectedConditions.visibilityOfAllElements(promotedRestaurant));
		for(int i=1;i<promotedRestaurant.size();i++)
		{
		promotedRestaurant.get(i).click();
		break;
		}
	}
	
	public String locationofRestaurant() {
		wait.until(ExpectedConditions.visibilityOfAllElements(location_area));
		String Location=location_city.getText();
		System.out.println(Location);
		return Location;
		
		
	}
	
	

}
