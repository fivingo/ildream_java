package day07;

import java.io.*;

public class Day07_06 {	// �迭�� �Է¹����� �������� ���� (��������)
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[5];
		
		// �Է�
		System.out.println("���� 5�� �Է�");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("����" + (i + 1) + "> ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// ����Ͻ� ����
		for (int i = 0; i < arr.length - 1; i++) {		// �ִ���� ���
			for (int j = i + 1; j < arr.length; j++) {	// �񱳴���� ���
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
