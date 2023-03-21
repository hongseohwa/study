package util;

import java.util.Calendar;

/*
 * 3. Calendar 클래스
 *    - 날짜 / 시간과 관련된 정보를 제공해 주는 클래스.
 *    - Calendar 클래스는 추상클래스임.
 *    - 추상클래스로 작성된 이유 : 날짜와 시간을 계산하는 방법이 지역, 나라마다 다르기 때문임.
 *    - Calendar 클래스는 날짜와 시간을 계산하는데 꼭 필요한 메서드나 상수로 구성이 되어 있음.
 *    - Calendar 클래스를 객체 생성을 하려면 Calendar 클래스가 가지고 있는 클래스(정적) 메서드 getInstance() 메서드를 사용하면 됨.
 *    - getInstance() 메서드를 호출하면 내부적으로 java.util.GregorianCalendar 객체를 생성하여 리턴을 함.
 *    - GregorianCalendar 클래스는 Calendar 클래스의 자식 클래스임.
 *    - getInstance() : 싱글턴 방식. 하나의 인스턴스만을 가지고 공유해서 사용할 때 쓰는 방식.
 */

public class Calendar_03 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 날짜와 관련된 정보를 확인하는 방법
		int year = cal.get(Calendar.YEAR); // 현재 년도
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		// 1년 52주 중에 오늘이 몇번째 주 인지 확인
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("현재 년도 >>> " + year + "년");
		System.out.println("현재 월 >>> " + month + "월");
		System.out.println("현재 일 >>> " + day + "일");
		System.out.println("현재 주는 52주 중에 " + week + "번째 주 입니다." );
		System.out.println();
		
		// 시간과 관련된 정보를 확인하는 방법
		// 1. 12시간제를 이용하는 방법 - 오전(0), 오후(1)
		int am_pm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		if(am_pm == 0) {
			System.out.println("현재 시간은 오전 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
		} else {
			System.out.println("현재 시간은 오후 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
		}
		System.out.println();
		
		// 2. 24시간제를 이용하는 방법
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("현재 시간은 " + hours + "시 " + minute + "분 " + second + "초 입니다.");
	}
}