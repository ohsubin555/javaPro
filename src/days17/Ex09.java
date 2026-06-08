package days17;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author subin
 * @date 2026. 6. 4. 오후 3:06:10
 * @subject [Vector 컬렉션 클래스]
 * 
 * @content C -> L -> Array 
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		Vector v= new Vector(); 
		System.out.println(v.size()); // 0 요소갯수
		System.out.println(v.capacity()); // 10 요소갯수
		v.addElement("양인석");
		v.addElement("안정빈");
		v.addElement("신창만");

		System.out.println(v.size()); //3
		v.add("이지훈");
		System.out.println(v.capacity());//10
		System.out.println(v.size()); //4

		System.out.println(v.get(0));
		System.out.println(v.getFirst());
		System.out.println(v.elementAt(0));

		Enumeration en = v.elements();
		while (en.hasMoreElements()) {//요소가지고 있니?  true / fasle
			String name = (String) en.nextElement();
			System.out.println(name);
		}

		//마지막요소
		int lastIndex = v.size()-1;
		System.out.println(v.get(lastIndex));
		System.out.println(v.lastElement());

		v.remove(0);
		v.remove("안정빈");
	}

}
