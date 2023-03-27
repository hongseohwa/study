package khie;

import java.util.Scanner;

import model.StudentDTO;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 학번 입력 : ");
		String hakbun = sc.next();
		
		SelectOne selectOne = new SelectOne();
		StudentDTO dto = selectOne.selectOne(hakbun);
		
		System.out.println(dto.getHakbun() + "\t" + dto.getName() + "\t" + dto.getMajor() + "\t" + dto.getPhone() + "\t" + dto.getAddress() + "\t" + dto.getRegdate().substring(0, 10));
		
		sc.close();
	}
}