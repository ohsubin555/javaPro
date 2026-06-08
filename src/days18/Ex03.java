package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {


		String fileName = ".\\src\\days18\\1차_조편성.txt";
		String line = null;

		ArrayList<ArrayList<String>>class5 = new ArrayList<ArrayList<String>>();
		try(
			FileReader in = new FileReader(fileName);
			BufferedReader br = new BufferedReader(in);	
				) {
			ArrayList<String> tmList = null;
			String regex = "[/:]";
			String [] lineArr = null;
			while( (line = br.readLine()) != null) {
				System.out.println(line);
				tmList = new ArrayList<String>();
                lineArr = line.split(regex);
                for (int i = 1; i < lineArr.length; i++) {
					String name = lineArr[i];
					tmList.add(name);
				}
                class5.add(tmList);
			}
			dispClass5(class5);
			
           System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main

	private static void dispClass5(ArrayList<ArrayList<String>> class5) {
		
		 /*
	       * [5강의장]
	       * 1조
	       *   ㄴ 1번 홍길동
	       *   :
	       * 2조
	       *   ㄴ 1번 김길동
	       *   :  
	       * 
	       * */ 
		
		System.out.println("[5강의장]");

        Iterator<ArrayList<String>> ir = class5.iterator();
        int n = 1;
        while (ir.hasNext()) {
        	System.out.printf("%조\n",n++);
			ArrayList<String> tmList = (ArrayList<String>) ir.next();
			ArrayList<String> ir2 =	(ArrayList<String>) tmList.iterator();
			while (ir.hasNext()) {
				ArrayList<String> name = ((Iterator<ArrayList<String>>) ir2).next();
		         System.out.printf("  ㄴ %s\n", name);

				
			}
			
		}
//		for (int i = 0; i < class5.size(); i++) {
//			System.out.printf("%d조\n",i+1);
//		     
//			for (int j = 0; j < class5.get(i).size(); j++) {
//				System.out.printf(" ㄴ%d번 %s\n",j+1,class5.get(i).get(j));
//				
//			}
//			
			
		}
		
	

}//class
