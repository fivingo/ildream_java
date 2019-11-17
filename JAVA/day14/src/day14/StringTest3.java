package day14;
// String클래스 - 문자열에서 특정 문자열 포함 확인
import java.util.*;

public class StringTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[10];
		arr[0] = "jsp임";
		arr[1] = "java다";
		arr[2] = "jsp에요";
		arr[3] = "java인가요?";
		arr[4] = "java입니다";
		arr[5] = "java였어요?";
		arr[6] = "jsp일지도";
		arr[7] = "java였습니다.";
		arr[8] = "jsp아닐걸";
		arr[9] = "jsp가 뭐냐";
		
		System.out.println("검색어를 입력해주세요");
		System.out.print("> ");
		String find = sc.nextLine();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains(find)) {	// 또는 startsWith: 지정 문자열 시작 판단
				System.out.println(arr[i]);
			}
		}
	}
}
