package groupPAllPrograms;

class student {
	  int roll=10;
	  static String s = "ravina college" ;
	  double marks=100.25;
	  double fees= 50000.25;
	  
	                  void college() {
		int roll=123;
		double marks=123.12;
	
	System.out.println("Roll no of the student  "+roll);
	System.out.println("Roll no of the student  "+this.marks);
	System.out.println(s);
    }
}
	class teacher extends student{
		          
		          teacher(){
		        	  double fees1 =123.5;
		        	  System.out.println("fees is pending  "+fees1);
		          }
		         teacher(double d){
		        	this();
		        	System.out.println("std of the students  "+d);
		} 
		         void college() {
		        	 System.out.println("need to overload  ");
		         }
	}
	class principle extends teacher{
		
	
		principle(){
			  super(1487.552);
			  float salary=1511.25f;
			  System.out.println("salary needs to overrride  "+salary);
    }
		  principle(double fees ){
			  System.out.println("calling upper class "+super.fees);
			   }
		  void principle() {
			  System.out.println("method is compulsory for calling ");
		  }
	}
	
	public class AllProgramsTillEnd {
           public static void main(String[]args) {
        	   principle p1=new principle();
        	    principle p2=new principle(123456.258);
        	    p1.principle();
        	   System.out.println(".......................................");
        	    teacher t1 =new teacher();
        	    teacher t2 =new teacher(7894.258);
        	    t2.college();
        	   System.out.println(".......................................");
        	    student s1=new student();
        	    s1.college();
        	    
        	   
        	   
        	   
        	   
           }
}