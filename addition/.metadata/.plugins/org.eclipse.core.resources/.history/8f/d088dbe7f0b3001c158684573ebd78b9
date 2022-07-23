package array;
     
                        //Q to find the fequency of each element
public class arrayprogram2 {
	
	  public static void main(String[] args) { 
	        //Initialize array   
	        int [] ist = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};   
	        //Array snd will store frequencies of element  
	        int [] snd = new int [ist.length];  
	        int visited = -1;  
	        
	        for(int i = 0; i < ist.length; i++){  
	            int count = 1;  
	          
	                
	            for(int j = i+1; j < ist.length; j++){  
	                if(ist[i] == ist[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    snd[j] = visited;  
	                }  
	            }
	                       
	            if(snd[i] != visited)  
	                snd[i] = count;       
	             }  
	        
	        //Displays the frequency of each element present in array  
	        System.out.println("---------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------");  
	        for(int i = 0; i < snd.length; i++){  
	            if(snd[i] != visited)  
	                System.out.println("    " + ist[i] + "    |    " + snd[i]);  
	        }  
	        System.out.println("---------------------");  
	    }  
	} 

