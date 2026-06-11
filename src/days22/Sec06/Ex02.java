package days22.Sec06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author subin
 * @date 2026. 6. 11. 오후 12:02:14
 * @subject 
 * @content 요소 그룹핑
      ㄴCollectors.groupingBy () 메소드에서 얻은 Collector를 collect() 메소드를 호출할 때 제공
      ㄴ groupingBy()는 Function을 이용해서 T를 K로 매핑하고, K를 키로 해 List<T>를 값으로
       갖는 Map 컬렉션을 생성
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", "남", 92)); // 요소
		list.add(new Student("김수영", "여", 87)); // 요소
		list.add(new Student("감자바", "남", 95)); // 요소
		list.add(new Student("오해영", "여", 93)); // 요소

		// list -> 성별로 그룹화:   남  List,  여  List
		//              Map       key value 
		// [2]
		Map<String, List<Student>> map = list.stream()
		    .collect( Collectors.groupingBy( s-> s.getGender() )  );
		
		List<Student> mlist =  map.get("남");
		mlist.stream().forEach(System.out::println);
		
		
		/* [1]
		Map<String, List<Student>> map = new HashMap<>();
		List<Student> 남list =  new ArrayList<Student>();
		List<Student> 여list =  new ArrayList<Student>();
		
		Iterator<Student> ir =  list.iterator();
		while (ir.hasNext()) {
			Student s =   ir.next();
			String key = s.getGender(); // 성별
			if ( key.equals("남") ) {
				남list.add(s);
			} else {
				여list.add(s);
			}			
		} // while
		
		map.put("남", 남list);
		map.put("여", 여list);
		*/
	} // main

} // clas
