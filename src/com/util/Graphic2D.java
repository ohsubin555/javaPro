package com.util;

public class Graphic2D {

	//메소드 선언부분  
	public static void drawLine (int length, char style) { 
		for (int i = 1; i < length; i++) {
			System.out.print(style); 
		} // for i
		System.out.println(); 
	} 

	//메소드 선언부분  
	public static void drawLine () {
		System.out.println("********************"); //유지보수와 구조화에 용이함.
	}


	//메소드 선언부분  
	public static void drawLine (int length) { 
		for (int i = 1; i < length; i++) {
			System.out.print("-");

		}
		System.out.println(); 
	} 


} // class