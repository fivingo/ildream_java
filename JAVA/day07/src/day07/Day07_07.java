package day07;

public class Day07_07 {	// 다차원배열 기초
	public static void main(String[] args) {
		
		
		
		// 다차원배열의 원리 이용 - 1차원배열의 주소값을 참조하는 배열의 연속확장
		double arr2[][] = new double[3][];
		arr2[0] = new double[5];
		arr2[1] = new double[3];
		arr2[2] = new double[7];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
