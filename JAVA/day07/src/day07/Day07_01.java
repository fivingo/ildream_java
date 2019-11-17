package day07;

public class Day07_01 {	// 배열의 기초
	public static void main(String[] args) {
		
		// 1. 선언하기(구청신고)
		int arr[];
		
		// 2. 생성하기(건물짓기)
		arr = new int[5];
		
		// 3. 초기화(입주)
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[2] = " + arr[2]);
		//System.out.println("arr[5] = " + arr[5]);	// 예외발생 (생성x)
		System.out.println("arr[4] = " + arr[4]);	// 정수형자료형은 0으로 기본값 초기화
		
		boolean arr2[];
		arr2 = new boolean[3];
		System.out.println("arr2 = " + arr2[0]);	// boolean은 false로 기본값 초기화
		
		System.out.println("arr길이: " + arr.length);		// 배열길이 반환하는 메소드
		System.out.println("arr2길이: " + arr2.length);
		
		double arr3[] = new double[5];	// 선언과 동시에 객체생성
		System.out.println("arr3[0] = " + arr3[0]);
		System.out.println("arr3[2] = " + arr3[2]);
		System.out.println("arr3의 길이: " + arr3.length);
		
		int arr4[] = {10, 20, 30, 40, 50, 60, 70};
		// 선언 객체생성 초기화 3가지 동시에	// int arr4[] = new int[7];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	}
}
