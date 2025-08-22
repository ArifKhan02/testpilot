package Everyday_Practice;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {22,12,30,99,28,76,89,11,20,100};
		SecondHighestNumber SHN=new SecondHighestNumber();
		int Second_large_ele=SHN.secondHighestNumbe(arr);
		System.out.println(Second_large_ele);
	}
	public int secondHighestNumbe(int [] arr1) 
	{ 
		int []arr2=arr1;
		for(int i=0;i<=arr2.length-1;i++) 
		{
			for(int j=0;j<=arr2.length-1-1;j++) 
			{
				if(arr2[j]>arr2[j+1]) 
				{
					int temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
		
		int second_largest_element=arr2[arr2.length-2];
		return second_largest_element;
	}
}
