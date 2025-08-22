package Everyday_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//For loop
		System.out.println("for loop data");
		
		for(int i=0;i<=10;i++) 
		{
			
			System.out.print(i);
		}
		
		//while loop
		System.out.println();
		int i=0;
		System.out.println("while loop data");
		
		while(i<=5) 
		{
			
			System.out.print(i);
			i++;
		}
		
		
		System.out.println();
		//do while loop
		System.out.println("do while data");
		
		int j=0;
		do 
		{
			
			System.out.print(j);
			j++;
			
		}
		while(j<=6) ;
		
		//another way of for loop
		
		//String to array conversation
		System.out.println();
		System.out.println("chars print from string ");
		String name="arif khan";
		char [] name_arr=name.toCharArray();
		
		for(char ch:name_arr) 
		{
			
			System.out.println(ch);
		}
		
		
		//for loop for Array
		System.out.println();
		System.out.println("name print from array of names");
		
		String [] names={"john","james","sam","rohan"};
		for(String n:names) 
		{
			System.out.println(n);
			
		}
		
		
		//iterate through collections using Iterator
		
		System.out.println();
		System.out.println("iterate through collections using Iterator");
		
		List<String>name_list=new ArrayList();
		name_list.add("arif Khan");
		name_list.add("samir");
		name_list.add("Ifra");
		name_list.add("Sakir");
		
		Iterator it=name_list.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		
		
		

	}

}
