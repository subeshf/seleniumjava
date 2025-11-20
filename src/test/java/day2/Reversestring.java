package day2;

public class Reversestring {

	public static void main(String[] args) {
		
		String mn= "Subeshsapkota";
		
		char ab[]=mn.toCharArray();
		
		String fstring="";
		
		int len=mn.length();
		for(int i=0;i<len;i++)
		{
			fstring=ab[i]+fstring;
		}
		System.out.print(fstring);
		
	}

}
