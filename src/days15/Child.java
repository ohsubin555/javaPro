package days15;

import days16.Parent;

public class Child extends Parent{
	
	void modifierAccessTest() {
		this.pub = 1;
		this.pro = 1; 
	//	this.def = 1; 패키지 내부. 
	}


}


