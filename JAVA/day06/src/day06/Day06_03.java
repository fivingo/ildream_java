package day06;

public class Day06_03 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// break;	// �ݺ��� ����
				continue;	// �ݺ����� ù�ٷ� �̵�
			}
			System.out.println(i);
		}
	}
}
