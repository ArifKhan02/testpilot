package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayOperations {

	
	public void arraySortusingFunction() 
	{
		int [] int_arr= {1,5,2,6,3,7};
		//using functions
		 Arrays.sort(int_arr);
		
		 List<Integer>arr_list=new ArrayList<Integer>();
		 
	
		 for(int i=0;i<=int_arr.length-1;i++)
		 {
			 	 
			 arr_list.add(int_arr[i]);
		 }
		 //use of toArray
		System.out.println(arr_list.toArray()[5]);
		
		
		
	}
	public void arraySortWithoutusingFunction()
	{
		int [] int_arr= {1,5,2,6,3,7};
		

		for(int i=0;i<=int_arr.length-1;i++) 
		{
			for(int j=0;j<=int_arr.length-2;j++) 
			{
				if(int_arr[j]>int_arr[j+1]) 
				{
					int temp=int_arr[j];
					int_arr[j]=int_arr[j+1];
					int_arr[j+1]=temp;
					
					
				}
			}
			
			
		}
		for(int a:int_arr) 
		{
			
			System.out.print(a);
		}
		
		
	}
	
	
	
	public boolean arraYContainSameElementCheck() 
	{
		
		
		int [] array1={1,2,4,0,5,2,5};
		int [] array2={1,2,5,0,5,2,4};
		
		Arrays.sort(array1);
		
		Arrays.sort(array2);
		
		for(int i=0;i<=array1.length-1;i++) 
		{
			
		
		
				if(array1[i]!=array2[i]) 
				{
			
					return false;
				}
		
		
			
		}
		return true;
		
		
		
	}
	
	public void findingSomeOfArray() 
	{
		
		int [] Array1={1,2,4,6,8,7};
		int sum=0;
		for(int i=0;i<Array1.length;i++) 
		{
			sum+=Array1[i];
			
		}
		System.out.println("Sum of Array : "+sum);
		
		
		
	}
	public void sumOfArrayCheckEven() 
	{
		int [] arr1= {1,2,4,6};
		int [] arr2= {1,3,2,5};
		
		int [] arr3= new int[arr2.length];
		for(int i=0;i<arr1.length;i++) 
		{
			if((arr1[i]+arr2[i])%2==0)

			{
				arr3[i]=arr1[i];
	
			}

		}
		
		for(int arr:arr3) 
		{
			
			System.out.print(arr +" ");
		}

	}
	
	public void shuffleTheArray() 
	{
		Integer [] arr1= {1,2,4,6};
		List<Integer>list1=Arrays.asList(arr1);
		
		Collections.shuffle(list1);
		list1.toArray(arr1);
		
		for(int i=0;i<=arr1.length-1;i++) 
		{
			System.out.print(arr1[i]);
		}
		
	}
	public void findMaxElement() 
	{
		Integer [] arr1= {1,2,4,6};
		int max_ele=Collections.max(Arrays.asList(arr1));
		System.out.println(max_ele);
	
		//sorting
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1.length-1-1;j++) 
			{
				
				if(arr1[j]>arr1[j+1]) 
				{
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					
				}
			}
			
		}
		
		//printing minimum
		System.out.println(arr1[0]);
		//printing maxmum
		System.out.println(arr1[arr1.length-1]);
		//second largest number in array
		System.out.println(arr1[arr1.length-1-1]);
		
		
	}
	public void findTheDuplicateValueinArray() 
	{
		
		int [] arr1= {10,21,14,5,1,0,1,0};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		Map<Integer,Integer> map2=new HashMap<Integer,Integer>();

		
		
		for(int num:arr1) 
		{
			
			if(!(map.containsKey(num))) 
			{
				map.put(num,1);
				
			}
			else {
				
				
				map2.put(num,map.get(num)+1);
			}
		
		}
		for(Entry<Integer, Integer> m:map2.entrySet()) 
		{
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     ArrayOperations arr_oprs= new ArrayOperations();
		     //arr_oprs.arraySortusingFunction();
		     //arr_oprs.arraySortWithoutusingFunction();
		    /*boolean sameElementCheck= arr_oprs.arraYContainSameElementCheck();
		    if(sameElementCheck) 
		    {
		    	System.out.println("true ");
		    }else
		    {
		    	System.out.println("false ");
		    }*/
		   // arr_oprs.findingSomeOfArray();
		   // arr_oprs.sumOfArrayCheckEven();
		   // arr_oprs.shuffleTheArray();
		    //arr_oprs.findMaxElement();
		    //arr_oprs.findTheDuplicateValueinArray();
		    arr_oprs.findTheDuplicateValueinArray();
		    
	}

}
