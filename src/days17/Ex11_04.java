package days17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Ex11_04 {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int LOTTO_PRICE = 1000; // 로또 1게임 천원
		int gameCount; // 게임횟수

		System.out.print(">게임 횟수 입력: ");
		gameCount = scanner.nextInt();

		HashSet lottoSet = null;
		ArrayList lottoList = new ArrayList();


		createLottoNumbers(lottoList,gameCount);

		displayLottoNumber (lottoList);

	}

	private static void displayLottoNumber(ArrayList lottoList) {
		Iterator ir = lottoList.iterator(); 	
		while(ir.hasNext()) {
			HashSet lottoSet = (HashSet) ir.next(); 
			displayLottoNumbers(lottoSet);
		}

	}
	private static void createLottoNumbers(ArrayList lottoList, int gameCount) {
		HashSet lottoSet = null;

		for (int i = 0; i < gameCount; i++) {
			lottoSet = new HashSet(6);
			createLottoNumbers(lottoSet);
			lottoList.add(lottoSet);
		}
	}
	public static void createLottoNumbers( HashSet   lottoSet) {
		int lottoNumber; 
		while ( lottoSet.size() < 6 ) { 
			lottoNumber = (int)(Math.random() * 45) + 1;
			//            System.out.println( lottoNumber );
			lottoSet.add(lottoNumber);
		} // while
	}

	// 한 게임 출력하는 메소드
	public static void displayLottoNumbers( HashSet lottoSet) {      
		// System.out.println( lottoSet );  
		// LinkedHashSet 컬렉션 클래스 : 순서유지 0 중복허용 x
		// ArrayList 컬렉션 클래스 : 순서유지 0

		// HashSet -> ArrayList 변환 -> 오름차순 정렬 -> 출력
		//List<Integer> lotto = new ArrayList<>(lottoSet);
		ArrayList lotto = new ArrayList<>(lottoSet);

		//Collections.sort(lotto);
        lotto.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int a = (int)o1;
				int b = (int)o2;
				return a-b;
			}
		});
		System.out.println(lotto);


	}

}
