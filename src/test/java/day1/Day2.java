package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title=driver.getTitle();
		
		String url =driver.getCurrentUrl();
		
		System.out.println(title );
		System.out.print("Curent url"+url );
		
		Boolean logo =driver.findElement(By.cssSelector("img[alt=\"company-branding\"]")).isDisplayed();
		
		if(logo==true)
		{
			System.out.print("logo is visable");
		}
		else
		{
			System.out.print("logo is not visable");
		}
		
		Boolean loginbutton=driver.findElement(By.cssSelector("button.oxd-button")).isEnabled();
		
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input.oxd-input[name=\"password\"]")).sendKeys("admin123");
		
		
		if (loginbutton) {
			driver.findElement(By.cssSelector("button.oxd-button")).click();
		}
		else {
			
			System.out.print("Button is not visiable");
		}
	
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.quit();

	}

}
