package days15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex05 {

	public static void main(String[] args) {
		
		String [] s = { "kbs", "sbs", "mbc", "jtbc" };
		
		System.out.println(Arrays.toString(s));

		
//		Arrays.sort(s,new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2)*-1;
//			}
//		});
//		
		
//		Arrays.sort(s,(o1,o2)-> o1.compareTo(o2)*-1
//				
//		);
//		
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s,new StringComparator() );
		
		Arrays.sort(s, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(s));

		
	}

}

//문자열을 비교하는 비교자 (comparator): 클래스 선언
class StringComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) { 
		
		
		String s1 = (String)o1;
		String s2 = (String)o2;
		// TODO Auto-generated method stub
		return s1.compareTo(s2)*-1;
	}
	
}










