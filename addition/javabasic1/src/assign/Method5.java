package assign;

public class Method5 {
	public static void main(String[] args) {
		System.out.println("Get interest using getInterest(): "+Method5.Interest1(250000, 6.5, 60));
		System.out.println("Get interest using getInterest(): "+Method5.Interest1(250000, 6, 60));
		//Method5.getInterest(350000, 6, 36);
		//Method5.getInterest(350000, 5, 36);
	  Method5.Interest(350000, 5.0, 36);		
		System.out.println("**********************");
		
	}
	public static double Interest1(int p,double r,int t) {
		return (p*r*t)/100;
	}
	public static void Interest(int p,double r,int t) {
		double res=(p*r*t)/100;
		System.out.println("Interest is :"+res);
	}
	}
	
