package day06;

import java.io.*;

public class Day06_01 {
	public static void main(String[] args) throws IOException {
		while (true) {
			int user = 0;
			
			do {
				System.out.print("�����Է�(0 = ����): ");
				user = System.in.read();
				System.in.skip(2);
			} while (!(user >= 48 && user <=57));
			
			if (user == '0') {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			
			System.out.println("�Է��� ���ڴ� " + (char) user + "�Դϴ�.");
		}
	}
}
