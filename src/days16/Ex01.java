package days16;

import java.util.Arrays;

/**
 * @author subin 
 * @date 2026. 6. 2. 오전 7:11:36
 * @subject 
 * @content 문자열 다루는 클래스
         1. String 클래스        *****
            ㄴ 변경 불가능한 클래스이다. (기억)
         2. StringBuffer 클래스
         3. StringBuilder 클래스
         4. StringTokenizer 클래스  
         5. StringJoiner 클래스  
 */
public class Ex01 {

   public static void main(String[] args) {
	   
	   String a = "abc";
	   String b = "ABC";
	   
	   System.out.println(a.equals(b));
	   System.out.println(a.equalsIgnoreCase(b));// 대소문자 구분 없이 비교하는 메서드 
	   
      /*
      int i = 10;
//      String name = new String("홍길동");
      //  [0x100]               [홍길동]
      //  name                  0x100
      
      String name = "홍길동";
      // ["홍길동"] X
      // name
      */
      
      String s = "  public statIc void main(String[] args) {   ";
      String [] sArr = s.split("\\s");
      System.out.println(Arrays.toString(sArr));
      
      System.out.println(String.join("[과]", sArr));
 
      /*
      // 검색어: keyword, searchWord
      String keyword = "main";
      // 찾는 문자열의 위치값 확인
      int index = -1;
//      if(  (index = s.indexOf(keyword) ) != -1 ) { 
      if(  (index = s.lastIndexOf(keyword) ) != -1 ) { 
         System.out.println("찾는 문자열이 "+  index +   " 위치에 있다.");         
         // main -> 메인 수정
         System.out.println( s.substring(0, index) +"메인" +  s.substring(index +keyword.length()  ));
         
         System.out.println( s.replace(keyword ,  "메인") );
         
         // ic또는Ic또는IC또는 iC
         // ic      Ic        아이시 
         System.out.println( s.replaceAll("(ic|Ic)", "아이시") );
         System.out.println( s.replaceAll("(i|I)c", "아이시") );
         System.out.println( s.replaceAll("[iI]c", "아이시") );
         // (?i) 대소문자 구분 없다    ic     ic또는Ic또는IC또는 iC
         System.out.println( s.replaceAll("(?i)ic", "아이시") );
         System.out.println( s.replaceFirst("(?i)ic", "아이시") );
         
      }else {
         System.out.println("찾는 문자열이 없다.");
      }
      
      // 유무 확인~
//      if( s.contains(keyword) ) {
//         System.out.println("찾는 문자열이 있다.");
//      }else {
//         System.out.println("찾는 문자열이 없다.");
//      }
      
      
//      System.out.println("["+ s + "]");      
//      // 문자열 앞뒤의 공백 제거
//      s = s.trim();
//      System.out.println("["+ s + "]");
      
//      // String -> char [] 
//      char [] cArr = s.toCharArray();
//      // char[] -> String
//      String t = String.valueOf(cArr);
            
      /*
      int length = s.length();
      System.out.println("1. 문자열 길이: " + length); // 40
      
      char third = s.charAt(2); // index
      System.out.println("2. 세번째 한 문자:" + third);
      
      String su = s.toUpperCase();
      System.out.println( su );
      String sl = s.toLowerCase();
      System.out.println( sl );
      
      String regex = "[\\s()]";
      String [] sArr = s.split(regex, 3);
      System.out.println( Arrays.toString( sArr ));
      */

   } // main

} // class







