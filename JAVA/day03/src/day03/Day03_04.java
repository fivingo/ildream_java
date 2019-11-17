package day03;

public class Day03_04 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int max = num1 > num2 ? num1 : num2;	// 삼항연산자는 결과값 반환
		// 조건항 ? 참 : 거짓;
		
		System.out.println(num1 + "과 " + num2 + "중 큰 수는 " + max + "입니다");
		
		String str = num1 > num2 ? "num1" : "num2";
		
		System.out.println(str + "가 더 큽니다");
		
	}
}
