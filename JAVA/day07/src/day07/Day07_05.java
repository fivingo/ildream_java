package day07;

import java.io.*;

public class Day07_05 {	// 5���� �� �迭�� �Է¹ް� ��� 
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int scores[] = new int[5];
		int sum = 0;
		
		System.out.println("���� 5�� �Է�");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("����" + (i + 1) + "> ");
			scores[i] = Integer.parseInt(br.readLine());
			sum += scores[i];
		}
		double avg = (double) sum / scores.length;
		
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
	}
}
