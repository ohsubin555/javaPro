package days13;

public class Ex01_03 {

	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(10,20);
		
		p1.dispPoint();
		p2.dispPoint();
		
//        p1.plusPoint(p2);
//        p1.dispPoint();
		
		 p1.plusPoint(p2).dispPoint();

	}//main

}//class

class Point {


	//디폴트 생성자
	// 생성자 2


	//getter setter

	private int x;
	public Point() {
		System.out.println("> Point 디폴트 생성자 호출됨.");
		
		//super();

	}
	private int y;
	
   //생성자
	public Point(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
		System.out.println("포인트 생성자 2");
	
			
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 : 두 좌표를 더하는
	public Point plusPoint(Point p) {
		this.x += p.x;
		this.y += p.y;
		return this;
	}
	
	//메소드 : 좌표 출력하는 
	public void dispPoint() {
		System.out.printf("x=%d y=%d\n", this.x,this.y);
	}
}
