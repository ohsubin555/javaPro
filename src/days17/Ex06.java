package days17;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
        //person 객체의 age나이로 비교하기 위해 comparator 익명클래스 생성+사용한 예
		list.add(new Person("이지훈",20));
		list.add(new Person("류호훈",42));
		list.add(new Person("장미성",23));

		System.out.println(list);
		
		//나이순으로 오름차순 정렬을 하고 출력
		/*
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {	
				return o1.getAge() - o2.getAge();
			}
		});
		*/
		list.sort(null);
		System.out.println(list);
		

	}

}

