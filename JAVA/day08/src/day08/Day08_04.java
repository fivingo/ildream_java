package day08;

import java.io.*;

public class Day08_04 { // �� �Է¹ް� ��¸޼��� ȣ��
	public static void gugu(int user) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(user + " * " + i + " = " + (user * i));
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.print("���Է�> ");
		gugu(System.in.read() - 48);
	}
}
