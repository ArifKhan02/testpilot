package Everyday_Practice;

public class PalindromNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int org_num=121; int new_num=0;int rem;
		int org_num1=org_num;
		while(org_num!=0) 
		{
			rem=org_num%10;
			new_num=new_num*10+rem;
			org_num=org_num/10;
			
			
		}
		if(org_num1==new_num) 
		{
			System.out.println("number is palindrom");
		}

	}

}
