package days17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex11_03 {


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
	      System.out.println( lottoSet );      
	   }

	}
