package day10;
// overloading Ȱ�� ����
public class TvTest {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.rgb = 40;
		t1.mi = 60;
		t1.ri = 70;
		t1.getInfo();
		System.out.println("=============");
		
		Tv t2 = new Tv();
		t2.getInfo();
		System.out.println("=============");
		
		Tv t3 = new Tv(70);
		t3.getInfo();
		System.out.println("=============");
		
		Tv t4 = new Tv(30, 70, 40);
		t4.getInfo("���� ����ƮTV");
	}
}
