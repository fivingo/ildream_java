package day06;

import java.io.*;

public class Day06_task {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("숫자 1 ~ 99중 입력(100입력 종료): ");
			int num = Integer.parseInt(br.readLine());
			
			if (num == 100) {
				System.out.println("프로그램 종료");
				System.exit(0);
			} else if (!(1 <= num && num < 100)) {
				System.out.println("숫자 1 ~ 99중 입력해주세요");
				System.out.println();
			} else if (num % 3 == 0){
				System.out.println("박수 짝!");
				System.out.println();
			} else {
				System.out.println(num + "은 3의 배수X");
				System.out.println();
			}
		}
	}
}
