package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Googledymanic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			driver.get("https://google.com/");
			driver.findElement(By.name("q")).sendKeys("Facebook");
			
			List<WebElement> opti = driver.findElements(By.xpath("//*[contains(text(),'book')]"));
			
			
			
			
			
			for(WebElement abc: opti)
			{
				System.out.println(abc.getText());
				if (abc.getText().equals("facebook app")) {
					
					abc.click();
					break;
					
				}
				//System.out.println(abc.getAttribute("value"));
			}
			
		}
		
	}

 
