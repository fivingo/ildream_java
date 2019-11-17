package day08;

import java.io.*;

public class Day08_05 {	// �޼��� ������ ȣ�� - ��Ģ���� �⺻ ����
	public static int cal(int num1, int num2, char op) {	// ������
		int res = 0;
		switch (op) {	// switch�� ����Ÿ�Ը� ���ǽ� ���� (char ����)
			case '+':
				res = num1 + num2;
				break;
			case '-':
				res = num1 - num2;
				break;
			case '*':
				res = num1 * num2;
				break;
			case '/':
				res = num1 / num2;
				break;
			default:
		}
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù��°��> ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("�ι�°��> ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("������> ");
		char op = (char) br.read();	// int�� ��ȯ�ϴ� �޼���	// readLine()�� String
		
		System.out.println();
		System.out.println(num1 + " " + op + " " + num2 + " = "
						+ cal(num1, num2, op));
	}
}
