package day05;

import java.io.*;

public class Day05_03 {
	public static void main(String[] args) throws IOException {
		System.out.println("1.¥��� 2.«�� 3.������ 4.�Ⱥ�ä");
		System.out.print("�޴�: ");
		int menu = System.in.read() - 48;
		
		switch (menu) {	//�־��� ������ ����
		case 1:
			System.out.println("¥��� ���õ�! �����ٶ�!");
			break;	//���α׷��� ������ �����Ű�� �������
		case 2:
			System.out.println("«�� ���õ�! �����ٶ�!");
			break;
		case 3:
			System.out.println("������ ���õ�! �����ٶ�!");
			break;
		case 4:
			System.out.println("�Ⱥ�ä ���õ�! �����ٶ�!");
			break;
		default:
			System.out.println("�߸��� �޴��Դϴ�!");
		}
	}
}
