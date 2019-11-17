package day04;

import java.io.*;
import java.text.*;

public class Day04_05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�������� �Ǽ��� �Է�: ");
		double radius = Double.parseDouble(br.readLine());
		
		double area = Math.PI * radius * radius;	//Math.PI(����:field) ȣ��
		
		//�Ǽ� �����Է�
		DecimalFormat df = new DecimalFormat();
		df.applyLocalizedPattern("0.000#");
		
		System.out.println("���� ����: " + df.format(area));
	}
}
