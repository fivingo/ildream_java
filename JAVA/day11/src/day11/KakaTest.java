package day11;
// ������ (overriding) ����1

// ���ڵ��� �ƹ���
class Kaka {
	String kakaName;
	
	public void openKaka() {
		System.out.println("�� �� �Խ��ϴ�.");
	}
}
// �ٳ���ű
class Banana extends Kaka {
	public Banana() {
		this.kakaName = "�ٳ���ű";
	}
	public void openKaka() {
		System.out.println(kakaName + "�� ������ �� �Խ��ϴ�.");
	}
}
// �����۽�
class Prin extends Kaka {
	public Prin() {
		this.kakaName = "�����۽�";
	}
	public void openKaka() {
		System.out.println(kakaName + "�� �Ѳ��� ��� �Խ��ϴ�.");
	}
}
// ����
class Sea extends Kaka {
	public Sea() {
		this.kakaName = "����";
	}
	public void openKaka() {
		System.out.println(kakaName + "�� ���ڸ� �� �Խ��ϴ�.");
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
