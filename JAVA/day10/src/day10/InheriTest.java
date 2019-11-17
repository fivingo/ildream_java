package day10;
// 상속과 타입 변환 예시
class Super {	// 상위(슈퍼)클래스
	int a;
	double b;
	
	public Super() {
		a = 10;
		b = 20.0;
	}
	
	public void test1() {
		System.out.println("test1() 메서드 수행됨");
	}
}

class Sub extends Super {	// 하위(서브)클래스
	int a;
	int c;
	
	public Sub() {
		a = 100;
		c = 30;
	}
	
	public void test1() {	// 오버라이딩
		System.out.println("오버라이딩된 test1() 메서드 수행됨");
		System.out.println("c = " + c);
	}
	
	public void test2() {
		System.out.println("test2() 메서드 수행됨");
	}
}

public class InheriTest {
	public static void main(String[] args) {
		Super sp = new Super();
		System.out.println("sp.a = " + sp.a);
		System.out.println("sp.b = " + sp.b);
		sp.test1();
		System.out.println("------------------------");
		
		Super arr[] = new Super[3];	// 객체 배열
		// arr는 객체의 래퍼런스를 담는 변수 일뿐, 기본 null로 초기화
		arr[0] = new Super();
		arr[1] = new Super();
		arr[2] = new Super();
		arr[1].test1();	// 각 배열에 객체 생성해야 클래스멤버호출가능
		System.out.println("------------------------");
		
		Sub sb = new Sub();
		sb.test2();
		sb.test1();	// 오버라이딩된 메서드
		System.out.println("sb.c = " + sb.c);
		System.out.println("sb.b = " + sb.b);	// 서브클래스에는 없는 b출력 가능 (상속)
		System.out.println("sb.a = " + sb.a);	// 서브클래스에서 다시 초기화된채로 출력
		System.out.println("=========================");
		
		/* 타입 변환 */
		// 자동 타입 변환 (promotion) 자식 타입 -> 부모 타입
		Super sp2 = new Sub();	// 자식 타입 객체 생성 가능
		System.out.println("sp2.a = " + sp2.a);	// 슈퍼클래스의 필드 호출1
		System.out.println("sp2.b = " + sp2.b);	// 슈퍼클래스의 필드 호출2
		//System.out.println("sp.c = " + sp.c);	// 서브클래스의 멤버 호출 불가능1
		//sp.test2();	// 서브클래스의 멤버 호출 불가능2
		sp2.test1();	// '오버라이딩'된 서브클래스의 메서드가 호출됨
		// -> 메서드는 객체가 생성되는 heap영역이 아니라 static영역에 생성
		System.out.println("------------------------");
		
		Super arr2[] = new Super[3];
		arr2[0] = new Sub();	// 메서드 오버라이딩o
		arr2[1] = new Super();	// 메서드 오버라이딩x
		arr2[2] = new Sub();	// 메서드 오버라이딩o
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i].test1();
		}
		System.out.println("------------------------");
		
		// 강제 타입 변환 (Casting) 부모 타입 -> 자식 타입
		Sub sb2 = (Sub) sp2;
		System.out.println("sb2.c = " + sb2.c);	// 서브클래스의 멤버 호출 가능1
		sb2.test2();							// 서브클래스의 멤버 호출 가능2
	}
}
