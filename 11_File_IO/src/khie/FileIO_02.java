package khie;

import java.io.IOException;
import java.io.InputStream;

public class FileIO_02 {

	public static void main(String[] args) {
		
		System.out.println("한 문자를 입력하세요.");
		
		// System.in : 표준입력장치(키보드)
		try {
			InputStream is = System.in;
			
			// read() : 표준입력장치를 통해서 입력받은 데이터를 읽게 됨.
			//          읽으면 ASCII 코드 상의 숫자로 변환이 됨.
			int num = is.read();
			
			System.out.println("읽어온 데이터(ASCII) >>> " + num);
			System.out.println("읽어온 데이터(문자) >>> " + (char)num);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}