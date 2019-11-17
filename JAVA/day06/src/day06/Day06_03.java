package day06;

public class Day06_03 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// break;	// 반복문 종료
				continue;	// 반복문의 첫줄로 이동
			}
			System.out.println(i);
		}
	}
}
