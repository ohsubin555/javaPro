package days19;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {


		FruitBox<Fruit> fruitBox = new FruitBox();
		Juice juice = Juicer.makeJuice(fruitBox);
		System.out.println(juice); //ays19.Juice@8efb846


		//The method makeJuice(FruitBox<Fruit>) in the type Juicer is not applicable for the arguments (FruitBox<Apple>)
//		FruitBox<Apple> appleBox = new FruitBox();
//		juice  = Juicer.makeJuice(appleBox);
//		System.out.println(juice); //ays19.Juice@8efb846




	}

}
class Fruit{   public String toString() { return "Fruit";   }}
class Apple extends Fruit{   public String toString() {return "Apple";   }}
class Grape extends Fruit{   public String toString() {return "Grape";   }}

class Box<T>{
	ArrayList<T>  list = new ArrayList<T>();
	void add(T item) {    this.list.add(item);  }
	T get(int i) {  return  this.list.get(i); }
	int size() {  return this.list.size();  }
	public String toString(){  return this.list.toString(); }
}
//제한된 제네릭 클래스 
class FruitBox<T extends Fruit> extends Box<T>{

}

//과일을 녹즙기로 갈아서 주스로 만듦.
class Juice{

}
//과일 상자-> 주스를 생산하는 기기
class Juicer{
	/*
	static Juice makeJuice (FruitBox<? extends Fruit> Box )
	{ // 가공작업
		return new Juice();
	}	 
	 */
	/*
	static void printAll( ArrayList<? extends Fruit> list
	         , ArrayList<? extends Fruit> list2 ) {
	      // 구현 코딩
	      // 구현 코딩
	      // 구현 코딩
	   }
	 */
	
	

	
	

	static <T extends Fruit> void printAll( ArrayList <T>list
			, ArrayList<T> list2 ) {
		// 구현 코딩
		// 구현 코딩
		// 구현 코딩
	}

	public static Juice makeJuice(FruitBox<Fruit> fruitBox) {
		// TODO Auto-generated method stub
		return null;
	}





	//불가능
	//	 static Juice makeJuice (FruitBox<Apple> appleBox )
	//	 { // 가공작업
	//		 return new Juice();
	//	 }
	//	 
	//	 static Juice makeJuice (FruitBox<Fruit>box )
	//	 { // 가공작업
	//		 return new Juice();
	//	 }
}