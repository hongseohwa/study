package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 프레임워크
 * - 컬렉션의 사전적 의미 : 수집해서 모으다, 저장한다는 의미.
 * - 자바에서 컬렉션은 데이터의 추가, 수정 , 삭제, 검색 등을 효과적으로 제공해 주는 자료 구조 관련 클래스.
 *   ==> 값을 담을 수 있는 그릇을 의미함(컨테이너 개념).
 * - java.util 패키지에 포함되어 있음.
 * - 인터페이스를 통해서 정형화된 방법으로 다양한 컬렉션 클래스를 이용.
 * 
 * - 컬렉션 프레임워크
 *   1) 컬렉션을 표준화하여 설계해 놓은 인터페이스
 *   2) List 계열, Set 계열, Map 계열
 */

/*
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 * 1. List 계열의 컬렉션 프레임워크의 특징
 *    - 자료의 순서가 보장(index) : 정렬 기능 제공.
 *    - 중복 데이터가 허용.
 *    - List 인터페이스의 자식클래스로 구현 
 *      ==> ArrayList(O), LinkedList(가끔), Vector(X)
 *    - 특히 DB에 데이터를 레코드 단위로 저장하거나 저장된 데이터를 가져을 경우 많이 사용이 됨.
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★    
 */

public class List_01 {

	public static void main(String[] args) {
		
		// List 계열 컬렉션 객체 생성
		List<String> list = new ArrayList<String>();
		
		// 1. add("값")
		// ==> ArrayList에 데이터를 추가하는 메서드.
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순"); // 중복 데이터
		list.add("김유신");
		list.add("김연아");
		list.add("유관순"); // 중복 데이터
		
		// 2. size()
		// ==> 데이터의 크기를 정수값으로 반환해 주는 메서드.
		System.out.println("list의 크기 >>> " + list.size());
		System.out.println();
		
		// 3. get(index)
		// ==> ArrayList에 저장되어 있는 데이터를 출력해 주는 메서드.
		System.out.println("list[2] 데이터 >>> " + list.get(2));
		System.out.println();
		
		// ArrayList에 있는 모든 데이터를 화면에 출력해 보자.
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list [" + i + "] >>> " + list.get(i));
		}
		System.out.println();
		
		// 4. clear()
		// ==> ArrayList의 모든 데이터를 제거하는 메서드.
		list.clear();
		
		System.out.println("list의 크기 >>> " + list.size());
		System.out.println();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순"); // 중복 데이터
		list.add("김유신");
		list.add("김연아");
		list.add("유관순"); // 중복 데이터
		
		// 5. remove(index)
		// ==> ArrayList의 특정 요소(인덱스)를 제거하는 메서드.
		//     다음 index부터 index 값이 하나씩 당겨진다.
		list.remove(2);
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list [" + i + "] >>> " + list.get(i));
		}
		System.out.println();
		
		// 6. add(index, element("값"))
		// ==> ArrayList의 특정 index에 데이터를 추가하는 메서드.
		//     해당 index에 추가가 되고, 기존에 있던 데이터들은 index가 뒤로 하나씩 물러감.
		list.add(2, "세종대왕");
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list [" + i + "] >>> " + list.get(i));
		}
		System.out.println();
		
		for(String s : list) {
			System.out.println("list 요소 >>> " + s);
		}
	}
}