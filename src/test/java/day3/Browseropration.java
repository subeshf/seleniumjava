package day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browseropration {
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title=driver.getTitle();
		
		String url =driver.getCurrentUrl();
		
		System.out.println(title );
		
		 driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		 
		String output1only= driver.getWindowHandle();
		Set <String> mn = driver.getWindowHandles();
		
		
		ArrayList<String> kl = new ArrayList<String>(mn);
		
		
		
		System.out.println(kl.get(0));
		System.out.println(kl.get(1));
		
		driver.switchTo().window(kl.get(1));
		
	
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
	}
	
	

}
