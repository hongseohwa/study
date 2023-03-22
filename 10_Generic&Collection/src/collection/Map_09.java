package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 3. Map 계열의 컬렉션 프레임워크 특징
 *    - key, value를 한 쌍으로 해서 데이터를 저장하고, 검색하는 기능을 제공함.
 *    - key는 중복 불가, value는 중복 가능.
 *    - Map 인터페이스의 자식 클래스로 구현. 
 *      ==> HashMap(O), HashTable(O), Properties(가끔), TreeMap(X)
 */

public class Map_09 {

	public static void main(String[] args) {
		
		// Map 인터페이스의 자식클래스를 이용하여 객체 생성.
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 1. put()
		// ==> map에 데이터를 저장하는 메서드.
		//     이름을 키(key)로 저장, 점수를 값(value)으로 저장
		map.put("홍길동", 95);
		map.put("유관순", 90);
		map.put("세종대왕", 100);
		map.put("김유신", 88);
		map.put("강감찬", 72);
		
		// 2. get(key)
		// ==> map에 저장된 데이터를 가져오는 메서드.
		//     get(key) 메서드를 호출하면 key에 해당하는 value 값을 반환해 주는 메서드
		System.out.println("세종대왕 점수 >>> " + map.get("세종대왕") + "점");
		System.out.println();
		
		// 3. keySet()
		// ==> map에 저장된 전체 데이터를 가져오는 메서드.
		for(String s : map.keySet()) {
			System.out.println(s + " 님의 점수 >>> " + map.get(s) + "점");
		}
		System.out.println();
		
		// 검색을 해 보자.
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 위인을 선택하세요. : ");
		String searchName = sc.next();
		if(map.containsKey(searchName)) {
			System.out.println(searchName + "님의 점수 >>> " + map.get(searchName) + "점");
		} else {
			System.out.println("검색한 위인이 없습니다.");
		}
		
		sc.close();
	}
}