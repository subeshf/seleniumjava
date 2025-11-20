package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.navigate().refresh();
		
		
		List <WebElement> ab = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	//select the checkbox	
	
	for(WebElement bb: ab)
	{
		
		if(bb.isSelected()==false)
		{
			bb.click();
			
		}
		
			
		
	}
		
	
		
	
	}

}
