package days12;

public class Point {



	//필드

	public int x,y;


	//디폴트 생성자
	public Point () {

		x=y=100;

		System.out.println("point 디폴트 생성자 호출됨..");
	}

	//메소드 현위치를 출력하는 메소드

//	public Point(int i, int j) {
//		x = i;
//		y = j;
//		System.out.println("point 2 디폴트 생성자 호출됨..");
//
//	}



	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		System.out.println("point 2 생성자 호출됨..");
	}
	
	
	public Point(int v) {
		
		this(v,v); // 다른 코딩보다 가장 위에 있어야 함. 
//		this.x = v;
//		this.y = v;
		System.out.println("point 1 생성자 호출됨");
	}
	
	
	
	
	

	public void dispPoint(){
		System.out.printf("x=%d,y=%d\n",x,y);
	}
	//생성자 

	public void offsetPoint(int value) {  //int value 

		x = x+value;
		y = y+value;


	}


	public void plusPoint(Point a, Point b) {  //참조형 매개변수 

		x= a.x + b.x;
		y= a.y + b.y;

	}




	//	
	//// p1.plusPoint(p2);
	//		public void plusPoint( Point p) {  // 참조형 매개변수
	//			x = x + p.x;
	//			y = y + p.y;
	//		}
	//		
	//	}




	// p1.plusPoint(p2);
	public Point plusPoint( Point p) { 
		return new Point (x+p.x, y +p.y);
		// 참조형 매개변수

	}

}

























