package days17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author subin
 * @date 2026. 6. 4. 오전 10:45:11
 * @subject List 구현한 컬렉션 클래스: ArrayList 
 * @content   ㄴ 특징: 순서유지O, 중복허용O
 * 
 */
public class Ex05_02 {

   public static void main(String[] args) {
      // <E> 제네릭클래스: Element(==요소)
      ArrayList groupList = new ArrayList();
      System.out.println( groupList.isEmpty() ); //    true     
      System.out.println( groupList.size() ); // 0   요소의 갯수      
      groupList.add("양인석");
      groupList.add("안정빈"); // 문규리
      groupList.add("신창만");
      System.out.println( groupList.size() ); // 3   요소의 갯수      
      System.out.println( groupList.isEmpty() ); //  false
      groupList.add("이지훈");
      groupList.add("장미성");
      System.out.println( groupList.size() ); // 3   요소의 갯수      
      groupList.trimToSize(); // 300-5 size() = 295
      
      // 2번째 사람의 이름 얻어와서 출력...
      String name =  (String) groupList.get(1);
      System.out.println("> 두 번째 사람의 이름: " + name );
      
      // groupList.remove(1);
      // System.out.println( groupList.contains("안정빈") ); // true
      
       int index = groupList.indexOf("안정빈");
//       System.out.println( index ); // 1       
       groupList.remove(index);
       
       // 모든 팀원 출력
//       for (int i = 0, size = groupList.size(); i < size ; i++) {
//          name =  (String) groupList.get(i);
//         System.out.println( name );
//      } // for       
       System.out.println( groupList.toString() ); // [양인석, 신창만, 이지훈, 장미성]
       
       groupList.add(index, "문규리");
       System.out.println( groupList.toString() ); // [양인석, 문규리, 신창만, 이지훈, 장미성]
       
       // 1명 팀원으로 더 추가: 중복허용 O, 순서유지 O
       groupList.addFirst("이지훈");
       System.out.println( groupList.toString() ); // [이지훈, 양인석, 문규리, 신창만, 이지훈, 장미성]
       
       // [0양인석, 1문규리, 2신창만, 3장미성]
       // [문제] "이지훈" 찾아서 모두 삭제-> 출력
       /* [1]
       for (int i = 0, size = groupList.size(); i < size ; i++) {
          name = (String) groupList.get(i);
         if( name.equals("이지훈") ) {
//            System.out.println( i +" : " + name );
            groupList.remove(i);
            i--;
            size--;
         }
      } // for
      */
       /* [2]
       for (int i = groupList.size()-1; i >= 0 ; i--) {
          name = (String) groupList.get(i);
         if( name.equals("이지훈") ) {
//            System.out.println( i +" : " + name );
            groupList.remove(i);
         }
      } // for
      */
       
       // [3] 반복자(iterator) 사용해서 출력. + "이지훈" 제거 ***
       //   <E> 제네릭 삭제
       /*
       Iterator ir =  groupList.iterator();
       while (ir.hasNext()) {
         name = (String) ir.next();
//         System.out.println("> " + name);
         if( name.equals("이지훈")) {
            ir.remove();
         }
      }
      */
       
       // [4] removeAll()
       /*
       ArrayList removeList = new ArrayList();
       removeList.add("이지훈");       
       removeList.add("신창만");
       
       List removeList = List.of("이지훈", "신창만"); 
       
       groupList.removeAll(removeList); // 매개변수 다형성, 인터페이스 , 업캐스팅
       */ 
       
       // [5] groupList.removeIf(Predicate p)
       //                ㄴ 조건에 만족하는 요소를 모두 제거
       //                ㄴ Predicate p  삭제할 조건
       //                   @FunctionalInterface 함수형 인터페이스
       /*
       groupList.removeIf(new Predicate<String>() { 
         @Override
         public boolean test(String name) { 
            return name.equals("이지훈");
         }
      });
      */       
//       groupList.removeIf( n ->  n.equals("이지훈") );
       
       // 이름순으로 오름차순 정렬
//       groupList.sort(new Comparator<String>() {
//         @Override
//         public int compare(String o1, String o2) { 
//            return o1.compareTo(o2) * -1; // 0, 양수, 음수
//         }
//      });
       
       groupList.sort( ( o1,  o2) ->  {
          String a = (String)o1;
          String b = (String)o2;          
          return a.compareTo(b)*-1;
       });
       
       System.out.println( groupList.toString() ); // [양인석, 문규리, 신창만, 장미성]
       
       // 모든 요소를 제거
//       groupList.clear();
//       System.out.println( groupList.toString() ); // []
       
       // 맨 뒤 2명의 이름을 출력..
       int fromIndex = 4;
       int toIndex = groupList.size(); 
       List endList = groupList.subList(fromIndex, toIndex);
       System.out.println( endList );
   } // main

} // class







