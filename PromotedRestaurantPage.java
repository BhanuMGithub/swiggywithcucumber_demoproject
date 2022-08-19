package in.swiggy.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromotedRestaurantPage {
	WebDriverWait wait;
	
		
	@FindBy(xpath="//div[@class='_1RPOp']")
	private List<WebElement> AddButton;
	
	@FindBy(xpath="//span[@class='_1W_TH']")
	private WebElement continueButton;
	
	@FindBy(xpath="//span[@class='_38xdN']")
	private WebElement AddItemButton;
	
	@FindBy(xpath="//button[@class='_1gPB7']")
	private WebElement checkout_btn;
	
	@FindBy(xpath="//span[@class='_2EQ3T']")
	private WebElement secureCheckOut_txt;
	
	@FindBy(xpath="//div[@class='_5ZwHn']/div/div")
	private WebElement cart_section;
	
	public PromotedRestaurantPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	}

	
	public void clickAddbutton() {
		wait.until(ExpectedConditions.visibilityOfAllElements(AddButton));
		for(int i=1;i<AddButton.size();i++)
		{
			AddButton.get(i).click();
		   break;
		   }
		
	}
	/*
	 * public void Additembutton() {
	 * wait.until(ExpectedConditions.visibilityOf(AddItemButton));
	 * if(AddItemButton.isDisplayed()) {
	 * 
	 * // continueButton.click(); 
	 *    AddItemButton.click(); }
	 * else {
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(cart_section)); }
	 * 
	 * 
	 * }
	 */
	
	public void verifyCartIsDisplayed() {
		cart_section.getText().equals("Cart");
	}
	 
     public void clickCheckOut()
     {
		wait.until(ExpectedConditions.visibilityOf(checkout_btn));
		checkout_btn.click();
		
		}
     
     
     
     public String CheckOutMsg()
     {
    	 wait.until(ExpectedConditions.visibilityOf(secureCheckOut_txt));
         return secureCheckOut_txt.getText();
     }
}
