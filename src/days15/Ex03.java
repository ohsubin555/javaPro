package days15;

/**
 * @author subin
 * @date 2026. 6. 1. 오전 10:09:05
 * @subject has - a 관계 : Car, Engine
 * @content    ㄴ 결합력이 높은 코딩은 좋은 코딩이 아니다. 
 *             ㄴ 생성자 DI(의존성 주입)
 *             ㄴ setter DI
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		
		Car k1 = new Car(new H_Engine());
		Car k2 = new Car(new H_Engine());

		k1.setEngine(new K_Engine());
		
        k1.setEngine(new K_Engine2036());
	}//main

}//class
