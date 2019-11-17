package day05;

public class Day05_05 {
	public static void main(String[] args) {
		int sum = 0;
		for (int count = 1; count <= 10; count++) {
			System.out.println(count + "번째 내이름은 홍길동!");
			sum += count;
		}
		System.out.println("1 ~ 10까지의 합:" + sum);
	}
}
