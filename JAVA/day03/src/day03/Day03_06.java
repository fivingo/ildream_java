package day03;

import java.io.*; // io 패키지 이용

public class Day03_06 {
	public static void main(String[] args) throws IOException { // 예외처리
		System.out.println("A");
		int a = System.in.read();
		// 입력시 ASCII코드로 입력시
		// 한글자만 입력됨
		System.out.println("C");
		System.out.println("a = " + a);
		
		System.out.println("첫번째: ");
		int c1 = System.in.read();
		System.out.println("두번째: ");
		int c2 = System.in.read();
		System.out.println("세번째: ");
		int c3 = System.in.read();
		
		System.out.println("c1 = " + c1 + " c2 = " + c2 + " c3 = " + c3);
		// 엔터키도 /r(13)과 /n(10) 입력됨
		
		// 엔터키의 /r/n 한번씩 받음
		System.out.println("첫번째: ");
		int e1 = System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("두번째: ");
		int e2 = System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("세번째: ");
		int e3 = System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.println("e1 = " + e1 + " e2 = " + e2 + " e3 = " + e3);
		
		// skip 메소드 이용 (/r/n 2번받음)
		System.out.println("첫번째: ");
		int s1 = System.in.read();
		System.in.skip(2);	
		System.out.println("두번째: ");
		int s2 = System.in.read();
		System.in.skip(2);
		System.out.println("세번째: ");
		int s3 = System.in.read();
		System.in.skip(2);
		
		System.out.println("s1 = " + s1 + " s2 = " + s2 + " s3 = " + s3);
	}
}
