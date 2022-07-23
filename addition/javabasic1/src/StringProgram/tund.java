package StringProgram;

import java.util.Scanner;

public class tund {

	public static void main(String[] args) {
		String s ="tunndi";
		System.out.println(reverseString(s));
		
		Scanner scn =new Scanner(System.in);
		String s2;
		System.out.println("Enter String to be reverse: ");
		s2=scn.next();
		System.out.println("Reverse String is: "+reverseString(s2));
	}
	
		static String reverseString(String s) {
			String s1 = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				s1 = s1 + s.charAt(i);
			}
			return s1;  			
		

	
		}
}


