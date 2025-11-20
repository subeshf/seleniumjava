package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMex {
	
	WebDriver driver;
	
	
	void a(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
//	https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	
	// page element action method  - page factory model
	
	@FindBy (css="button.oxd-button")
	WebElement cl; 
	
	public void clickbutton(){
		
		cl.click();
	}
	

}
