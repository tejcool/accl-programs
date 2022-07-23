package programTillInterferance;

// In Interface class
//          variable ---> by default ----> public static final
            //method ---> by default ----> public abstract
//   NO CONSTRUCTOR
interface kaminikomal1 {   
     void method1();
    
    static void kullu(int a) {
    	System.out.println("komal bsdk  "+a+" no. ki");
    }
}    	
class bunty1 implements kaminikomal1 {
	//method should always be "public" while overriding
                 public void method1() {
	             double d = 420;
	System.out.println("plz komal initiate  "+d);
} 
                 public void kullu(int a) {
                 	System.out.println("komal bsdk  "+a+" no. ki");
                 }
      }
class tejas1 implements kaminikomal1 {
          
          public void method1() {
              int b=1;
                System.out.println("tejas is inocent no."+b);
	
       }
}

public class Interferance1 {

	public static void main(String []args) {
     tejas1 r1=new tejas1();
     r1.method1();
     bunty1 r2=new bunty1();
     r2.method1();
   }
}




