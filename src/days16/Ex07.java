package days16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07 {

	public static void main(String[] args) {
		// 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
		// 갯수를 파악해서 #으로 막대그래프를 그리기.
		// A(20) : ####################
		// B(11) : ###########
		// :
		// Z(3)  : ###      


		String fileName = ".\\src\\days16\\Ex01.java";
		int [] counts = new int [26];
		
		try(FileReader reader = new FileReader(fileName);
				)
		{ 
			int code =-1;
			char one;
			while( (code = reader.read()) != -1) {
				one = (char) Character.toUpperCase(code);
				if (Character.isUpperCase(one)) {
					counts[one -'A']++;
				}
			}
			for (int i = 0, count = 0; i < counts.length; i++) {
				count =counts[i];
				
				System.out.printf("%c(%d): %s\n", i+'A', count, "#".repeat(count));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
  
		System.out.println("end");


	}

}
