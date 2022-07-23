package array;

              // coping array  value in another value
public class arrayProgram1 {
    public static void main (String [] array) {
	 int[] array1st= {5, 6 , 4 ,7};
	 System.out.println("printing first the array declared  "+array1st[0]);
	 System.out.println("printing first the array declared  "+array1st[1]);
	 System.out.println("printing first the array declared  "+array1st[2]);
	 System.out.println("printing first the array declared  "+array1st[3]);
	   System.out.println("---------------------------------");
	 //     or    
	 
	 for(int i=0; i<array1st.length; i++) {
		 System.out.println("printing every thing at a time  "  +array1st[i]);
	 }
	 System.out.println("size of the array  "+array1st.length);
 System.out.println("-------------------------");
	 
 int array2[]=new int[4];
 array2=array1st;// refering array2 to array1st
 
// array2[0] =array1st[0];
// array2[1] =array1st[1];
// array2[2] =array1st[2];
// array2[3] =array1st[3];
 
 System.out.println("printing copied array  "+array2[0]);
 System.out.println("printing copied array  "+array2[1]);
 System.out.println("printing copied array  "+array2[2]);
 System.out.println("printing copied array  "+array2[3]);
     }
}
