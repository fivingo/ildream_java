package day10;
// overloading 예시1 활용
public class CatTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.getClass();
		System.out.println("==============");
		
		Cat cat2 = new Cat("길냥이");
		cat2.getInfo();
		System.out.println("==============");
		
		Cat cat3 = new Cat("좆냥이", 10);
		cat3.getInfo();
		System.out.println("==============");
		
		Cat cat4 = new Cat("아이루", 1, "동반자");
		cat4.getInfo();
	}
}
