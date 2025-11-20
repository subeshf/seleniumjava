package day3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tableexcrise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub60
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		driver.get("https://blazedemo.com/");
		
		WebElement froma=driver.findElement(By.xpath("//*[@name='fromPort']"));
		WebElement Tob = driver.findElement(By.xpath("//*[@name='toPort']"));
		
		Select fromair= new Select(froma);
		
		fromair.selectByVisibleText("Boston");
		
		Select tobair= new Select(Tob);
		
	List <WebElement>  opts	=tobair.getOptions();
	
	for(WebElement kk : opts)
	{
		System.out.print(kk.getText());
		
		if (kk.getText().equals("London"))
		{
			kk.click();
		}
		
	}
	
	driver.findElement(By.xpath("//*[@value='Find Flights']")).click();
	
	List <WebElement> kuk=driver.findElements(By.xpath("//*[@class='table']//tr/td[6]"));
	
	double [] aee= new double[kuk.size()]; 
	int m=0;
for(WebElement aa :kuk)
{
	System.out.println(aa.getText());
	aee[m]=Double.parseDouble(aa.getText().replace("$",""));
			m++;
	
}



double minValue = aee[0];
int minIndex = 0;

for (int i = 1; i < aee.length; i++) {
    if (aee[i] < minValue) {
        minValue = aee[i];
        minIndex = i;
    }
}

System.out.println("Lowest number: " + minValue);
System.out.println("Index position: " + minIndex);


int newpos=minIndex+1;

driver.findElement(By.xpath("//*[@class='table']//tr["+newpos+"]/td[1]")).click();

driver.findElement(By.id("inputName")).sendKeys("subesh");
driver.findElement(By.id("address")).sendKeys("subesh");
driver.findElement(By.id("city")).sendKeys("subesh");
driver.findElement(By.id("state")).sendKeys("subesh");
driver.findElement(By.id("zipCode")).sendKeys("12345");
WebElement cardtype= driver.findElement(By.id("cardType"));

Select card= new Select(cardtype);
card.selectByVisibleText("Diner's Club");
driver.findElement(By.id("creditCardNumber")).sendKeys("subesh");
driver.findElement(By.id("creditCardMonth")).sendKeys("subesh");
driver.findElement(By.id("nameOnCard")).sendKeys("subesh");
driver.findElement(By.id("creditCardYear")).sendKeys("subesh");
driver.findElement(By.xpath("//*[@value='Purchase Flight']")).click();

Boolean  res= driver.findElement(By.xpath("//*[text()='Thank you for your purchase today!']")).isDisplayed();


if (res==true)
{
	System.out.print("Book ho gaya");
}

else {
	System.out.print("Book fail ho gaya");
}

driver.close();

	}

}
