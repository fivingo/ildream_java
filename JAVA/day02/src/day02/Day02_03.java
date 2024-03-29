package day02;

public class Day02_03 {

	public static void main(String[] args) {
			
		System.out.println("1. 논리형 자료형");
		
		boolean bool1;
		bool1 = true;
		
		System.out.println("bool1 = " + bool1);
		
		boolean bool2 = false;
		
		System.out.println("bool2 = " + bool2);
		
		System.out.println("2. 정수형 자료형");
		
		byte by = 127;
		
		by++; // 간접오버플로우 발생 (byte: -128 ~ 127)
		System.out.println("by = " + by);
		
		char ch = 'A' + 1; // 문자A 아스키코드로 저장
		
		System.out.println("ch = " + ch);
		// System.out.println("ch = " + (ch + 1));
		// (ch + 1)가 int로 자동형변환
		System.out.println("ch = " + (char)(ch + 1)); // 강제형변환
		
		short sh = 1004;
		
		System.out.println("sh = " + sh);
		
		int in = 10004; // 정수의 기본 자료형
		
		System.out.println("in = " + in);
		
		byte b1 = 3;
		byte b2 = 4;
		
		int result = b1 + b2;
		// byte result = b1 + b2; : int로 타입 자동변형
		// byte result = (byte)(b1 + b2); : 강제형변환
		
		System.out.println("result = " + result);
		
		long lo = 1234L;
		// 정수의 기본자료형 int로 자동변형되기에 접미어 L 붙임
		
		System.out.println("lo = " + lo);
		
		System.out.println("3. 실수형 자료형");
		
		float fl = 3.14F;
		// 실수의 기본자료형 double로 자동변형되기에 접미어 F 붙임
		
		System.out.println("fl = " + fl);
		
		double dou = 3.14;
		
		System.out.println("dou = " + dou);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}