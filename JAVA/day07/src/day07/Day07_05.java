package day07;

import java.io.*;

public class Day07_05 {	// 5개의 값 배열에 입력받고 출력 
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int scores[] = new int[5];
		int sum = 0;
		
		System.out.println("점수 5개 입력");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("과목" + (i + 1) + "> ");
			scores[i] = Integer.parseInt(br.readLine());
			sum += scores[i];
		}
		double avg = (double) sum / scores.length;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}
}
