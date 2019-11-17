package day14;
// StringTokenizer (열거형 클래스)
import java.util.*;

public class StringTest5 {
	public static void main(String[] args) {
		String fruits = "사과, 배, 포도, 딸기";
		StringTokenizer st = new StringTokenizer(fruits, ", ");	// (문자열, 구분자)
		
		while (st.hasMoreTokens()) {	// 다음 토큰 유무 판단
			System.out.println(st.nextToken());	// 다음 토큰 반환
		}
		
		String str = "아 배 고 파 아";
		StringTokenizer st2 = new StringTokenizer(str);	// 구분자 미지정시 공백으로 구분
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
