package Everyday_Practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CountCharOccurrence
{

	public static void main(String[] args) 
	{
		String sentance="java python ruby java c python java";
		String[]word_array=sentance.split(" ");	
		int count=0;String new_string="";
		for(int i=0;i<=word_array.length-1;i++)
		{
			
			String word=word_array[i];
			for(int j=0;j<=word_array.length-1;j++) 
			{   
				if (word.equals(word_array[j]))
				{ 
					count++;
				}  
			}
			
			
			if(!new_string.contains(word)||word.matches("[a-z]")) 
			{
				new_string+=word+":no of occurrance: "+count	+"\n";
			}
			
			
			count=0;
		 } 
		   
		    System.out.println(new_string);
		   
		    
			
	}

}


