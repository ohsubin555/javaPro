package days15;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;

import days12.Point;

/**
 * @author subin
 * @date 2026. 6. 1. 오전 9:17:23
 * @subject 인터페이스. 클래스 사용 예제. 
 * @content 
 * 
 */
public class Ex02 implements Serializable{

	public static void main(String[] args) {
		
		


	}//main

}//class


abstract class Unit{

	//	Point p;
	int x;  // 유닛 위치
	int y;
	int cureentHP; //유닛 체력
}

// 하늘 유닛
// 땅 유닛
//바다 유닛 X

class AirUnit extends Unit{
	
}

class GroundUnit extends Unit{
	
}

interface Movable{
	void mover (int x,int y);
}

interface Attackable{
	void attack (Unit unit); //매개변수 다형성 
	
	
}

interface Fightable extends Movable, Attackable{
	
}

class Fighter implements Fightable{

	@Override
	public void mover(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit unit) {
		
		
	}
	
}

class Tank extends GroundUnit implements Fightable ,Repairable {

	@Override
	public void mover(int x, int y) {
		
	}

	@Override
	public void attack(Unit unit) {
		// 포쏘기
		
	}
	
}


//보병유닛 
class Marine extends Unit implements Fightable{

	@Override
	public void mover(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit unit) {
		
		
	}
	
}

class DropShip extends AirUnit implements Fightable, Repairable{

	@Override
	public void mover(int x, int y) {
		
	}

	@Override
	public void attack(Unit unit) {
		// 기관총 폭탄
		
	}
	
}



interface Repairable{
	
}

// SCV 수리 기능을 가진 클래스 
class SCV extends GroundUnit implements Repairable{
	
	void repair (Repairable target) {
		if (target instanceof Tank) {
			Unit u = (Unit)target;
		
		} else if (target instanceof DropShip) {
			DropShip  ds = (DropShip)target;

		}

	//수리 메소드: 대상 (수송선,탱크, scv , 마린이나 보병은 수리  x)
	
	/*
	void repair (DropShip unit) {
		
	}
	void repair (Tank unit) {
		
	}
	void repair (SCV unit) {
		
	}
	
	*/
	
	}
}

