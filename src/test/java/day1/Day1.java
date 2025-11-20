package day1;

import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.google.common.base.Functions;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://khatabook.com/");
		
		
		
		String title=driver.getTitle();
		
		String url =driver.getCurrentUrl();
		
		System.out.println(title );
		System.out.print("Curent url"+url );
		
		
		//
		
	  WebElement searchbox = driver.findElement(By.xpath("//*[@name='phoneNumber']"));
	  
	  WebElement searchbutton = driver.findElement(By.className("MuiButton-root"));
	  
		 List <WebElement> im =driver.findElements(By.tagName("img"));
		 
		 
		WebElement iml= im.get(0);
		
		String bvc=iml.getAttribute("src");
		System.out.println(bvc);
		
		
		
		 System.out.println(im.size() );
		 
		// ArrayList <String> km= new ArrayList<String>();
	  
	  
	  
	  searchbox.sendKeys("8084725855");
	  
	  Thread.sleep(1000);
	  
	  searchbutton.click();
	  
	  WebElement popupphonefield = driver.findElement(By.xpath("//*[@name='phone']"));
	  
	  WebElement getOtpBtn = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	 // WebElement getOtpBtn = driver.findElement(By.xpath("//button[@type='submit']"));

	  WebElement linkabout = driver.findElement(By.xpath("//p[text()='About Us']"));
	  
	  WebElement parlinkabout = driver.findElement(By.partialLinkText("About"));
	 
	  
	 // WebElement getOtpBtn = driver.findElement(By.xpath("//button[normalize-space()='Get OTP']"));

	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  //popupphonefield.sendKeys("8084725855");
		
	  getOtpBtn.click();
	  linkabout.click();
	  parlinkabout.click();
		
		//driver.close(); // it will close only one browser tab which is opened during automation
		driver.quit();  // it will close all browser tab which is opened during automation
		

	}

}
