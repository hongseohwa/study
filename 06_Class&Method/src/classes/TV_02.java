package classes;

public class TV_02 {
	
	// 멤버변수
	String color; // TV 색상
	boolean power; // TV 전원
	int channel; // TV 채널
	
	// 멤버메서드
	void power() { // TV 전원을 누르는 메서드
		power = !power; // boolean 기본값이 false이기 때문에 누르면 전원이 켜짐 
	}
	
	void channelUp() { // TV 채널을 올리는 메서드
		if (power) {
			channel++;
		}
	}
	
	void channelDown() { // TV 채널을 내리는 메서드
		if (power) {
			channel--;
		}
	}
	
	void display() { // TV 상태를 표시하는 메서드
		String status = "";
		
		if (power) {
			status = "전원 On";
		} else {
			status = "전원 Off";
		}
		
		System.out.println("TV 색상 >>> " + color);
		System.out.println("TV 전원 >>> " + status);
		System.out.println("TV 채널 >>> " + channel);
	}
	
	public static void main(String[] args) {
		
		// 1단계 + 2단계 : 클래스 선언 및 클래스객체 생성
		TV_02 tv = new TV_02();
		tv.display();
		System.out.println();
		
		tv.color = "검정색";
		tv.channel = 7;
		tv.channelUp(); // 채널을 증가시키는 메서드 호출
		tv.display();
		System.out.println();
		
		// TV 작동
		tv.power(); // 전원을 On 시키는 메서드
		tv.channelUp();
		tv.display();
		System.out.println();
		
		/*
		 * [문제1] TV 객체를 만들되 tv1이라는 참조변수를 이용하여 객체를 만들어 아래와 같이 정보를 변경하세요..
		 *        조건1) 색상 : 흰색, 전원 : Off, 채널 : 15
		 *        조건2) tv1 정보를 화면에 출력할 것.
		 *              ==> display() 메서드를 이용하면 됨.
		 *        조건3) tv1 정보를 다음과 같이 변경하여 화면에 출력해 보세요.
		 *              색상 : 흰색, 전원 : On, 채널 : 28
		 */
		
		TV_02 tv1 = new TV_02();
		tv1.color = "흰색";
		tv1.channel = 15;
		tv1.display();
		System.out.println();
		
		tv1.power();
		for (int i = tv1.channel; i < 28; i++) {
			tv1.channelUp();
		}
		tv1.display();
		System.out.println();
		
		
		/*
		 * [문제2] TV 객체를 만들되 tv2이라는 참조변수를 이용하여 객체를 만들어 아래와 같이 정보를 변경하세요..
		 *        조건1) 색상 : 흰색, 전원 : Off, 채널 : 32
		 *        조건2) tv2 정보를 화면에 출력할 것.
		 *              ==> display() 메서드를 이용하면 됨.
		 *        조건3) tv2 정보를 다음과 같이 변경하여 화면에 출력해 보세요.
		 *              색상 : 검정색, 전원 : On, 채널 : 11
		 */
		
		TV_02 tv2 = new TV_02();
		tv2.color = "흰색";
		tv2.channel = 32;
		tv2.display();
		System.out.println();
		
		tv2.color = "검정색";
		tv2.power();
		for (int i = tv2.channel; i > 11; i--) {
			tv2.channelDown();
		}
		tv2.display();
	}
}