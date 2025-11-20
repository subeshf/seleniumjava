package day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alterttesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement simpleal=driver.findElement(By.xpath("//*[text()='Simple Alert']"));
		
		simpleal.click();
		
		//switch to alert
		
		Alert ab =driver.switchTo().alert();
		
		System.out.print(ab.getText());
		ab.accept();
		
		//WebElement confirmal=driver.findElement(By.xpath("//*[text()='Confirmation Alert']"));
		
		
		//WebElement confirmal=driver.findElement(By.xpath("//*[starts-with(text(),'Confirmation Alert')]"));
		
		
WebElement confirmal=driver.findElement(By.xpath("//*[contains(text(),'Confirmation Alert')]"));
		
		
		confirmal.click();
		Alert mn=driver.switchTo().alert();
		System.out.print(mn.getText());
		mn.dismiss();
		
		
		
		//promte alert 
		
WebElement promte =driver.findElement(By.xpath("//*[contains(text(),'Prompt Alert')]"));
		
		
		promte.click();
		Alert mnb=driver.switchTo().alert();
		  mnb.sendKeys("I am subesh");
		  
		  
		  mnb.accept();
		  
		  WebElement vtext =driver.findElement(By.xpath("//*[@id='demo']"));	  
		  System.out.println(vtext.getText());
		
		
		
		
	}

}
