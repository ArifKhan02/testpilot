package Everyday_Practice;

import java.util.Arrays;

public class Check_Array_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,3,7,5,6};
		int[]  arr2= {1,2,3,7,5,6};
		
		if(arr1.length!=arr2.length) 
		{
			System.out.print(false);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length-1;i++) 
		{
			if(arr1[i]!=arr2[i]) 
			{
				System.out.println(false);
			}
		}

	}

}
