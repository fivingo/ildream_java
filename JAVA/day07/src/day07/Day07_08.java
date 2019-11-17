package day07;
/*
 * 5���� �л����� 3���� ������ �Է¹޾�
 * ������ ����� ������
 * ����� �������� �������� �����Ͽ� ���
 * ex)
 * 1���л� 1������: 30
 * ..
 * 5���л� 5������: 70
 * 
 * 30 40 70 140 40
 */
import java.io.*;

public class Day07_08 {	// ������ �迭�� �Է¹����� �������� ���� (��������)
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int scores[][] = new int[5][3];
		
		// ���� �Է�
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "��° �л��Է�");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print((j + 1) + "�� ����: ");
				scores[i][j] = Integer.parseInt(br.readLine());
			}
			System.out.println();
		}

		// ������ ��հ�
		int sum[] = new int[5];
		int avg[] = new int[5];
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
				avg[i] = sum[i] / 3;
			}
			System.out.print("�л�" + (i + 1) + " ����: " + sum[i] + "\t");
			System.out.print("���: " + avg[i] + " ");
			System.out.println();
		}
		System.out.println();
		
		// ��������
		for (int i = 0; i < avg.length - 1; i++) {
			for (int j = i + 1; j < avg.length; j++) {
				if (avg[i] < avg[j]) {
					int temp = avg[j];
					avg[j] = avg[i];
					avg[i] = temp;
				}
			}
		}
		
		// ���
		System.out.print("��� �������� ����: ");
		for (int i = 0; i < avg.length; i++) {
			System.out.print(avg[i] + " ");
		}
	}
}
