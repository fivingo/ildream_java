package day06;

public class Day06_05 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			int temp = (int) (Math.random() * 7 + 2);	// 범위 + 시작수
			System.out.print(temp + " ");
		}
	}
}
