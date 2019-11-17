package day08;
/*
 * ���� �߱� ����
 * 1. �ߺ������ʴ� 3���� (1~9)
 * 2. �ڸ��� ���ڰ� ������ - ��Ʈ����ũ
 * 3. �ڸ��� �ٸ��� ���ڰ� ������ - ��
 * 4. ��ȸ�� 10�� ��, ���絵 ��
 * 
 * ����
 * �� �����߻�3�� �迭�� ���� -> ����� ����3�Է� -> [�ϳ��� ��] -> ������
 */
import java.io.*;

public class Day08_08 {
	
	/** ��ǻ�� ���� 3�� �߻� �� �迭�� ���� �޼��� */
	public static void getComRandom(int com[]) {
		while(true) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;
			}
			
			if (!(com[0] == com[1] || com[1] == com[2] || com[2] == com[0])) {
//				for (int i = 0; i < com.length; i++) {	// �ĳ��� ���
//					System.out.print(com[i] + " ");
//				}
				break;
			}
		}
		System.out.println();
	}
	
	
	
	/** ����� ���� 3�� �Է� �޼��� */
	public static void getUserNumber(int user[]) throws IOException {
		for (int i = 0; i < user.length; i++) {
			System.out.print("����" + (i + 1) + "> ");
			user[i] = System.in.read() - 48;
			System.in.skip(2);
			
			while (user[i] == 0) {
				System.out.println("0 �ȵ� �ٽ� �Է��ϼ�");
				System.out.print("����" + (i + 1) + "> ");
				user[i] = System.in.read() - 48;
				System.in.skip(2);
			} 
			
			while (i > 0 && user[i - 1] == user[i]) {
				System.out.println("�ߺ� �ȵ� �ٽ� �Է��ϼ�");
				System.out.print("����" + (i + 1) + "> ");
				user[i] = System.in.read() - 48;
				System.in.skip(2);
			}
		}
	}
	
	/** �� �迭�� �� �޼��� */
	public static void compare(int com[], int user[], int result[]) {
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (com[i] == user[j]) {
					if (i == j) {
						result[0] += 1;
					} else {
						result[1] += 1;
					}
				}
			}
		}
	}
	
	/** ��� ��� �޼��� */
	public static void getResult(int com[], int user[], int result[]) throws IOException {
		int op = 10;	// opportunity
		
		while (true) {
			getUserNumber(user);
			compare(com, user, result);
			
			System.out.println();
			System.out.print(op + ".");
			for (int i = 0; i < user.length; i++) {
				System.out.print(user[i] + " ");
			}
			System.out.println("[" + result[0] + "S " + result[1] + "B]");
			System.out.println();
			
			op -= 1;
			if (result[0] == 3) {
				System.out.println("�� �����. ���ӿ���");
				break;
			} else if (op == 0) {
				System.out.println("�� �����. ���ӿ���");
				break;
			} else {
				result[0] = 0;
				result[1] = 0;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("=���� �߱� ����=");
		System.out.println("���� 3�� ������� ¥��");
		System.out.println();
		
		int com[] = new int[3];
		int user[] = new int[3];
		int result[] = new int[2];
		
		getComRandom(com);
		getResult(com, user, result);
	}
}
