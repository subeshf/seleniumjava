package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableopration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		List<WebElement> rowsvalues= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		List<WebElement> headervalueoftable= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		
		int rowcount= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		
		int colcount= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
		
		
		//table[@name='BookTable']/tbody/tr[2]/td[3]
		
		
		System.out.println(rowcount);
		System.out.println(colcount);
		
		//print value of table header
	for(WebElement mn : headervalueoftable)
	{
		//System.out.println(mn.getText());
	}
	
	//print value of table content
	
	for(int i=2;i<rowcount;i++)
	{
		
		for(int j=1;j<colcount;j++)
		{
			String val=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" +i+"]/td[ "+j+"]")).getText();
			
			System.out.print(val + "  ");
		}
		System.out.println();
		
	

	}
	}
}
