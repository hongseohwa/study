package exam;

public class Exam_14 {

	public static void main(String[] args) {
		
		int count = 1;
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count;
				System.out.print(arr[i][j] + "\t");
				count++;
			}
			System.out.println();
		}
	}
}