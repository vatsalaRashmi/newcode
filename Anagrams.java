package basics;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String name1= "moon";
		String name2= "noeme";
		
		if(name1.length()==name2.length())
		{
			char a1[]=name1.toCharArray();
			char a2[]=name2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			System.out.println(Arrays.toString(a1));
			System.out.println(Arrays.toString(a2));
			//Arrays.equals(a1,a2);
			if(Arrays.equals(a1,a2)==true)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not an anagram1");
			}
			
		}
		
		else
		{
			System.out.println("not an anagram2");
		}

	}

}
