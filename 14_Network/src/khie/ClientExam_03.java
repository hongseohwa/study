package khie;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam_03 {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청 중]... ");
			
			socket.connect(new InetSocketAddress("localhost", 5002));
			
			System.out.println("[연결이 성공이 됨]... ");
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