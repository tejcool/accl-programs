package practiceprogram;

public class compquotntreminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
				
				compquotntreminder  r1= new compquotntreminder ();
				compquotntreminder  r2= new compquotntreminder ();

		       r1.details(50,2);
			    r2.details(40,2);
			}
			   	public static void details(int dividend , int divisor) {
					
				double quotient= dividend/divisor;
				double remainder= dividend%divisor;
		  
		  System.out.println("Quotient of the given no. is  "+quotient);
		  System.out.println("Remainder of the given no. is  "+remainder);
				}
		
	}
		


