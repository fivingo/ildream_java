package day07;

public class Day07_04 {	// ��ü���� Ư¡3: ������(�ּ�) ������ ���� ������ ����
	public static void main(String[] args) {
		int x[] = {10, 20, 30, 40, 50};
		
		for (int i  = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		int y[] = x;
		y[2] = 1004;
		for (int i  = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println();
		for (int i  = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		// y�迭�� ���������� x�迭�� �����͵� ��ȭ
	}
}
