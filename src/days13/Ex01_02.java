  package days13;



/**
 * @author subin
 * @date 2026. 5. 28. 오전 9:33:03
 * @subject 
 * @content  단독 (홀로) 사용될때에 this 용도 
 * - 매개변수 : disPoint (this)
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
	Calc myCal = new Calc();
	myCal.btnExec.btnExec_click();
	


	}//main

}//class

//계산기 클래스 선언 
class Calc{ 
	
	

	//	Button [] btmArr = new Button [24];

	//Button btnWxec = new Button(); : 결합력 높은 코딩이라 좋지 않음!
	        Button btnExec = null;
	   Button btnPlus = null;
	
	//디폴트 생성자 
	public Calc() {
		init();
		
	}
     // 생성자에서 필드를 초기화 하는 메소드 
	private void init() {
		this.btnExec = new Button ("[=]", this); //this 는 계산기 new Calc();
		
	}
	// 계산기 화면에 출력을 담당하는 메소드 
	public void execDisp(String result) {
		System.out.printf("[화면결과 출력 %s]\n",result);
	}
}

// 버튼 
class Button{

	String text; // 
	
	 Calc calc;
	   


	//디폴트 생성자 
	public Button () {

	}
	public Button (String text) {
		this.text = text; //text 1의 용도 

	}
	public Button(String text, Calc calc) {
		this(text); //this 2  용도 , 맨 위에 와야 함. 
		this.calc = calc;

	}
	//버튼을 클릭 할 때 동작을 처리하는 메소드 (click)
	public void btnExec_click() {
          String result = "3 + 5 = 8";
          //Calc 객체 얻어오는 방법
         // Calc calc = new Calc(); -> 새로운 계산기를 생성 한 것. 
          this.calc.execDisp(result);
           
	}

}











