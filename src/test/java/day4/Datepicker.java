package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	
	
	static void selectdym(WebDriver driver, String month, String year, String date )
	{
		
		List <WebElement> dateele;
		
while(true) {
	
	
			
			WebElement nextbuele	=driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']"));
			WebElement monthe	=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
			WebElement yearele	=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
			 dateele	=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
			
			if(year.equals(yearele.getText()) && month.equals(monthe.getText()))
			{
				break;
			}
			nextbuele.click();
			
			
			
			
			
			}
		
		
		for(WebElement seledate : dateele)
		{
		
			
			if(date.equals(seledate.getText()))
			{
				
			seledate.click();
			
			break;
			
		}
		
	}
	}
	
	
	
	public static void main(String args[])
	{
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://jqueryui.com/datepicker/");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	WebElement frame1	=driver1.findElement(By.xpath("//*[@class='demo-frame']"));
		driver1.switchTo().frame(frame1);
		
		
		
		driver1.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		selectdym( driver1, "December", "2030", "17" );


		
		}
		
	

}
