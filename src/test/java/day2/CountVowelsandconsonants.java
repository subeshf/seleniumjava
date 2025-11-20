package day2;

public class CountVowelsandconsonants {

	public static void main(String[] args) {
	
		String name1="Subesh is my name??@@##";
		
		String name2 = name1.replaceAll("[^A-Za-z]", "");
		
	        String name=name2.toLowerCase();
	        
	        
		
		char[]a=name.toCharArray();
		int len=a.length;
		
		int vol=0,cos=0;
		
		for(int i=0;i<len;i++) {
			
			if ("aeiou".indexOf(a[i]) != -1)
			{
				vol++;
			}
			
			else {
				
				cos++;
			}
		}
		
		System.out.println(vol);
		System.out.print(cos);
		
	}

}
