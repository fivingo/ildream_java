package day06;

import java.io.*;

public class Day06_06 {
	public static void main(String[] args) throws IOException {
		System.out.println("-----------------------");
		System.out.println("���� ���� �� ���� v1.1");
		System.out.println("1.���� 2.���� 3.�� 4.����");
		System.out.println("-----------------------");
		
		while (true) {
			
			// ����� �Է�
			System.out.print("�޴�> ");
			int user = (int) (System.in.read()) - 48;
			System.in.skip(2);
			if (user == 4) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
				//break; // �ݺ��� ����
			} else if (user < 1 || user > 4) {	// ��ȿ���˻�
				System.out.println("1~4 ������ ���ڸ� �Է��ϼ���.");
				System.out.println();
				continue;
			}
			/* ��ȿ���˻�2
			int user = 0;			// do~while�� �ۿ� ��������� �ʱ�ȭ
			do {
				if (user != 0) {	// �ϴ� ����̵� �ԷµƱ⿡ (0�� �ƴ�)
					System.out.println("�ٽ� �Է��ϼ���");
				}
				System.out.print("�޴�> ");
				user = (int) (System.in.read()) - 48;
				System.in.skip(2);
			} while (!(user >= 1 && user <= 4));		// ����
			*/
			//System.out.println("�����: " + (char) user);	// ���ڷ� ���
			switch (user) {
				case 1:
					System.out.println("�����: ����");
					break;
				case 2:
					System.out.println("�����: ����");
					break;
				case 3:
					System.out.println("�����: ��");
					break;
				default:
			}
			
			// ��ǻ�� ���� �߻�
			int com = (int) ((Math.random()) * 3 + 1);	
			// Math.random() �޼ҵ�� double Ÿ�� ��ȯ
			//System.out.println("��ǻ��: " + com);	// ���ڷ� ���
			switch (com) {
				case 1:
					System.out.println("��ǻ��: ����");
					break;
				case 2:
					System.out.println("��ǻ��: ����");
					break;
				case 3:
					System.out.println("��ǻ��: ��");
					break;
				default:
			}
			System.out.println();
			
			/* ����Ͻ� �������� */
			// ����� ���	// ����� �� 7����
			if (user == 1 && com == 2 || user == 2 && com == 3
					|| user == 3 && com == 1) {
				System.out.println("## ��ǻ�� �¸�! ##");
			} else if (user == 1 && com == 3 || user == 2 && com == 1
					|| user == 3 && com == 2) {
				System.out.println("## ����� �¸�! ##");
			} else {
				System.out.println("## �����ϴ�. ##");
			}
			
			// ����� ���2 // �������� ����� �� ���õ����� switchȰ��	// ����� �� 5����
			switch (user - com) {
				case -2:
				case 1:
					System.out.println("## ����� �¸�! ##");
					break;
				case 2:
				case -1:
					System.out.println("## ��ǻ�� �¸�! ##");
					break;
				case 0:
					System.out.println("## �����ϴ�. ##");
					break;
				default:
			}
			
			// ����� ���3 // �����ڵ� �̿� (������ ��)	// ����� �� 3���� (3����)
			if (user == com) {
				System.out.println("## �����ϴ�. ##");
			} else if ((user + 1) % 3 == com % 3) {
				System.out.println("## ��ǻ�� �¸�! ##");
			} else {
				System.out.println("## ����� �¸�! ##");
			}
			System.out.println();
		}
	}
}
