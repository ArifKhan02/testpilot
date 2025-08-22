package Everyday_Practice;

public class Pyramidbuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Half number pyramid building
		for(int i=0;i<10;i++)
		{
			int k=0;
			for(int j=0;j<=10-i;j++)
			{
				
				System.out.print(" ");
				
			}
			while(k!=i*2) 
			{
				
				System.out.print("* ");
				k++;
			}
			System.out.println();
				
		}
		
		
	}

}
