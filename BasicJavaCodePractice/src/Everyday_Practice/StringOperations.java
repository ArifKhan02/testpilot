package Everyday_Practice;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Arif Khan ";
		
		//to Uppercase
		String name1=name.toUpperCase();
		System.out.println(name1);
		
		//count how many A present in this string
		char [] name_chs=name.toCharArray();
		int count=0;
		for(char ch:name_chs) 
		{
			if(ch=='A' || ch=='a') 
			{
				count++;
				
			}
		}
		System.out.println("number of A in the string is :"+count);
		
		
		//remove space from the string and all the words
		
		String name3=name.replaceAll("\\s","");
		System.out.println(name3);
		
		//remove leading and trail spaces from the string 
		String name4=" Arif Khan ";
		String name5=name4.trim();
		System.out.println(name5);
		
		//remove leading and trail spaces from string using replaceAll()
		String name6=name4.replaceAll("^\\s+\\s&","");
		System.out.println("name6 "+name6);
		
		//count number of vowels in string
		
		for(char ch:name_chs) 
		{
			if(ch=='A' || ch=='E'||ch=='I' || ch=='O'||ch=='U') 
			{
				count++;
				
			}
		}
		
		//String concatianton
		String S1="Java";
		String S2="world";
		int val=10;
		//adding string with string
		System.out.println(S1+S2);
		
		//adding string with integer
		System.out.println(S1+val);
		
		//String 
	}

}

