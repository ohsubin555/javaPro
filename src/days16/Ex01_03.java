package days16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex01_03 {

	public static void main(String[] args) {


		//학생명단.txt 읽어서 학생이름만 출력 
		//. 현재 디렉토리 javaPro 폴더 
		//.. 상위 디렉토리 
		// 절대경로: 처음부터  , 상대경로: 기준이 있음

		String fileName = ".\\src\\days16\\학생명단.txt";
		String saveName = ".\\src\\days16\\학생명단.html";
		
		try(
				FileReader in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in);
				FileWriter out = new FileWriter (saveName);


				)
		{ String name =null;

		System.out.println("<ol>");
		out.write("<ol>");
		while( (name = br.readLine()) != null) {
			System.out.printf("<li>%s</1i>\n",name);
			out.write("<li>"+name+"</li>\n");

		}

		System.out.println("</ol>");
		out.write("</ol>");

		} catch (Exception e) {
			e.printStackTrace();

		}

		System.out.println("end");


	}//main

}//class
