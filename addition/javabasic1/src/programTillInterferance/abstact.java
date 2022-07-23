package programTillInterferance;

abstract class kaminikomal {   
	    abstract void method1();
	    
	   void kullu(int a) {
	    	System.out.println("komal bsdk  "+a+" no. ki");
	    }
}    	
class bunty extends kaminikomal {
	void method1() {
		double d = 420;
		System.out.println("plz komal initiate  "+d);
	} 
	void kullu(int a) {
		System.out.println("bunty is not possesive  ");
	}
}

class tejas extends kaminikomal {
	           tejas(){
	            	super.kullu(1);
	      }
	void method1() {
	   int b=1;
	System.out.println("tejas is inocent no."+b);
		
	}
}

public class abstact {
   public static void main(String []args) {
	     tejas r1=new tejas();
	     r1.method1();
	     bunty r2=new bunty();
	     r2.method1();
	     r2.kullu(1);
   }
}
