package days18;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex06_02 {

	public static void main(String[] args) {


		int [] score = { 80, 95, 50, 85, 45, 65, 10, 100 };

		TreeSet<Integer> ts = new TreeSet<Integer>();
//		for (int i = 0; i < score.length; i++) {
//			ts.add(score[i]);
//		} // for i
		//int[] -> Instream
		Arrays.stream(score).forEach(ts::add);
		
	
		System.out.println(	ts.subSet(50, 80));
		System.out.println(	ts.tailSet(80));// 80점 이상
		System.out.println(	ts.headSet(80)); //80점 미만
		
		//TreeSET  증복허용, 정렬, 검색, 부분검색 성능이 뛰어남. 
		
		
		
		

		/*
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("abc");      ts.add("alien");   ts.add("bat");
		ts.add("car");      ts.add("Car");      ts.add("disc");
		ts.add("dance");   ts.add("dzzz");      ts.add("dzzzz");
		ts.add("elephant");   ts.add("elevator");   ts.add("fan");
		ts.add("flower");

	    System.out.println(ts);
	    SortedSet<String> ss = ts.subSet("a", "d");
	    System.out.println(ss); //a 부터 c까지의 알파벳이 정렬되어 출력
		 */


	}

}
