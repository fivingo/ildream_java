package day08;

import java.io.*;

public class Day08_05 {	// 메서드 생성과 호출 - 사칙연산 기본 계산기
	public static int cal(int num1, int num2, char op) {	// 연산모듈
		int res = 0;
		switch (op) {	// switch는 정수타입만 조건식 가능 (char 가능)
			case '+':
				res = num1 + num2;
				break;
			case '-':
				res = num1 - num2;
				break;
			case '*':
				res = num1 * num2;
				break;
			case '/':
				res = num1 / num2;
				break;
			default:
		}
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째수> ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째수> ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자> ");
		char op = (char) br.read();	// int값 반환하는 메서드	// readLine()은 String
		
		System.out.println();
		System.out.println(num1 + " " + op + " " + num2 + " = "
						+ cal(num1, num2, op));
	}
}
