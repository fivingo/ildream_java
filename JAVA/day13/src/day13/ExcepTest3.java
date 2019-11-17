package day13;
// 예외처리 3
public class ExcepTest3 {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");

		for (int i = 1; i <= 5; i++) {
			try {
				int temp = 10 / (i - 3);
				System.out.println("temp = " + temp);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없음");
			}
		}

		System.out.println("프로그램의 끝");
	}
}
