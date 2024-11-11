package basics;

public class ConsonantAndVowels {

	public static void main(String[] args) {
		String name = "vatsalaeiou";
		int count=0;
		int count1=0;
	char n[]=	name.toCharArray();
	
	for(int i=0;i<name.length();i++)
	{
		         if(n[i]=='a' ||n[i]=='e'||n[i]=='i'||n[i]=='o'||n[i]=='u' )
		         {
		        	count=count+1; 
		         }
		        
		         else
		         {
		        	 count1=count1+1;
		         }
		        
		         
		         
	}
	System.out.println(count);
	System.out.println(count1);
	   
	         
	}
		
	
	
}

