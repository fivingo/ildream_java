package day03;

public class Day03_05 {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		// println은 자동개행
		
		System.out.print("이름: " + name);
		System.out.print("나이: " + age + "세");
		// print는 자동개행안됨
		
		System.out.print("이\t름: " + name + "\n");
		System.out.print("나\r이: " + age + "세\n");
		// \n 개행
		// \t 1탭만큼 띄움
		// \r 앞으로 이동
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d세\n", age);
	}
}
