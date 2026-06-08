package days18;

import java.util.ArrayList;
import java.util.HashSet;

import days17.Person;

/**
 * @author subin
 * @date 2026. 6. 5. 오후 5:19:46
 * @subject 와일드 카드 (?) 파라미터 
 * @content 
 * 
 */

public class Ex15_05 {

	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<Person>();
		HashSet<Student> hs2 = new HashSet<>();
		// Collection<? extends Student c>
//		ArrayList<Student> list = new ArrayList<>(hs); X
		ArrayList<Student> list = new ArrayList<>(hs2);
		
//		FruitBox<Toy> fBox = new FruitBox<>(); X
		
	} // main

} // class
//
//class Toy{ 	public String toString() {		return "Toy";	}  }
//
//class Fruit{	public String toString() { return "Fruit";	}}
//class Apple extends Fruit{	public String toString() {return "Apple";	}}
//class Grape extends Fruit{	public String toString() {return "Grape";	}}
//
//class Box05<T>{
//	ArrayList<T>  list = new ArrayList<T>();
//	void add(T item) {    this.list.add(item);  }
//	T get(int i) {  return  this.list.get(i); }
//	int size() {  return this.list.size();  }
//	public String toString(){  return this.list.toString(); }
//}
//
//// 제한된 제네릭 클래스 선언.
//class FruitBox<T extends Fruit> extends Box05<T>{
//	
//}
//

