package khie;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam_05 {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청 중]... ");
			
			socket.connect(new InetSocketAddress("localhost", 5002));
			
			System.out.println("[연결이 성공이 됨]... ");
			
			// 서버로 데이터 보내기
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			System.out.println("[데이터 보내기 성공]... ");
			
			// 클라이언트에서 서버 데이터 받기
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			
			// 클라이언트가 문자를 보내기 전까지는 서버는 대기상태가 됨.
			// 클라이언트에서 데이터를 보내면 보낸 데이터는 bytes 배열에 저장이 되고
			// 읽은 바이트 수는 readByCount 변수에 저장이 됨.
			int readByteCount = is.read(bytes);
			
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[데이터 받기 성공] >>> " + message);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}