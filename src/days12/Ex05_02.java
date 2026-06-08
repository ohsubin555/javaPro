package days12;

import java.util.Arrays;

public class Ex05_02 {
	
	  public static void main(String[] args) {
		  
		  
		  Point p1 = new Point (1, 2);
		  Point p2 = new Point (3, 4);
		  
		  Point p3 = p1.plusPoint(p2);
		  p3.dispPoint();
		  
		  
		  p2.plusPoint(p1).dispPoint();
//		  
//		  int [] m = {1,2,3};
//		  int [] n = doubleM (m);	
//		  System.out.println(Arrays.toString(n));
//		  
		  
	  }//main

//	  
//	  private static int[] doubleM(int[] m) {
//		int [] result = new int [m.length];
//		for (int i = 0; i < m.length; i++) {
//			result[i] = m[i]*2;
//			
//		}
//		return result;
//	}
	  
	  
	  
	  
	  private static int[] doubleM(int[] m) {
		int [] result =   Arrays.stream(m).map(v -> v*2).toArray();	
		
		  return result;
	  }


	  //기본형 리턴자료형
	  public static int sum(int a, int b){
		  return a+b;
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}//class
