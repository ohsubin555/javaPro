package days06;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	
      char ch;
      Scanner scanner = new Scanner(System.in);
      System.out.println("한 문자 입력:");
      ch = scanner.next().charAt(0);
      
      System.out.printf("입력받은 한 문자: \'%c\n'" , ch);
      if ('A' <= ch && ch <= 'Z') {
    	    System.out.println("알파벳 대문자");
    	}
    	else if ('a' <= ch && ch <= 'z') {
    	    System.out.println("알파벳 소문자");
    	}
    	else if ('0' <= ch && ch <= '9') {
    	    System.out.println("숫자");
    	}
    	else if ('가' <= ch && ch <= '힣') {
    	    System.out.println("한글");
    	}
    	else if (ch == '@' || ch == '#' || ch == '%' || ch == '$' || ch == '*' || ch == '!') {
    	    System.out.println("특수문자");
    	}
    	else {
    	    System.out.println("기타 문자");
    	}
      
      
	}
	
}