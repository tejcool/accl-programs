package practiceprogramfor_loop;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123456, rev=0;
   for(;num!=0;num/=10) {// num= num/10
	int digit=num%10;
	rev=rev*10+digit;
}
System.out.println("Reverse no   "+rev);
}
	}


