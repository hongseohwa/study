package exam;

import javax.swing.JOptionPane;

public class ProductSearch {

	public static void main(String[] args) {
		
		String productName = JOptionPane.showInputDialog("검색할 상품명을 입력하세요.");
		ProductSearchData psd = new ProductSearchData();
		String productInfo = psd.search(productName);
		
		try {
			productInfo.length();
			JOptionPane.showMessageDialog(null, productInfo);
		} catch(Exception e) {
			// 예외가 발생했을 때 처리할 문장
			JOptionPane.showMessageDialog(null, "해당 상품이 없습니다.");
		}
	}
}