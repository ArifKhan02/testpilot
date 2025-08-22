package Everyday_Practice;

public class SpaceSeparate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name="Arif Khan";
		String [] name=Name.split(" ");
		for(int i=0;i<=name.length-1;i++) 
		{
			System.out.println(name[i]);
		}
		
		String new_name=Name.replaceAll("\\s","");
		System.out.println(new_name);
	}

}
