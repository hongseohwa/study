package khie;

import java.io.IOException;

public class FileIO_04 {

	public static void main(String[] args) {
		
		System.out.println("한 줄을 입력하세요.");
		try {
			
			while(true) {
				int num = System.in.read();
				if(num == '\n') {
					break;
				}
				System.out.print((char)num);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}