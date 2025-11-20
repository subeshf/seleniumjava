package day2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		main1();
			
		String mn= "madam";
		String cn= "madam";
	
		StringBuilder av= new StringBuilder(cn);
		av.reverse();
		
		if(av.toString().equals(mn)) {
			  System.out.print("Palindrome ist");

		}
   
		

	}
	

	public static void main1() {
			
		String mn= "madam";
		String cn= "";
	
	   for(int w=mn.length()-1; w>=0;w--)
	   {
		   cn=cn+ mn.charAt(w);
	   }
		
	   if(mn.equals(cn))
	   {
		   System.out.print("Palindrome 2nd");
	   }
	   

	}
	

}
