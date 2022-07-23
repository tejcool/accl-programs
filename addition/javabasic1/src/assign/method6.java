package assign;

public class method6 {
	public static void main(String[] args) {
		System.out.println("Program Starts...");
		method6 m1=new method6();
	//	m1.additionOfTwoNumbers(25, 45);
		
		//double res=m1.getAdditionOfTwoNumbers(30.0, 45.0);
		double res1=m1.getAdditionOfTwoNumbers(35.0f, 45.0f);
		System.out.println("Result: "+res1);
		double total=res1*100-55;
		System.out.println("Total sum:"+total);
		
	//	System.out.println("Sum: "+m1.getAdditionOfTwoNumbers(25, 45));
		System.out.println("Program ends...");
	}
	
	
	
	public double getAdditionOfTwoNumbers(double p,double t) {
		double wq=p+t;
		return wq;
}
}