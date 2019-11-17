package day11;
// 다형성 (overriding) 예시2 - 배열
class Ball {
	String ballName;

	public void play() {
		System.out.println("공을 가지고 놉니다.");
	}
}

class Football extends Ball {
	public Football() {
		this.ballName = "축구공";
	}
	public void play() {
		System.out.println(ballName + "을 찹니다.");
	}
}

class Basketball extends Ball {
	public Basketball() {
		this.ballName = "농구공";
	}
	public void play() {
		System.out.println(ballName + "을 던집니다.");
	}
}

class Baseball extends Ball {
	public Baseball() {
		this.ballName = "야구공";
	}
	public void play() {
		System.out.println(ballName + "으로 사람을 맞춥니다.");
	}
}

public class BallTest {
	public static void main(String[] args) {
		Ball b[] = new Ball[3];
		b[0] = new Football();
		b[1] = new Basketball();
		b[2] = new Baseball();
		
		for (int i = 0; i < b.length; i++) {
			b[i].play();
		}
	}
}
