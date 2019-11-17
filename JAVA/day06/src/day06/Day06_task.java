package day06;

import java.io.*;

public class Day06_task {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("���� 1 ~ 99�� �Է�(100�Է� ����): ");
			int num = Integer.parseInt(br.readLine());
			
			if (num == 100) {
				System.out.println("���α׷� ����");
				System.exit(0);
			} else if (!(1 <= num && num < 100)) {
				System.out.println("���� 1 ~ 99�� �Է����ּ���");
				System.out.println();
			} else if (num % 3 == 0){
				System.out.println("�ڼ� ¦!");
				System.out.println();
			} else {
				System.out.println(num + "�� 3�� ���X");
				System.out.println();
			}
		}
	}
}
