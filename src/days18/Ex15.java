package days18;

/**
 * @author subin
 * @date 2026. 6. 5. 오후 4:06:47
 * @subject chapter13 제네릭 (Generic)
 *          new add jdk 1.5
 *          정의 - 결정되지않은 타입을 파라미터로 처리하고 실제 사용할때 파라미터를 구체적인 타입으로 대체시키는 기능(기술)
 *          장점? 타입의 안전성을 제공하기 위해서, 코드를 재사용하기 위해서
 *          적용: 메소드, 클래스, 인터페이스
 *          
 * @content 
 * 
 */
public class Ex15 {
	

	public static void main(String[] args) {
		/*
		Box box1 = new Box();
		box1.setItem(100);
        System.out.println(box1.getItem());
        */
//		
//		BoxDouble box1 = new BoxDouble();
//		box1.setItem(100.00);
//        System.out.println(box1.getItem());
//	}
//
//}
//class BoxChar{
//	
//	private Object item;
//	
//	public Object getItem() {
//		return item;
//	}
//	
//	public void setItem(Object item) {
//		this.item = item;
//	}
//}

//제네릭 클래스로 선언
// 클래스명 <T> 을 붙이면 된다. 
// T를 타입변수 또는 타입 매개변수
// Box 원시타입  / Box <T> 제네릭 클래스, T의 BOX, T Box 라고 읽으면 된다. 
class Box<T>{

	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}
	}
	
}

/*
class Box{
	
	private int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
}
class BoxDouble{
	
	private double item;
	
	public double getItem() {
		return item;
	}
	
	public void setItem(double item) {
		this.item = item;
	}
}
class BoxChar{
	
	private char item;
	
	public char getItem() {
		return item;
	}
	
	public void setItem(char item) {
		this.item = item;
	}
}
*/
