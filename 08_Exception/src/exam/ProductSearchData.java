package exam;

public class ProductSearchData {
	
	String[][] proTable = null;
	
	public ProductSearchData() { // 기본 생성자
		
		proTable = new String[3][2];
		
		// 각 행의 [0] 열에는 상품명을 저장하고, 각 행의 [1] 열에는 상품정보를 저장을 한다.
		proTable[0][0] = "세탁기";
		proTable[0][1] = "드럼 세탁기 최신형";
		
		proTable[1][0] = "냉장고";
		proTable[1][1] = "지펠 냉장고 최신형";
		
		proTable[2][0] = "TV";
		proTable[2][1] = "HDTV 150인치 최신 모델";
	}
	
	// 상품명을 매개변수로 넘겨 받아서 해당 상품에 대한 상품명을 반환해 주는 메서드.
	String search(String pName) {
		String productInfo = null;
		for(int i = 0; i < proTable.length; i++) {
			if(pName.equals(proTable[i][0])) {
				productInfo = proTable[i][1];
			}
		}
		return productInfo;
	}
}