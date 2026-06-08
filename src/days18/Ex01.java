package days18;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author subin
 * @date 2026. 6. 5. 오전 9:06:11
 * @subject Queue 
 *          ㄴ FIFO 구조
 * @content offer() poll()/peek()
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		//<E> //요소
		Queue q = new LinkedList();
		q.offer("안정빈");
		q.offer("조지훈");
		System.out.println(q.offer("문규리"));//true 있는지 없는지
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
