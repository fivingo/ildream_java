package day07;

import java.io.*;

public class Day07_06 {	// 배열에 입력받은값 내림차순 정렬 (선택정렬)
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[5];
		
		// 입력
		System.out.println("숫자 5개 입력");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자" + (i + 1) + "> ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 비즈니스 로직
		for (int i = 0; i < arr.length - 1; i++) {		// 주대상자 담당
			for (int j = i + 1; j < arr.length; j++) {	// 비교대상자 담당
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
