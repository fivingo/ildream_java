package day08;

public class Day08_03 {	// 메서드 기초예시3
	
	// call by reference - 매개값으로 주소값 복제전달
	public static void refTest(int arr[]) {
		arr[2] = 1004;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		refTest(arr);
		for (int i = 0; i < arr.length; i++) {	// 데이터 변경o
			System.out.print(arr[i] + " ");
		}
	}
}
