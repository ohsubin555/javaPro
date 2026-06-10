package days21.sec09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author subin
 * @date 2026. 6. 10. 오전 11:46:34
 * @subject 각종 리소스         -> 메소드 ->    스트림 변환
 * @content   배열                           BaseStream
 *           List,Set컬렉션                     IntStream
 *           파일                                 :
 *           디렉토리
 *           int 범위
 *           long 범위
 *           등등
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		// ArrayList   ->   Stream 변환
		//  Product
		// List<Product> list = List.of(null, null, null, null, null, null, null, null, null, null)
		List<Product> list = new ArrayList<Product>();
		for (int i = 1; i <= 10; i++) {
			Product product = new Product(i, "상품"+i, "멋진회사", (int)(10000*Math.random()));
			list.add(product);
		}
		
		// List -> Stream 
		Stream<Product> stream =  list.stream();
		// list.parallelStream();
		
		stream.forEach( System.out::println ); // 메소드 참조

	} // main

} // class






