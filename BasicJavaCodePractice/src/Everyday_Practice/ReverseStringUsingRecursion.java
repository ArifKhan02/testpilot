package Everyday_Practice;

public class ReverseStringUsingRecursion {
	
	public String recursionOfString(String str1) 
	{
		if(str1.isEmpty())
		{
			return str1;
		}
		
		return recursionOfString(str1.substring(1))+str1.charAt(0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseStringUsingRecursion rev_string=new ReverseStringUsingRecursion();
		System.out.println(rev_string.recursionOfString("Arif"));
		
				

	}

}
