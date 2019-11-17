package day11;
// 다형성 (overriding) 예시1

// 과자들의 아버지
class Kaka {
	String kakaName;
	
	public void openKaka() {
		System.out.println("까까를 뜯어서 먹습니다.");
	}
}
// 바나나킥
class Banana extends Kaka {
	public Banana() {
		this.kakaName = "바나나킥";
	}
	public void openKaka() {
		System.out.println(kakaName + "은 봉지를 뜯어서 먹습니다.");
	}
}
// 프링글스
class Prin extends Kaka {
	public Prin() {
		this.kakaName = "프링글스";
	}
	public void openKaka() {
		System.out.println(kakaName + "의 뚜껑을 열어서 먹습니다.");
	}
}
// 고래밥
class Sea extends Kaka {
	public Sea() {
		this.kakaName = "고래밥";
	}
	public void openKaka() {
		System.out.println(kakaName + "의 상자를 뜯어서 먹습니다.");
	}
}

public class KakaTest {
	public static void main(String[] args) {
		Prin p = new Prin();
		p.openKaka();
		
		Kaka krr[] = new Kaka[3];
		krr[0] = new Sea();
		krr[1] = new Prin();
		krr[2] = new Banana();
		
		for (int i = 0; i < krr.length; i++) {
			krr[i].openKaka();
		}
	}
}
