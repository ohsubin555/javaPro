package days17;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex08_02 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("박예진");
		list.add("양희동");
		list.add("박정현");
		System.out.println(list);
		/*
        String [] names = new String [list.size()];
        for (int i = 0; i < names.length; i++) {
        	names[i] = (String) list.get(i);
		}
		 */
		String [] names = (String[]) list.toArray(new String [0]);
		String[] arr = (String[]) list.toArray(String[]::new);
        
		//String[]::new 생성자 참조
		System.out.println(Arrays.toString(names));
	}//main

}//class
