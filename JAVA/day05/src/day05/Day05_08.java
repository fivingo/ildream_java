package day05;

import java.io.*;

public class Day05_08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력: ");
		int num = Integer.parseInt(br.readLine());

		boolean res = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {	//소수아님
				res = true;
				break;				//for문 나오기
				//System.exit(0);	//프로그램 종료
			} else {
				res = false;
			}
		}
		
		if (res) {
			System.out.println("소수아님");
		} else {
			System.out.println("소수임");
		}
	}
}
