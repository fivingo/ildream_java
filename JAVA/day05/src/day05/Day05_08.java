package day05;

import java.io.*;

public class Day05_08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �Է�: ");
		int num = Integer.parseInt(br.readLine());

		boolean res = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {	//�Ҽ��ƴ�
				res = true;
				break;				//for�� ������
				//System.exit(0);	//���α׷� ����
			} else {
				res = false;
			}
		}
		
		if (res) {
			System.out.println("�Ҽ��ƴ�");
		} else {
			System.out.println("�Ҽ���");
		}
	}
}
