package day08;

public class Day08_03 {	// �޼��� ���ʿ���3
	
	// call by reference - �Ű������� �ּҰ� ��������
	public static void refTest(int arr[]) {
		arr[2] = 1004;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		refTest(arr);
		for (int i = 0; i < arr.length; i++) {	// ������ ����o
			System.out.print(arr[i] + " ");
		}
	}
}
