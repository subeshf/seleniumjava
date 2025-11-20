package day2;

public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "subbbesh";
	
		char []vv=name.toCharArray();
		
		
	
		for(int i=0;i<vv.length;i++)
		{
			 if (vv[i] == '0') continue; 
			int count =1;
			for(int j=i+1;j<vv.length;j++)
			{
				if(vv[i]==vv[j])
				{
					count++;
					vv[j]='0';
				}
			}
			
			   if (count > 1) {
	                System.out.println(vv[i] + " = " + count);
	            }
		}
		
		
		
	}

}
