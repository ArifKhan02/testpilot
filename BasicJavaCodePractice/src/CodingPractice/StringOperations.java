package CodingPractice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class StringOperations {

	
	
	//reverse String 
	public void reverseString() 
	{	
		String original_string=" Arif Khan ";
		String rev_string="";
		for(int i=original_string.length()-1;i>=0;i--) 
		{
			rev_string=rev_string+original_string.charAt(i);
		}
		System.out.println("Reverse String "+rev_string);
		
		//palindrom String check
		if(rev_string==original_string) 
		{
			
			System.out.println("String is Palindrom");
		}
		else 
		{
			System.out.println("String is not Palindrom");
		}
		
		//remove the spaces
		String without_space=original_string.replaceAll("\\s","");
		
		System.out.println("String without space:"+without_space);
		System.out.println("Original String Imutable"+original_string);
		
		String leadingandtrailspace_remove=original_string.replaceAll("^\\s||\\s$","");
		System.out.println("Leading and Trail Spaces Remove :"+leadingandtrailspace_remove);
		
		
		
	}
	
	//removeAllTheOccuranceOfChar
	public void removeAllTheOccuranceOfChar(char anyChar,String input_string)
	{
		
		String input=input_string;
		char given_chr=anyChar;
		String newStr ="";
		char [] char_arr=input.toLowerCase().toCharArray();
		for(char ch:char_arr) 
		{
			
			if(!(ch=='c')) 
			{
				newStr+=ch;
			}
		}
		System.out.println("String without the geiven char "+newStr);
		//input.indexOf(newStr);
		//input.charAt(given_chr);
		//input.contains(newStr);
		//input.concat(newStr);
		//input.lastIndexOf(newStr);
		//input.substring(0,2);
		//input.startsWith(newStr);
		//input.endsWith(newStr);
		//input.replace(anyChar, given_chr);
		//input.matches(newStr);
		
		
	}	

	//using Map collections
	public void distinctChars()
	{
		String input_chars="arifkhanakl";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		Map<Character,Integer> map2=new Hashtable<Character,Integer>();
		char [] char_arry=input_chars.toCharArray();
		for(char ch:char_arry) 
		{
			
			if(!(map.containsKey(ch))) 
			{
				
				map.put(ch,1);
				map2.put(ch,1);
			}
			else 
			{
				
				int freq=map.get(ch);
				map.put(ch,freq+1);
			}
	
		}
		
		
		System.out.println(map.keySet());
		Iterator<Character>it=map.keySet().iterator();
		while(it.hasNext()) 
		{
			System.out.print(it.next());
		}
		
		
		for(Entry<Character, Integer> e: map.entrySet())
		{
			System.out.println("\n"+"distinct cahracter  :"+e.getKey()+" count :"+e.getValue());
			
		}
		//map.containsKey(it);return true/false
		//map.containsValue(it);
		//map.isEmpty();
		//map.remove(it);
		//map.replace(key,old value,newvalue);
		//map.values()//collections
		
		
		
	}
	
	public void StringReverseOfLastWord() 
	{
		
		String name="I am Arif";
		String [] name_arr=name.split(" ");
		String temp_str="";
		String rev="";
		for(String str:name_arr) 
		{
			
			if(str.equals("Arif")) 
			{
				
				for(int i=str.length()-1;i>=0;i--) 
				{
					rev+=str.charAt(i);
					
					
				}
				
				continue;
			}
			
			temp_str=" "+str+temp_str;
			
			
		}
		
		 
		System.out.print(rev+" ");
		
		System.out.print(temp_str);
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException 
	
	{
		// TODO Auto-generated method stub
		StringOperations str_oprn=new StringOperations();
		//str_oprn.reverseString();
		//str_oprn.removeAllTheOccuranceOfChar('c',"ajkhkjfauccakxclkasc");
		
		//str_oprn.distinctChars();
		str_oprn.StringReverseOfLastWord();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}