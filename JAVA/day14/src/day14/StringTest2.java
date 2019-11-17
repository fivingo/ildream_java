package day14;
// String클래스 - 문자열에서 특정 문자 개수 찾기
import java.io.*;

public class StringTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = null;
		char ch = 0;
		int count = 0;
		
		System.out.println("문자열을 입력해주세요");
		System.out.print("> ");
		str = br.readLine();
		
		System.out.println("찾을 문자을 입력해주세요");
		System.out.print("> ");
		ch = (char) br.read();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {	// 지정 인덱스에 char타입 반환
				count++;
			}
		}
		
		System.out.println(count);
	}
}
