package day13;
// ��������
import java.io.*;

class AAA {
	public void aaa() throws IOException {
		// IOE ���������� �߻� - throws: ���� / throw: �߻�
		throw new IOException();	
	}
}

class BBB {
	public void bbb() throws IOException {
		AAA a = new AAA();
		a.aaa();	// �ٽ� throws �ؾ���
	}
}

class CCC {
	public void ccc() {
		// RuntimeException�迭�� JVM�� �˾Ƽ� throws
		throw new NullPointerException();	
	}
}

public class ThrowsTest {
	public static void main(String[] args) throws IOException {
		BBB b = new BBB();
		b.bbb();	// �� �ٽ� throws �ؾ���
	}
}
