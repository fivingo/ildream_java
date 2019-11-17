package day07;

public class Day07_02 {	// 객체지향 특징1: 주소값 대입 가능
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70};
		for (int i  = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 새로운 주소 참조
		arr = new int[3];
		for (int i  = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
