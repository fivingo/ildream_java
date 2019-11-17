package day07;

public class Day07_04 {	// 객체지향 특징3: 변수값(주소) 복제시 같은 데이터 참조
	public static void main(String[] args) {
		int x[] = {10, 20, 30, 40, 50};
		
		for (int i  = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		int y[] = x;
		y[2] = 1004;
		for (int i  = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println();
		for (int i  = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		// y배열을 수정했지만 x배열의 데이터도 변화
	}
}
