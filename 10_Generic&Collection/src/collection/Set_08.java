package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 2. Set 계열의 컬렉션 프레임워크 특징
 *    - 자료의 순서가 없음(정렬 가능 없음. - index가 없음)
 *    - 중복 데이터 허용 불가.
 *    - Set 인터페이스의 자식 클래스를 이용하여 구현.
 *      ==> HashSet(O), TreeSet(X)
 */

public class Set_08 {

	public static void main(String[] args) {
		
		// Set 인터페이스의 자식클래스를 이용하여 객체 생성.
		Set<Integer> set = new HashSet<Integer>();
		
		// 1. add("값")
		// ==> 데이터를 추가하는 메서드.
		set.add(100);
		set.add(200);
		set.add(300); // 중복 데이터 발생
		set.add(400);
		set.add(500);
		set.add(300); // 중복 데이터 발생
		
		// 2. size()
		// ==> 원소의 크기를 알려주는 메서드.
		System.out.println("set 컬렉션 크기 >>> " + set.size());
		System.out.println();
		Iterator<Integer> it = set.iterator(); // 순서가 없기 때문에 for문 사용 불가능
		
		while(it.hasNext()) {
			System.out.println("set 데이터 >>> " + it.next());
		}
	}
}