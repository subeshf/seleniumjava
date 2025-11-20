package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		WebElement butac=driver.findElement(By.xpath("//*[text()='Copy Text']"));
		
		WebElement el1= driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		WebElement el2= driver.findElement(By.xpath("//*[text()='Drop here']"));
		
		Actions acts =new Actions(driver);
		
		acts.doubleClick(butac).perform();
		
		acts.dragAndDrop(el1, el2).perform();
		
		acts.contextClick(butac);
		
		acts.moveToElement(el2).moveToElement(el1).perform();
		
		
		
		
		
		WebElement el3= driver.findElement(By.xpath("//*[text()='Dropped!']"));
		WebElement sliderr=driver.findElement(By.xpath("//*[@id='slider-range']//span[1]")); 
		System.out.println(sliderr.getLocation());
		acts.dragAndDropBy(sliderr, 880, 2019).perform();
		System.out.println(sliderr.getLocation());
		
		
		if(el3.getText().equals("Dropped!")==true)
		{
			System.out.println("passed");
		}
		
		//drag and drop
		
		
		

	}

}

