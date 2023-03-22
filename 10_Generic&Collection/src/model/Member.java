package model;

/*
 * ★★★★★★★★★★★★★★
 * 자바 빈(java bean)?
 * - DB에 접근하여 테이블의 특정 컬럼(속성)에 값을 지정하거나, 저장된 값을 가져올 때 사용하는 클래스.
 * - Java Bean == DTO(Data Transfer Object) == VO(Value Object)
 * - 구성요소
 *   1. 멤버변수 - DB 컬럼명 : 접근지정자(private)
 *   2. setter() : 지정자 메서드.
 *   3. getter() : 획득자 메서드.
 */

public class Member {
	
	// 만약 DB 상의 테이블의 이름이 Member(회원 테이블) 이라고 가정했을 때 member 테이블의 구성(컬럼)이
	// id, pwd, name, age, phone, address 로 구성이 되어 있다고 가정을 하면 
	// 멤버변수
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String phone;
	private String address;
	
	public Member() { } // 기본 생성자
	
	public Member(String id, String pwd, String name, int age, String phone, String address) { // 인자 생성자
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}