package khie;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam_06 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		int portNo = 9999;
		byte[] bytes = null;
		try {
			serverSocket = new ServerSocket(portNo);
			Socket socket = serverSocket.accept();
			// 서버쪽에서만 데이터를 보낸다 > inputstream이 없어도 됨.
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			bytes = new byte[100];
			// 서버에서 클라이언트로 메세지 보낼 예정.
			// [서버 연결 성공]
			String message = "[서버 연결 성공]";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			
			// 서버에서 두번째 메시지를 보내 보자
			message = "클라이언트 방가방가!!";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}