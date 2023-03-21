package singleton;

public class Company {
	
	private static Company instance = null;
	
	// 외부에서 기본생성자를 직접 접근할 수 없음.
	private Company() { } // 기본 생성자
	
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}