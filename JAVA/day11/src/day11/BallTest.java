package day11;
// ������ (overriding) ����2 - �迭
class Ball {
	String ballName;

	public void play() {
		System.out.println("���� ������ ��ϴ�.");
	}
}

class Football extends Ball {
	public Football() {
		this.ballName = "�౸��";
	}
	public void play() {
		System.out.println(ballName + "�� ���ϴ�.");
	}
}

class Basketball extends Ball {
	public Basketball() {
		this.ballName = "�󱸰�";
	}
	public void play() {
		System.out.println(ballName + "�� �����ϴ�.");
	}
}

class Baseball extends Ball {
	public Baseball() {
		this.ballName = "�߱���";
	}
	public void play() {
		System.out.println(ballName + "���� ����� ����ϴ�.");
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
