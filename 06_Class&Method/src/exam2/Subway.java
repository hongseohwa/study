package exam2;

public class Subway { // 지하철 객체

	// 멤버변수
	int lineNumber; // 지하철 노선(호선)
	int passengerCount; // 지하철 노선의 승객 수
	int money; // 지하철 회사의 수입
	
	public Subway() { } // 기본 생성자
	public Subway(int lineNumber) { // 인자생성자
		this.lineNumber = lineNumber;
	}
	
	// 지하철 승차 메서드
	void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 지하철 정보 출력
	void showSubwayInfo() {
		System.out.println("지하철 노선 No. >>> " + lineNumber);
		System.out.println("지하철 승객 수 >>> " + passengerCount);
		System.out.println("지하철 회사 수입 >>> " + money);
	}
}
