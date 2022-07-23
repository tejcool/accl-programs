package assign;

public class method {
	public static void detail(int age, int salary) {
		System.out.println("Hi, Good morning Everyone");
		System.out.println("Staying in Pune");
		System.out.println("I am "+age+" yrs old");
		System.out.println("I am getting "+salary);
		//return;//optional because if you don't write it dn java compiler will write it
	
	}
	public static void main(String[] args) {
		
		detail(30, 96000);
		detail(25, 56000);
		detail(26, 45000);
		detail(24, 25000);
		detail(29, 75000);
		detail(28, 65000);
		detail(32, 85000);
		detail(31, 35000);
		detail(36, 55000);
		detail(23, 45202);
		
}
}