package model;

public class Student {
	
	private String hakbun;
	private String name;
	private String major;
	private String phone;
	private String address;
	
	public Student() { }
	
	public Student(String hakbun, String name, String major, String phone, String address) {
		this.hakbun = hakbun;
		this.name = name;
		this.major = major;
		this.phone = phone;
		this.address = address;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
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
