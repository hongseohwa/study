package collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue 자료 구조
 * - queue 는 인터페이스여서 자식클래스로 객체를 생성하여 사용함.
 * - 대표적인 자식 클래스는 LinkedList 객체임.
 * - 특징 : 선입선출(FIFO : First In First Out) 구조임.
 */

public class List_07 {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		// 1. offer()
		// ==> queue에 저장하는 메서드.
		queue.offer("101번");
		queue.offer("102번");
		queue.offer("103번");
		queue.offer("104번");
		queue.offer("105번");
		
		/*
		 * peek()
		 * ==> queue에 저장된 데이터를 가져오는 메서드.
		 *     - queue의 맨 처음에 입력된 데이터를 가져 오는 메서드.
		 *     - 가져온 후 데이터를 queue에서 제거하지 않음.
		 */
		
		System.out.println("호출한 번호 >>> " + queue.peek());
		
		/*
		 * poll()
		 * ==> queue에 저장된 데이터를 가져오는 메서드.
		 *     - queue의 맨 처음에 입력된 데이터를 가져오는 메서드.
		 *     - 가져온 후 데이터를 queue에서 제거함.
		 */
		
		while(!queue.isEmpty()) {
			System.out.println("호출한 번호 >>> " + queue.poll());
		}
		System.out.println("큐의 크기 >>> " + queue.size());
	}
}