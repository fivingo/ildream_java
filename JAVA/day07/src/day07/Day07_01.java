package day07;

public class Day07_01 {	// �迭�� ����
	public static void main(String[] args) {
		
		// 1. �����ϱ�(��û�Ű�)
		int arr[];
		
		// 2. �����ϱ�(�ǹ�����)
		arr = new int[5];
		
		// 3. �ʱ�ȭ(����)
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[2] = " + arr[2]);
		//System.out.println("arr[5] = " + arr[5]);	// ���ܹ߻� (����x)
		System.out.println("arr[4] = " + arr[4]);	// �������ڷ����� 0���� �⺻�� �ʱ�ȭ
		
		boolean arr2[];
		arr2 = new boolean[3];
		System.out.println("arr2 = " + arr2[0]);	// boolean�� false�� �⺻�� �ʱ�ȭ
		
		System.out.println("arr����: " + arr.length);		// �迭���� ��ȯ�ϴ� �޼ҵ�
		System.out.println("arr2����: " + arr2.length);
		
		double arr3[] = new double[5];	// ����� ���ÿ� ��ü����
		System.out.println("arr3[0] = " + arr3[0]);
		System.out.println("arr3[2] = " + arr3[2]);
		System.out.println("arr3�� ����: " + arr3.length);
		
		int arr4[] = {10, 20, 30, 40, 50, 60, 70};
		// ���� ��ü���� �ʱ�ȭ 3���� ���ÿ�	// int arr4[] = new int[7];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	}
}
