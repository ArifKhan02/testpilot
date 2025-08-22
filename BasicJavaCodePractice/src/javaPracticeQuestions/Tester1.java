/*Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.
1, 2, 4, 8, 16, 32, 64, ......, 1024
Sample Input and Output
input    Output
5		 1,2,4,8,16
*/

package javaPracticeQuestions;

import java.util.Scanner;

class Tester1 {
	
	int val=10;
	public static void main(String[] args) {
		// Implement your code here 
		Scanner sc =new Scanner(System.in);
		int input=sc.nextInt();
	    int expected=1;

		for(int i=1;i<=input;i++)
		{
		    
		    System.out.print(expected);
		    
		    if(i!=input)
		    {
		    	System.out.print(", ");
		    }
		    
		    expected=expected*2;
		    
		}
		
		Tester1 t1=new Tester1();
		Tester1 t2=new Tester1();

		System.out.println("Static value"+t2.val);
	}
}
