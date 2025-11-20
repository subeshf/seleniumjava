package day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathsday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username' or @placeholder='Username']")).sendKeys("Admin");
	//	driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("testing");
		String heading =driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		
		System.out.print(heading);
		driver.findElement(By.xpath("//*[contains(@placeholder,'sword')]")).sendKeys("admin123");
		
		Boolean logo =driver.findElement(By.cssSelector("img[alt=\"company-branding\"]")).isDisplayed();
		if(logo==true)
		{
			System.out.print("logo is visable");
		}
		else
		{
			System.out.print("logo is not visable");
		}
		
		//driver.findElement(By.xpath("//*[starts-with(@class,'orangehrm-login-forgo')]")).click();
		  driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		
		String hl=driver.getWindowHandle();
		System.out.println("Single "+hl);
		
		Set <String> hls= driver.getWindowHandles();
		
	    for(String a1 :hls)
	    {
	    	System.out.println(a1);
	    }
		
	    
	  
	}

}
