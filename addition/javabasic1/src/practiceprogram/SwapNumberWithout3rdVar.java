package practiceprogram;

public class SwapNumberWithout3rdVar {
	
	public static void main(String []Args) {
		int a,b;
		a=10;
		b=12;
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b; 
		System.out.println("a= "+a+" b= "+b);
	}
}
