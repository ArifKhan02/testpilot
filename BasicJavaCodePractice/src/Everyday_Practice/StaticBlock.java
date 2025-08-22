package Everyday_Practice;

public class StaticBlock {
	static int var1;
	int var2=10;
	static 
	{
		var1=22;
		System.out.println("I am in Static block , My variable value is " +var1);
		
	}
	StaticBlock()
	{
		
		System.out.println("I am in constractor ");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb=new StaticBlock();
		//System.out.println("var1 "+var1);
		System.out.println("var1 "+sb.var2);
		
	}

}
