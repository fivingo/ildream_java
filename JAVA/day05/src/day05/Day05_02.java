package day05;

import java.io.*;

public class Day05_02 {
	public static void main(String[] args) throws IOException {
		System.out.print("���� �ϳ� �Է�: ");
		char letter = (char) (System.in.read());
		
		String result = null;
		//if (letter >= 65 && letter <= 122) {	//91~95 �񿵹���
		if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
			result = "������";
		} else if (letter >= 48 && letter <= 57) {
			result = "����";
		} else {
			result = "��Ÿ����";
		}
		System.out.println("�Է��� " + letter + "�� " + result + "�Դϴ�.");
	}
}
