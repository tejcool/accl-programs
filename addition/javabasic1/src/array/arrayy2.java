package array;

import java.util.Arrays;
                       
public class arrayy2 {
	public static void main(String args[]) {
		int[] a= {2,1,3,5,2,5,2,12,3};
		Arrays.sort(a);
		for(int w:a) {
			System.out.println( "--"+w);
		}
		 // same as sort method 
		
		for(int i=0;i<a.length-1;i++) {
			
	}
		//     till here
		System.out.println("**************************");
		
		for(int i:a) { //used this syntax to show the program line by line it is "for each" loop
			System.out.println(i);
		}
	
	}
}
