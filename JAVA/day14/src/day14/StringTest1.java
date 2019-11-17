package day14;
// String 참조 예시
public class StringTest1 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java"); 
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		
		if (str1 == str2) {	// 같은 데이터의 같은 객체 참조
			System.out.println("str1 == str2: 같다");
		} else {
			System.out.println("str1 == str2: 같지않다");
		}
		String res1 = (str1 == str3) ? "같다" : "같지않다";
		System.out.println("str1 == str3: " + res1);
		
		String res2 = str1.equals(str2) ? "같다" : "같지않다";
		String res3 = str1.equals(str3) ? "같다" : "같지않다";
		
		System.out.println("str1 == str2: " + res2);
		System.out.println("str1 == str3: " + res3);
	}
}
