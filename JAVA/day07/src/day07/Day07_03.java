package day07;

public class Day07_03 {	// ��ü���� Ư¡2: �ּҰ� ���� ����
	public static void main(String[] args) {
		int x[] = {10, 20, 30, 40, 50};
		int y[] = {100, 200, 300};
		
		for (int i  = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		for (int i  = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println();
		System.out.println("------------------");
		
		// �迭 swap �˰���
		int temp[] = x;
		x = y;
		y = temp;
		
		for (int i  = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		for (int i  = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
	}
}
