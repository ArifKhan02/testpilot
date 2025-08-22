package Everyday_Practice;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2=20;
		
		//with using temp variable
		/*int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1 +" " +num2);*/
		
		//Without using temp 
		
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println(num1+" "+num2);
		
		
	}
	

}
