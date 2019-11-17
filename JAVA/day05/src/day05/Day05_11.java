package day05;

/*
 * 12345	* 56789
 * 23456	* 45678
 * 34567	* 34567
 * 45678	* 23456
 * 56789	* 12345
 */
public class Day05_11 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = (i + 1); j <= (5 + i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("\n-----\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = (5 - i); j <= (9 - i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
