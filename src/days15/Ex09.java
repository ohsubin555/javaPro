package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		String message = scanner.next();
		scanner.close();

		 */
		//try with resources 문 - 자동으로 사용하던 자원 닫기


		/*
		try (Scanner scanner = new Scanner(System.in);){

			String message = scanner.next();

		} catch (Exception e) {

		}
		 */

		// with resources 문 - 자동으로 사용하던 자원 닫기

		//		FIleReader: 파일 읽기
		//		FileWriter: 파일 쓰기

		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days15\\Car.java";
		//FileReader reader = null;
		try (FileReader reader = new FileReader(fileName);){
			//reader = new FileReader(fileName);

			int one = -1;
			while (( one = reader.read()) != -1)  {

				System.out.printf("%c",(char) one);
			}

			//int one = reader.read();


		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			//
			//			if(reader != null){
			//				try {
			//					reader.close();
			//				} catch (IOException e) {
			//
			//					e.printStackTrace();
			//				}
			//			}

		}

	}//m

}//c
