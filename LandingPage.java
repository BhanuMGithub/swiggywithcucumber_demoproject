package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	WebDriverWait wait;
	String selected_loc;
	
	@FindBy(id="location")
	private WebElement input_location;
	
	@FindBy(xpath="//div[@class='_1oLDb']/button[2]/span[2]")
	private WebElement select_location;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));

    }
	
	public void Enterocation() {
		
		input_location.sendKeys("Majestic");
		

	}
	
	public void selectLocation() {
		wait.until(ExpectedConditions.visibilityOf(select_location));
		selected_loc=select_location.getText();
		select_location.click();
		
	}
	public String locationname_selected() {
			
		return selected_loc;
      }
	}
	
	
