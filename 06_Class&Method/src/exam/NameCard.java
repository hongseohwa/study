package exam;

public class NameCard {
	String name;
	String phone;
	String addr;
	String rank;
	
	public NameCard() {}
	
	public NameCard(String name, String phone, String addr, String rank) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.rank = rank;
	}
	
	void print() {
		System.out.println("----------------------");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + addr);
		System.out.println("직급 : " + rank);
	}
}