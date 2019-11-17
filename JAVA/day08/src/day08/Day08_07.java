package day08;

import java.io.*;

public class Day08_07 {	// 메서드 생성과 호출 - 선택정렬(배열)
	
	/** 사용자 입력 메서드 */
	public static void inputArr(int[] arr) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자 5개 입력");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자" + (i + 1) + "> ");
			arr[i] = Integer.parseInt(br.readLine());
		}
	}
	
	/** 비즈니스 로직(선택정렬) 메서드 */
	public static void sortArr(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	/** 결과 출력 메서드 */
	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) throws IOException {
		int arr[] = new int[5];
		inputArr(arr);
		sortArr(arr);
		printArr(arr);
	}
}
