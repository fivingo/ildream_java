package day06;

public class Day06_02 {
	public static void main(String[] args) {
		
		// 인위적인 초기식
		char temp = 'A';	// int temp = 48;
		
		// 조건식
		while (temp <= 'Z') {	// temp <= 90
			System.out.print(temp + " ");
			
			// 증감식
			temp++;
		}
	}
}
