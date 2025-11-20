package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement framewe=driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(framewe);
		
		driver.findElement(By.xpath("//*[@class='col-xs-6 col-xs-offset-5']/input")).sendKeys("suvvv");
		driver.switchTo().defaultContent();
		
		WebElement ifamebutton =driver.findElement(By.xpath("//*[starts-with(text(),'Iframe with')]"));
		
		
		ifamebutton.click();
		
	}

}
