package day07;

public class Day07_07 {	// �������迭 ����
	public static void main(String[] args) {
		
		
		
		// �������迭�� ���� �̿� - 1�����迭�� �ּҰ��� �����ϴ� �迭�� ����Ȯ��
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
