package day05;

public class Day05_05 {
	public static void main(String[] args) {
		int sum = 0;
		for (int count = 1; count <= 10; count++) {
			System.out.println(count + "��° ���̸��� ȫ�浿!");
			sum += count;
		}
		System.out.println("1 ~ 10������ ��:" + sum);
	}
}
