package days05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		String name;
		int age;
		double height;
		boolean gender;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("> 이름 나이 키 성별 입력 ?");
		name = scanner.next();
		age = scanner.nextInt();
		height = scanner.nextDouble();
		gender = scanner.nextBoolean();
		
		System.out.printf(" >이름:%s, 나이:%d살, 키:%.2fcm, 성별:%b",name,age,height,gender);
		
		
		

	}

}
