package array;

class Testarray2 {
	
	// creating a method which receives an array as a parameter
	static void min(int a[]) {    //int arr[]=a={ 13, 33, 4, 50,15,1 };

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {//
				min = a[i];
			//	System.out.println(+min);
			}
		}
		System.out.println("Min number in array is: "+min);
	}
	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {// 
				max = arr[i];
			//	System.out.println(max);
			}
		}
		System.out.println("Max number in array is: "+max);
	}
}
public class Array4 {
	public static void main(String args[]) {
		int a [] = { 13, 33, 4, 50,15,1 };// declaring and initializing an array
		Testarray2.min(a);// passing array to method
		Testarray2.max(a);// passing array to method
	}
}
