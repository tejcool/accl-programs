package assign;

public class method2 {
	public static void main(String[] args) {
		double sum=getAdditionResult(25, 30);
		
		
		sum =sum*100;
		System.out.println("Result of addition: "+sum);
		System.out.println("Result of addition2: "+method2.getAdditionResult(250.36, 45));
		System.out.println("result of addition3: "+getAdditionResult(45,20));
	}
	static double getAdditionResult(double num1,double num2) {
		double getAdditionResult = num1+num2;
		return getAdditionResult;
}
}