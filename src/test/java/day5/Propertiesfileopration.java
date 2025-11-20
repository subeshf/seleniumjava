package day5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Propertiesfileopration {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream ab= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\conf.properties");
		
		Properties mn= new Properties();
		
		mn.load(ab);
		
		
		System.out.println(mn.getProperty("url"));
		System.out.println(mn.getProperty("user"));
		System.out.println(mn.getProperty("pass"));
		
	Set <String> abm=	mn.stringPropertyNames();
		
	System.out.println(abm);
	
	

	}

}
