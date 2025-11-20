package day2;

import java.util.Arrays;

public class Anargam {

	public static void main(String[] args) {
		
		String mn= "stop";
		
		String bn="post";
		
		char[]s1=mn.toCharArray();
		char[]s2=bn.toCharArray();
		
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
	
		
		if(	Arrays.equals(s1, s2))
		{
			System.out.println("Yesw");
		}
		
		String a1= new String(s1);
	
		String a2= new String(s2);
		
		if (a1.equals(a2))
		{
			System.out.print("Yesw");
		}
		
		
		
	}
	
}
