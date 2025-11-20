package day2;

import java.util.Arrays;

public class Day2 {
	
	
	public static void main(String args[]) {
		
		String ab= "Subesh";
		ab=ab.toLowerCase();
		char am[]=ab.toCharArray();
		
		Arrays.sort(am);
		
		String nn= new String(am);
		
		System.out.print(nn);
		
	}

}
