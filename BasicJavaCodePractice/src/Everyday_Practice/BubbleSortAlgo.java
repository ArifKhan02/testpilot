package Everyday_Practice;

public class BubbleSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {64,34,53,20,10};
		BubbleSortAlgo bb_sort=new BubbleSortAlgo();
		int []new_array=bb_sort.bubbleSort(arr);
		System.out.println("Sorted Array: ");
		for(int a : new_array) 
		{
			System.out.print(a+" ");
		}
	}
	public int [] bubbleSort(int [] array) 
	{	
		
		for(int i=0;i<=array.length-1;i++) 
		{
			for(int j=0;j<=array.length-1-1;j++) 
			{
				if (array[j]>array[j+1]) 
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
		
	}

}
