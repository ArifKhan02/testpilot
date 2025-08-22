package Everyday_Practice;

import java.util.Scanner;

public class ArmstromgNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		ArmstromgNumber amn=new ArmstromgNumber();
		
		System.out.println("the number is Armstrong Number :"+amn.findArmstrongNumber(number));
		
		
	}
	
	public boolean  findArmstrongNumber(int number) 
	{
		
		double actul_number=number;
		double result = 0;
		while(number!=0) 
		{
			int reminder=number%10;
			 result+=Math.pow(reminder,3);
			number=number/10;
			
			
		}
		if(actul_number==result) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
		
		
	}

}
