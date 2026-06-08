package days16;

import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) {
	
		
		
		String group1 = "양인석,안정빈,신창만,이지훈,장미성";
				
	StringTokenizer tokenizer = new StringTokenizer(group1, ",");
		
		System.out.println(tokenizer.countTokens());
		
		while (tokenizer.hasMoreTokens()) {
			
			 String name = tokenizer.nextToken();
			System.out.println(name);
		}
				
	}

}
