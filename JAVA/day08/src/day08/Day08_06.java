package day08;

import java.io.*;

public class Day08_06 {	// �޼��� ������ ȣ�� - ���������� ����
	
	/** �޴� ��� �޼��� */
	public static void printMenu() {
		System.out.println("-----------------------");
		System.out.println("���� ���� �� ���� v1.1");
		System.out.println("1.���� 2.���� 3.�� 4.����");
		System.out.println("-----------------------");
	}
	
	/** ����� �Է� �޼��� */
	public static int getUserValue() throws IOException {
		int user = 0;
		do {
			if (user != 0) {
				System.out.println("�ٽ� �Է��ϼ���");
			}
			System.out.print("�޴�> ");
			user = (int) (System.in.read()) - 48;
			System.in.skip(2);
			if (user == 4) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			}
		} while (!(user >= 1 && user <= 4));
		System.out.println("�����: " + user);
		return user;
	}
	
	/** ��ǻ�� ���� �߻� �޼��� */
	public static int getComValue() {
		int com = (int) ((Math.random()) * 3 + 1);
		System.out.println("��ǻ��: " + com);
		return com;
	}
	
	/** ����� ��� �޼��� */
	public static void getResult(int user, int com) {
		if (user == com) {
			System.out.println("## �����ϴ�. ##");
		} else if ((user + 1) % 3 == com % 3) {
			System.out.println("## ��ǻ�� �¸�! ##");
		} else {
			System.out.println("## ����� �¸�! ##");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		printMenu();
		
		while (true) {
			int user = getUserValue();
			int com = getComValue();	
			getResult(user, com);
		}
	}
}
