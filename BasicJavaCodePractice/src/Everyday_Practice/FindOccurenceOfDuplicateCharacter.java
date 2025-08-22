package Everyday_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindOccurenceOfDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Intervieww";
		char [] arr1 = str1.toCharArray();
		int count=0;
		Set<Character> charlist=new HashSet<Character> ();
		List<Character>alist=new ArrayList<Character>();
		for(char c:arr1) 
		{
			
			
			if(!(charlist.add(c))) 
			{
				
				System.out.println("Duplicate character "+c);
				alist.add(c);
				
			}
			
		}
		for(char c:alist) 
		{
			
			for(int i=0;i<=arr1.length-1;i++) 
			{
				
				if(arr1[i]==c) 
				{
					
					count++;
					
					
				}
				
			}
			System.out.print("duplicate character "+c +" occurance :"+count);
			System.out.println();

			count=0;
		}
		
		
		
		
	}

}
