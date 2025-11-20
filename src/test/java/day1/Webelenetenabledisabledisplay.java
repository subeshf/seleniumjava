package day1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Webelenetenabledisabledisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//apply implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		//apply explicit wait
		
		
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
	WebElement disbox=	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='my-disabled']")));
		
	
	
	
		
		
		Boolean te= disbox.isEnabled();
	//	Boolean te1= driver.findElement(By.xpath("//input[@id='my-check-1']")).isSelected();
		
		//fluent wait 
		
  	  Wait<WebDriver> fle = new FluentWait<WebDriver>(driver)
  			  .withTimeout(Duration.ofSeconds(10))
  			  .pollingEvery(Duration.ofSeconds(2))
  			  .ignoring(NoSuchElementException.class);
  	  
  	  
  	  
  	  WebElement foo = fle.until(new Function<WebDriver, WebElement>() {
  		     public WebElement apply(WebDriver driver) {
  		       return driver.findElement(By.xpath("//input[@id='my-check-1']"));
  		     }  
  		   });
  	Boolean te1=foo.isSelected();
		
		if(te==true)
		{
			System.out.print("textbox is enable");
		}
		else
		{
			System.out.print("textbox  is not enable");
		}
		
		
		if(te1==true)
		{
			System.out.print("Check box is selected");
		}
		else
		{
			System.out.print("Check box is not selected");
		}


	}

}
