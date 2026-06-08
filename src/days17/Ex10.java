package days17;

/**
 * @author subin
 * @date 2026. 6. 4. 오후 3:20:03
 * @subject 
 * @content 배열 단점: 배열크기 자동 증가/감소
 *          링크드리스트 구조.-(노드)
 *          
 *           [1][주소] 
 */
public class Ex10 {

	public static void main(String[] args) {
		
		Node node1 = new Node();
	      node1.value = 10;      
	      Node node2 = new Node();
	      node2.value = 15;
	      node1.next = node2;
	      Node node3 = new Node();
	      node3.value = 17;
	      node2.next = node3;
	      Node node4 = new Node();
	      node4.value = 34;
	      node3.next = node4;      
	      node4.next = null;
	      
	      
	      node2.next = null;
	      Node node =node1;
		 while (node != null) {
			System.out.println(node.value);
			
			node = node.next;
		}

	}//main

}//class

class Node{
	int value= 0;
	Node next= null; //다음 노드 저장할 변수
}