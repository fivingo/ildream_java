package day04;

import java.io.*;

public class Day04_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.in 1byte ü��
		//InputStreamReader 2byte ü��
		//BufferedReader ���ڿ� ü��
		//1byte -> ���ڿ� ���׷��̵�
		
		System.out.print("ù��° ��: ");	//println ���� �ԷµǴ� ���ڿ��� ����Ű ���Ե�
		String num1_s = br.readLine();	//���Ͱ� �ԷµǴ� �������� ������ �Էµ�
		int num1 = Integer.parseInt(num1_s);
		//rapper Ŭ���� �� Integer Ŭ���� ȣ��
		//Integer Ŭ������ parseInt �޼ҵ� ȣ��
		
		System.out.print("�ι�° ��: ");
		String num2_s = br.readLine();
		int num2 = Integer.parseInt(num2_s);
		
		System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
	}
}
