package day04;

import java.io.*;

public class Day04_07 {
	public static void main(String[] args) throws IOException {
		System.out.print("ù��° ��: ");
		int num1 = System.in.read() - 48;
		System.in.skip(2);
		
		System.out.print("�ι�° ��: ");
		int num2 = System.in.read() - '0';
		
		if (num1 > num2) {
			System.out.println("num1�� ũ�� �� ���� " + num1 + "�Դϴ�.");
		} else {
			System.out.println("num2�� ũ�� �� ���� " + num2 + "�Դϴ�.");
		}
	}
}
