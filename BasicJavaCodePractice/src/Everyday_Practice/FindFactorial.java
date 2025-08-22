package Everyday_Practice;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFactorial fact_find=new FindFactorial();
		//with recursive method
		int result =fact_find.findFactorial(4);
		System.out.println(result);
		//with iterations methods
		int result2=fact_find.itretive_findFactorial(4);
		System.out.println(result2);
		
	}
	
	public int findFactorial(int n) 
	{
		if(n==0||n==1) 
		{
			return 1;
		}
		return n*findFactorial(n-1);
	}
	
	public int itretive_findFactorial(int n) 
	{   
		int result=1;
		if(n==0||n==1) 
		{
			return result;
		}
		else 
		{
			for(int i=2;i<=n;i++) 
			{
				result*=i;
				
				
			}
			
		}
		return result;
		
	}

}
