package day07;
/*
 * 5명의 학생에게 3개의 점수를 입력받아
 * 총점과 평균을 구한후
 * 평균을 기준으로 내림차순 정렬하여 출력
 * ex)
 * 1번학생 1번점수: 30
 * ..
 * 5번학생 5번점수: 70
 * 
 * 30 40 70 140 40
 */
import java.io.*;

public class Day07_08 {	// 다차원 배열에 입력받은값 내림차수 정렬 (선택정렬)
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int scores[][] = new int[5][3];
		
		// 점수 입력
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 학생입력");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print((j + 1) + "번 점수: ");
				scores[i][j] = Integer.parseInt(br.readLine());
			}
			System.out.println();
		}

		// 총점값 평균값
		int sum[] = new int[5];
		int avg[] = new int[5];
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
				avg[i] = sum[i] / 3;
			}
			System.out.print("학생" + (i + 1) + " 총점: " + sum[i] + "\t");
			System.out.print("평균: " + avg[i] + " ");
			System.out.println();
		}
		System.out.println();
		
		// 선택정렬
		for (int i = 0; i < avg.length - 1; i++) {
			for (int j = i + 1; j < avg.length; j++) {
				if (avg[i] < avg[j]) {
					int temp = avg[j];
					avg[j] = avg[i];
					avg[i] = temp;
				}
			}
		}
		
		// 출력
		System.out.print("평균 내림차수 정렬: ");
		for (int i = 0; i < avg.length; i++) {
			System.out.print(avg[i] + " ");
		}
	}
}
