package day08;

import java.io.*;

public class Day08_07 {	// �޼��� ������ ȣ�� - ��������(�迭)
	
	/** ����� �Է� �޼��� */
	public static void inputArr(int[] arr) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���� 5�� �Է�");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("����" + (i + 1) + "> ");
			arr[i] = Integer.parseInt(br.readLine());
		}
	}
	
	/** ����Ͻ� ����(��������) �޼��� */
	public static void sortArr(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	/** ��� ��� �޼��� */
	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) throws IOException {
		int arr[] = new int[5];
		inputArr(arr);
		sortArr(arr);
		printArr(arr);
	}
}
