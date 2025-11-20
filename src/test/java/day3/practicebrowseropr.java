package day3;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicebrowseropr {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
		List <WebElement> ab=driver.findElements(By.xpath("//div[@id='laptops']/a"));
		
		
		for(WebElement av :ab)
		{
			av.sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			
			System.out.println("Link text" +av.getText());
			
		}
		
		
		Set <String> ww= driver.getWindowHandles();
		
		for(String bb: ww) {
			
			
			System.out.println("This is list of windows id"+bb);
		}
		
		
		for(String tt :ww)
		{
			
			driver.switchTo().window(tt);
			String titleofwind=driver.getTitle();
			
			System.out.println("This is title"+titleofwind);
			
			
			
		}
		
	}
	
}
