package day14;
// String클래스: 원본 불변의 법칙 (원본데이터 훼손 불가)
// StringBuffer클래스: String의 원본수정불가 보완
public class StringTest4 {
	public static void main(String[] args) {
		String str = "hello java";
		System.out.println("str = " + str);
		
		// str.concat(" hi jsp")	// str값이 바뀌지않는다.
		String str_c = str.concat(" hi jsp");	// 지정 문자열을 이 문자열 마지막에 연결 후 반환
		System.out.println("str = " + str_c);

		// str.substring(2, 4)		// str값이 바뀌지않는다.
		String str_s = str.substring(2, 4);		// 지정한 인덱스 범위 문자열 반환 
		System.out.println("str = " + str_s);
		
		// StringBuffer는 객체 생성 필요
		StringBuffer sb = new StringBuffer("hello java!!");
		System.out.println("sb = " + sb);
		
		sb.insert(6, "jsp!!");	// 문자열 삽입
		System.out.println("sb = " + sb);
		
		sb.append("hi!!");		// 문자열 연결
		System.out.println("sb = " + sb);
		
		sb.delete(11, 16);		// 문자열 삭제
		System.out.println("sb = " + sb);
	}
}
