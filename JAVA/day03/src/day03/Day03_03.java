package day03;

public class Day03_03 {
	public static void main(String[] args) {
		System.out.println("1. 대입연산자와 산술연산자");
		
		int i;
		
		i = 10;
		System.out.println("i = " + i);
		i = i + 1;
		System.out.println("i = " + i);
		i += 1;
		System.out.println("i = " + i);
		i++;
		System.out.println("i = " + i);
		
		i = i - 1;
		i -= 1;
		i--;
		System.out.println("i = " + i);
		
		// i = i * 2;
		i *= 2;
		// i /= 3;	// 몫
		i %= 3;		// 나머지
		System.out.println("i = " + i);
		
		System.out.println("\r2. 단항연산자");
		System.out.println("2_1. 비트 Not 연산자");
		
		int m = 41;
		
		System.out.println("~m = " + ~m);
		// 이진수코드로 변환하고 부정 -> (음수화)
		
		
		System.out.println("\r2_2. 논리 Not 연산자");
		
		boolean n = true;
		
		System.out.println("!n = " + !n);
		// System.out.println("!m = " + !m);	// 컴파일 에러
		// 비트연산자(~)와 논리연산자(!)의 구분
		
		System.out.println("\r3. 비트 시프트 연산자");
		
		/* 
		 * 형식
		 * [ 값 연산자 이동횟수 ] 
		 * 
		 * 1. <<
		 * 	값을 원하는 횟수만큼 왼쪽으로 이동
		 * 	나머지는 0으로 채워짐
		 * 2. >>
		 * 	값을 원하는 횟수만큼 오른쪽으로 이동
		 * 	나머지는 부호화비트로 채워짐
		 * 3. >>>
		 * 	값을 원하는 횟수만큼 오른쪽으로 이동
		 * 	나머지는 무조건 0으로 채워짐
		 */
		int s = 6;	// ...0000 0110
		
		System.out.println("s = " + s);
		// System.out.println("s << 2 = " + s << 2);
		// 연산자 우선순위로 인한 컴파일에러
		System.out.println("s << 2 = " + (s << 2));		// ...0001 1000
		System.out.println("s >> 2 = " + (s >> 2));		// ...0000 0001
		System.out.println("s >>> 2 = " + (s >>> 2));	// ...0000 0001
		
		int s2 = -6;	// 음수화: 이진수코드로 변환 하고 +1	// 1111...1111 1010
		
		System.out.println("s2 = " + s2);
		System.out.println("s2 << 2 = " + (s2 << 2));	// 1111...1110 1000
		System.out.println("s2 >> 2 = " + (s2 >> 2));	// 1111...1111 1110
		System.out.println("s2 >>> 2 = " + (s2 >>> 2));	// 0011...1111 1110
		
		System.out.println("\r4. 관계연산자");
		
		System.out.println("7 > 3 = " + (7 > 3));
		System.out.println("7 < 3 = " + (7 < 3));
		System.out.println("7 == 3 = " + (7 == 3));
		System.out.println("7 != 3 = " + (7 != 3));
		
		System.out.println("\r5. 비트연산자");
		
		/* 
		 * & and 연산자 
		 * 	대조되는 비트를 비교하여 모두 1이면 1을 반환
		 * 	하나라도 0이면 0을 반환
		 * | or 연산자
		 * 	대조되는 비트를 비교하여 하나라도 1이면 1을 반환
		 * 	모두 0이면 0을 반환
		 * ^ xor 연산자
		 * 	대조되는 비트를 비교하여 서로 다르면 1을 반환
		 * 	같으면 0을 반환
		 */
		
		int a = 6;	// ...0000 0110
		int b = 11;	// ...0000 1011
		
		System.out.println("a = " + a + " / b = " + b);
		System.out.println("a & b = " + (a & b));	// ...0000 0010
		System.out.println("a | b = " + (a | b));	// ...0000 1111
		System.out.println("a ^ b = " + (a ^ b));	// ...0000 1101
		
		System.out.println("\r6. 논리연산자");
		
		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && true = " + (false && true));
		System.out.println("false && false = " + (false && false));
		
		System.out.println("7 > 5 && 4 > 3 = " + (7 > 5 && 4 > 3));
		System.out.println("7 > 5 && 4 < 3 = " + (7 > 5 && 4 < 3));
		System.out.println("7 < 5 && 4 > 3 = " + (7 < 5 && 4 > 3));
		System.out.println("7 < 5 && 4 < 3 = " + (7 < 5 && 4 < 3));
		// 연산자 우선순위에 따라 >, <가 &&보다 먼저 계산
		
		int n1 = 1;
		int n2 = n1++;
		// n1는 우선순위에 따라 n2에 대입 후 1이 증가된 상태로 자동저장
		// n1++ == n1 = n1 + 1
		// 후증감연산자(n1++)는 우선순위 가장 마지막
		
		if ((n1 > ++n2) && (n1++ == n2)) {	// f && t	// ++n2는 우선순위에 따라 먼저 1 증가 후 비교
			n1 += n2;
		}
		// 앞 관계연산자가 false라 뒤 관계연산자는 처리되지 않는다. (어짜피 false)
		System.out.println("n1 = " + n1 + " / n2 = " + n2);
		
		int n3 = 1;
		int n4 = n3++;
		
		if ((n3 > ++n4) & (n3++ == n4)) {	// f && t
			n3 += n4;
		}
		// 비트연산자이기 떄문에 양쪽 관계를 비교하기위해 모두 처리됨. (n3++ 처리)
		System.out.println("n3 = " + n3 + " / n4 = " + n4);
	}
}
