package day13;
// 예외전가
import java.io.*;

class AAA {
	public void aaa() throws IOException {
		// IOE 인위적으로 발생 - throws: 전가 / throw: 발생
		throw new IOException();	
	}
}

class BBB {
	public void bbb() throws IOException {
		AAA a = new AAA();
		a.aaa();	// 다시 throws 해야함
	}
}

class CCC {
	public void ccc() {
		// RuntimeException계열은 JVM이 알아서 throws
		throw new NullPointerException();	
	}
}

public class ThrowsTest {
	public static void main(String[] args) throws IOException {
		BBB b = new BBB();
		b.bbb();	// 또 다시 throws 해야함
	}
}
