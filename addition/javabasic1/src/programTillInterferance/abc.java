package programTillInterferance;
class A4{
	A4(double d){//cons called by super statement
		System.out.println("kutta");
	}
	int komu=420;//gv
	double bun=143;//gv

	public  void tejas() {
	int komu=131;//lv
	double bun=141;//lv
	
		System.out.println("Kamina"+this.komu);//calling gv 420
		System.out.println("Kamina"+komu);//131
	}


	static int xyz() {//static method
		

		//System.out.println(b);
		
		return 124;
	}
}
class A3 extends A4{//Inheritance of obj A4 class
	A3() {//zero parameter cons
		
		this(25.80);//through this statement calling another double parameterized cons of same class
		System.out.println("I am zero param cons");
		
	}
	
	A3(int age){// int parameterized cons
		super(400.50);// calling cons of super class having double parameter
		System.out.println("I am int param cons"+age);
	}
	
	
	A3(double salary){//cons double param
		this(25);//calling int cons of same class
		System.out.println("I am int param cons  "+salary);
	}
	
	public void tejas1() {//non static  method
	
		System.out.println("Abv");
	}
	
}



public class abc {

	public static void main(String[] args) {
		A3 ref9=new A3();
		ref9.tejas();
		ref9.tejas1();
		System.out.println(A4.xyz());
		//A3 ref8=new A3(25);	
		
		
	}

}



