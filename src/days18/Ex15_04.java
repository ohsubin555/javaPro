package days18;

import java.util.ArrayList;

/**
 * @author subin
 * @date 2026. 6. 5. 오후 4:50:23
 * @subject 
 * @content ㄴ제한된 제네릭 클래스 
 *          ㄴ
 * 
 */
public class Ex15_04 {

	public static void main(String[] args) {
		
		
		Box04 <Fruit> fruitBox = new Box04<>();
		Box04 <Apple> appleBox = new Box04<>();
		Box04 <Grape> grapeBox = new Box04<>();
		Box04 <Toy> toyBox = new Box04 <>();
		
		FruitBox<Grape>gfruitBox = new FruitBox();
	//	FruitBox<Toy> gtoyBox = new FruitBox();
		
       
	}//main

}//class
//앞으로 클래스를 선언할 때 이 인터페이스를 구현하면 먹을 수 있다. 
interface Eatable{}


class Toy {
	public String toString() {
		return "Toy";
	}
}
class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}


//모든 타입(T,f,a,g)을 담을 수 있는 상자 클래스 
class Box04<T>{
	ArrayList<T>list = new ArrayList<T>();
	void add (T item) {this.list.add(item);}
	T get(int index){ return this.list.get(index);}
	int size() {return this.list.size();}
	public String toString() {return this.toString();}
}
//먹을 수 있는 타입(F,A,G)을 담을 수 있는 상자 클래스
//<T> 제한된 제네릭 클래스 선언
class FruitBox<T extends Fruit>{
	
}

class Bread<T extends Eatable>{
	
}

class EatBox<T extends Eatable>{
	
}
// T은 Eatable 인터페이스를 구현한 Fruit 클래스의 자식클래스만 타입으로 제한한다. 
class EatFruitBox<T extends Fruit & Eatable>{
	
}

