package day05;

public class Day05_06 {
	public static void main(String[] args) {
		int sum = 0;
		/*
		for (int cnt = 0; cnt <= 50; cnt += 5) {
				System.out.println(cnt);
				sum += cnt;
		}
		*/
		for (int cnt = 0; cnt <= 50; cnt++) {
			if (cnt % 5 == 0) {
				System.out.println(cnt);
				sum += cnt;
			}
		}
		System.out.println("5ÀÇ ¹è¼ö ÃÑÇÕ: " + sum);
	}
}
