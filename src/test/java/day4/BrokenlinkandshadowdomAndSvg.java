package day4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinkandshadowdomAndSvg {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		String weblink="http://www.deadlinkcity.com/error-page.asp?e=400";
		
		URL checklink= new URL(weblink);
				
	HttpURLConnection conn	=(HttpURLConnection)checklink.openConnection();
		
		conn.connect();
		
		if(conn.getResponseCode()>=400)
		{
			System.out.print("Brokenlink");
		}
		
		else {
			
			System.out.print("notBrokenlink");
		}
		

	}

}
