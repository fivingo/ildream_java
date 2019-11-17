package day06;
// 2의 배수만 출력
public class Day06_04 {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (!(i % 2 == 0)) {
				continue;
			}
			System.out.println(i);
		}
	}
}
