package khie;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExam_07 {

	public static void main(String[] args) {
		
		byte[] bytes = null;
		String message = null;
		
		Socket socket = null;
		try {
			socket = new Socket("localhost", 9999);
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			
			// 서버에서 보낸 첫번째 데이터
			int readCount = is.read(bytes);
			message = new String(bytes, 0, readCount, "UTF-8");
			System.out.println(message);
			
			// 서버에서 보낸 두번째 데이터
			readCount = is.read(bytes);
			message = new String(bytes, 0, readCount, "UTF-8");
			System.out.println(message);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}