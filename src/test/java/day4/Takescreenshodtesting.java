package day4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Takescreenshodtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		
		option.setAcceptInsecureCerts(false);
		
		option.addArguments("--headless=new");
		option.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		TakesScreenshot photo= (TakesScreenshot) driver; // no need for webelent screenshot
		
		File source=photo.getScreenshotAs(OutputType.FILE);
		
		File target= new File(System.getProperty("user.dir")+"\\abc\\abc.png");
		source.renameTo(target);
		
		WebElement abc=driver.findElement(By.id("HTML1"));
		
		File source1 =abc.getScreenshotAs(OutputType.FILE);
        File target1 =new File(System.getProperty("user.dir")+"\\\\abc\\\\am.png");		
        source1.renameTo(target1);
		driver.close();

	}

}
