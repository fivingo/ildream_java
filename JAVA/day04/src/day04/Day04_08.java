package day04;

import java.io.*;

public class Day04_08 {
	public static void main(String[] args) throws IOException {
		System.out.print("���� �Է�: ");
		int num = System.in.read() - 48;
		
		if (num % 2 == 0 && num != 0) {
			System.out.println("���� " + num + "�� ¦���Դϴ�.");
		} else if (num == 0) {
			System.out.println("�׳� " + num + "�Դϴ�. ¥��");
 		} else {
 			System.out.println("���� " + num + "�� Ȧ���Դϴ�.");
 		}
	}
}
