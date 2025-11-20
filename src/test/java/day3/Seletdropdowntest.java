package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seletdropdowntest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdownbox = driver.findElement(By.xpath("//*[@id='country']"));
		Select ab= new Select(dropdownbox);
		
		List<WebElement> opti= ab.getOptions();
		
		
		for(WebElement abc: opti)
		{
			//System.out.println(abc.getText());
			System.out.println(abc.getAttribute("value"));
		}
		
	}
	

}


