package programTillInterferance;

class istclass  {
   int a =10;
   double b=20.45;
         public void method1() {
	        int a= 24;
	        double b= 46.54;
	         System.out.println("Printing local variable  "+a);
	         System.out.println("Printing global variable  "+this.b);
     }
}
 class ndclass2 extends istclass {
	     public void method1() {
	    	 System.out.println("overiding method of super class");
	     }
	     public double privatemethod(double c) {
	    	 System.out.println("giving value by return type  "+c);
	    	 return c;
	     }
	     
	     ndclass2(double e) {
	    	 System.out.println("use super stament here "+e);
	     }
		 ndclass2() {
		
		}
 }
 class rdclass3 extends ndclass2 {
	       
	        rdclass3() {
	    	  super(300.25);
	    	 
	    	int coover=258;
	    	    System.out.println("just need to initialize int value  "+coover);
	      }
	  
	        rdclass3(int d){
	    	   this();
	    	   
	    	   System.out.println("want to play with this satement  "+d);
	      }

				void main() {
					
				}

 }       
	        
public class till_Inheritance {
               public static void main (String []arg) {
            	//   rdclass3 r1 = new rdclass3();
            	  rdclass3 r2= new rdclass3(4500);
            	  
            	   ndclass2 r3 = new ndclass2();  
            	  r3.method1();
            	 r3.privatemethod(4500.25);
               }
    
}
 
            	   
               

 
