package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsoprations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		
	driver.get("https://testautomationpractice.blogspot.com/");
	
	WebElement namebox= driver.findElement(By.id("name"));
	JavascriptExecutor ab =   (JavascriptExecutor)  driver;
	

	
	
	ab.executeScript("arguments[0].setAttribute('value','subesh')", namebox );
	
	WebElement simpleal=driver.findElement(By.xpath("//*[text()='Simple Alert']"));
	
	ab.executeScript("arguments[0].click()",simpleal);
	
	
	

	}

}
