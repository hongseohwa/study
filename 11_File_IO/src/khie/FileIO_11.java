package khie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO_11 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:/test/sample/sample.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("-------------------------------");
		bw.newLine(); // 다음 줄로 이동시키는 메서드
		
		bw.write("KH정보교육원 종로지점 - D 강의실");
		bw.newLine();
		
		bw.write("여러분 모두 취업합시다. 화이팅");
		bw.newLine();
		
		bw.write("-------------------------------");
		bw.newLine();
		
		bw.flush();
		
		// 입출력 객체를 닫아 주자.
		bw.close();
		fw.close();
		
		System.out.println("파일에 저장 완료");
	}
}