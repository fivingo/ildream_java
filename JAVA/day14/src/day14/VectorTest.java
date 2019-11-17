package day14;
// vector (가변 길이 배열), 제네릭 기초
import java.util.*;

public class VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector(4, 3);	// 초기치4, 증가치3
		
		System.out.println("v의 크기: " + v.capacity());		// vector의 용량 반환
		System.out.println("v에 저장된 데이터 수: " + v.size());	// vector의 요소수 반환
		
		for (int i = 1; i <= 9;i++) {
			v.add(i);	// 값 삽입 (데이터 추가) - autoboxing 
		} 
		
		System.out.println("v의 크기: " + v.capacity());
		System.out.println("v의 저장된 데이터 수: " + v.size());
		
		v.add(new Double(1.23));	// 객체 주소값 저장
		v.add(2.34);	// 실수 저장
		v.add("hello");	// 문자열 저장
		
		System.out.println("v의 크기: " + v.capacity());
		System.out.println("v의 저장된 데이터 수: " + v.size());
		
		System.out.println("v의 3번째 요소값: " + v.get(3));	// vector 지정요소 반환
		
		int in = (Integer) v.get(6);	// unboxing: Integer 레퍼런스 타입 (int x)
		System.out.println("in = " + in);
		Object obj = v.get(6);	// Vector의 상위클래스 Object (다형성)
		System.out.println("obg = " + obj);
		
		// 제네릭 - 컬렉션에 저장되는 데이터의 타입 설정
		Vector<String> v2 = new Vector<String>();	// 뒤 제네릭 생략x (구버전적용x)
		v2.add("hello");
		v2.add("hi");
		v2.add("java");
		v2.add("jsp");
		
		for (int i = 0; i < v2.size(); i++) {
			String temp = v2.get(i);	// 캐스팅 불필요 - 제네릭 String 타입 선언
			System.out.println(temp);
		}
		
		// ArrayList와 비교
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(100);
		arr.add(200);
		
		for (int i = 0; i < arr.size(); i++) {
			Integer temp = arr.get(i);
			System.out.println(temp);
		}
	}
}
