package practiceprogram;

import java.util.HashMap;

public class charOccurance {
	public static void main(String[] Args ) {
		
	
	String str = "i am a automation Tester am";
	String[] wordarray = str.split(" ");
	
	HashMap<String, Integer> charoccor = new HashMap<String, Integer>();
	

	for (String c : wordarray) {

		if (charoccor.containsKey(c)) {
			charoccor.put(c, charoccor.get(c) + 1);
		} else {
			charoccor.put(c, 1);

		}

	}	
	for(java.util.Map.Entry<String, Integer> data1:charoccor.entrySet()) {
		System.out.println(data1.getKey() + ":" + data1.getValue());
		
		
	}
}
}
