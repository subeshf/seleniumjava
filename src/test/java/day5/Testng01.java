package day5;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng01 {
	
	ChromeOptions option;
	WebDriver driver;
	
	@BeforeClass()
	//@Parameters({"browser"})
	void openurl() {  // Changed parameter name from 'abz' to 'url' for clarity
		
		option = new ChromeOptions();
		
		 option.addArguments("--headless=new");
		option.addArguments("--incognito");
		
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(groups = {"a"})
	void Test2() {
		
		Assert.assertEquals(1, 1);
		
		SoftAssert ab = new SoftAssert();
		//ab.assertEquals(1, false);
		ab.assertAll();  // IMPORTANT: Must call this to report soft assertion failures
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println("Current url: " + url);
	}
	
	@Test(priority = 3)	
	void Test3() {
		
		Boolean logo = driver.findElement(By.cssSelector("img[alt=\"company-branding\"]")).isDisplayed();
		
		if (logo == true) {
			System.out.println("Logo is visible");
		} else {
			System.out.println("Logo is not visible");
		}
	}
	
	@Test(priority = 4, groups = {"abc", "def"}, dependsOnMethods = {"Test3", "Test2"}, dataProvider = "ab")
	void Test4(String user, String pass) {
		
		Boolean loginbutton = driver.findElement(By.cssSelector("button.oxd-button")).isEnabled();
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(user);
		driver.findElement(By.cssSelector("input.oxd-input[name=\"password\"]")).sendKeys(pass);
		
		if (loginbutton) {
			driver.findElement(By.cssSelector("button.oxd-button")).click();
		} else {
			System.out.println("Button is not visible");
		}
		
		String title2 = driver.getTitle();
		System.out.println(title2);
	}
	
	@AfterClass
	void last() {
		driver.quit();
	}
	
	@DataProvider(name = "ab", indices = {1})
	Object[][] abc() {  // Changed return type to Object[][]
		Object[][] vv = {
			{"Admin", "admin123"},
			{"Admin", "1234"},
			{"Admin1", "1234"}
		};
		
		return vv;
	}
}