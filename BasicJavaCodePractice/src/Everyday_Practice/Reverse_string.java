package Everyday_Practice;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String original_string=sc.nextLine();
		String rev_string="";
		for(int i=original_string.length()-1;i>=0;i--) 
		{
			rev_string=rev_string+original_string.charAt(i);
		}
		String new_string=""+rev_string.charAt(1)+rev_string.charAt(0)+rev_string.substring(2);
		System.out.println("your wife name "+new_string);

	}

}
