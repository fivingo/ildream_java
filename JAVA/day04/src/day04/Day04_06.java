package day04;

import java.io.*;

public class Day04_06 {
	public static void main(String[] args) throws IOException {
		System.out.print("ù��° ��: ");
		int num1 = System.in.read() - 48;
		System.in.skip(2);
		
		System.out.print("�ι�° ��: ");
		int num2 = System.in.read() - '0';
		
		//0���� ������ �Ұ���(Exception: Infinity)
		if (num2 == 0) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
			System.exit(0);	//0 ��������, �ܴ̿� ����������
		}
		
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}
