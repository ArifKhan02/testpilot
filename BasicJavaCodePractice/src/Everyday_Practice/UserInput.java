package Everyday_Practice;


import java.io.InputStream;
import java.util.Scanner;

public class UserInput {
	
	
	public int sum(int x,int y) 
	{
		int a=x;
		int b=y;
		int sum=a+b;
		return sum;
	}
	public int sub(int x,int y) 
	{
		int a=x;
		int b=y;
		int sum=a-b;
		return sum;
	}
	public int mul(int x,int y) 
	{
		int a=x;
		int b=y;
		int sum=a*b;
		return sum;
	}
	public int div(int x,int y) 
	{
		int a=x;
		int b=y;
		int sum=a/b;
		return sum;
	}
	
	public int mod(int x,int y) 
	{
		int a=x;
		int b=y;
		int sum=a%b;
		return sum;
	}
	
	public int integer_value_reader() 
	{
		System.out.println("Enter the value...\t");
		Scanner sc=new Scanner(System.in);
		int value1=sc.nextInt();
		
		
		return  value1;
	}
	
	public static void main(String agrs[]) 
	{
		
		UserInput ad1=new UserInput();
		UserInput su1=new UserInput();
		UserInput mu1=new UserInput();
		UserInput di1=new UserInput();
		UserInput mo1=new UserInput();
		UserInput int_value_read=new UserInput();	
		
		
		System.out.println("*********  Addition *********");
		int add=ad1.sum(int_value_read.integer_value_reader(), int_value_read.integer_value_reader());
		System.out.println("addition of two number :"+add);
		
		System.out.println("********* Substraction  *********");
		int sub=su1.sub(int_value_read.integer_value_reader(), int_value_read.integer_value_reader());
		System.out.println("Subtruction of two number :"+sub);
		
		System.out.println("********** Multiplication *******");
		int mul=mu1.mul(int_value_read.integer_value_reader(), int_value_read.integer_value_reader());
		System.out.println("multiplication of two number :"+mul);
		
		System.out.println("********** Divition ***********");
		int div=di1.div(int_value_read.integer_value_reader(), int_value_read.integer_value_reader());
		System.out.println("divition of two number :"+div);
		
		System.out.println("**********Reminder ***********");
		int mol=mo1.mod(int_value_read.integer_value_reader(), int_value_read.integer_value_reader());
		System.out.println("Reminder of two number :"+mol);
		
		
		
	}

}

