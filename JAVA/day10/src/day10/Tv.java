package day10;
// overloading 기초
public class Tv {
	
	// 속성 - 멤버변수 
	int rgb;	// 색상
	int mi;		// 명암
	int ri;		// 밝기
	
	// 생성자 - 멤버변수의 초기화	// 매개변수의 타입, 개수, 순서 다르게
	public Tv() {	// 기본생성자
		rgb = 50;
		mi = 50;
		ri = 50;
	}
	public Tv(int rgb) {		// 인자생성자
		this();	// 기본생성자 호출
		this.rgb = rgb;
	}
	public Tv(int rgb, int m) {	// 인자생성자
		this(rgb);		// 인자생성자 호출
		mi = m;
	}
	public Tv(int rgb, int m, int ri) {	// 인자생성자
		this(rgb, m);	// 인자생성자 호출
		this.ri = ri;
	}
	
	// 기능 - 멤버메서드
	public void getInfo() {
		System.out.println("색상: " + rgb);
		System.out.println("명암: " + mi);
		System.out.println("밝기: " + ri);
	}
	public void getInfo(String title) {	// 메서드 오버로딩
		System.out.println(title);
		this.getInfo();
	}
}
