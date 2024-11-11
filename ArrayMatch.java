package basics;

import java.util.Scanner;

public class ArrayMatch {

	public static void main(String[] args) {
		int age[] = new int[4];
		Scanner s1= new Scanner(System.in);
		
		for(int i=0;i<=3;i++)
		{
		   age[i]=       s1.nextInt();
		   
		   if(age[i]==34)
		   {
			   System.out.println("present");
		   }
		  
			   
		}
		
		System.out.println("not present");
		
	}

}
