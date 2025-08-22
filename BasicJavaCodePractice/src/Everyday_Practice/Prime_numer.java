package Everyday_Practice;

import java.io.IOException;
import java.util.Scanner;
public class Prime_numer {
			public static void main(String[] args) throws IOException 
			{
				System.out.println("enter the numbers");
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				System.out.println("My Numbers "+num );
				if(num>1 & num%2!=0 & num%num==0 ) 
				{
					
					System.out.println("number is prime");
				}
				else 
				{
					System.out.println("number not prime");
				}
								
			}
}