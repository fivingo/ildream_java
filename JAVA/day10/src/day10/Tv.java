package day10;
// overloading ����
public class Tv {
	
	// �Ӽ� - ������� 
	int rgb;	// ����
	int mi;		// ���
	int ri;		// ���
	
	// ������ - ��������� �ʱ�ȭ	// �Ű������� Ÿ��, ����, ���� �ٸ���
	public Tv() {	// �⺻������
		rgb = 50;
		mi = 50;
		ri = 50;
	}
	public Tv(int rgb) {		// ���ڻ�����
		this();	// �⺻������ ȣ��
		this.rgb = rgb;
	}
	public Tv(int rgb, int m) {	// ���ڻ�����
		this(rgb);		// ���ڻ����� ȣ��
		mi = m;
	}
	public Tv(int rgb, int m, int ri) {	// ���ڻ�����
		this(rgb, m);	// ���ڻ����� ȣ��
		this.ri = ri;
	}
	
	// ��� - ����޼���
	public void getInfo() {
		System.out.println("����: " + rgb);
		System.out.println("���: " + mi);
		System.out.println("���: " + ri);
	}
	public void getInfo(String title) {	// �޼��� �����ε�
		System.out.println(title);
		this.getInfo();
	}
}
