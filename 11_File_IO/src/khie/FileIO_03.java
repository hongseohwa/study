package khie;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileIO_03 {

	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("C:/Windows/system.ini");
			
			while(true) {
				int readByte = is.read();
				
				if(readByte == -1) {
					break;
				}
				
				System.out.print((char)readByte);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}