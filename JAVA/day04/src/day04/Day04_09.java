package day04;

import java.io.*;

public class Day04_09 {
	public static void main(String[] args) throws IOException {
		System.out.println("1.¥��� 2.«�� 3.������ 4.�Ⱥ�ä");
		System.out.print("�޴�: ");
		int menu = System.in.read() - 48;
		
		if (menu == 1) {
			System.out.println("¥��� ������ �����ٶ�!!");
		} else if (menu == 2) {
			System.out.println("«�� ������ �����ٶ�!!");
		} else if (menu == 3) {
			System.out.println("������ ������ �����ٶ�!!");
		} else {
			System.out.println("�Ⱥ�ä ������ �����ٶ�!!");
		}
	}
}
