package Everyday_Practice;

public class ConstructorCall {
	private int var1;
	private int var2;
	
	public ConstructorCall(int var1) 
	{
		this(var1,0);
	}
	
	public ConstructorCall(int var1,int var2) 
	{
		this.var1=var1;
		this.var2=var2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCall cc=new ConstructorCall(20,30);
		System.out.print(cc.var1+" "+cc.var2);
	}

}
