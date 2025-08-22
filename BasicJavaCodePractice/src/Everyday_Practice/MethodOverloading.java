package Everyday_Practice;

public class MethodOverloading {
	
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	


public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading cal = new MethodOverloading();
		int result1 = cal.add(2, 3);             // Calls the first add method
		double result2 = cal.add(2.5, 3.7);      // Calls the second add method
		int result3 = cal.add(2, 3, 5);          // Calls the third add method
		String [] array= {"2","3","4","5"};
		System.out.println(array.length);

	}

}
