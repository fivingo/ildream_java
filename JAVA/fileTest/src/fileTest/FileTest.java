package fileTest;
// File 클래스 기초
import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("E:/Programming/Library/ojdbc14.jar");	// 절대경로만
		System.out.println("f의 유무?: " + f.exists());		// 유무 확인 필수
		System.out.println("f가 파일?: " + f.isFile());		// 파일 확인
		System.out.println("f가 디렉토리?: " + f.isDirectory());	// 폴더 확인
		System.out.println("f의 이름?: " + f.getName());	// 이름 확인
		System.out.println("f의 경로?: " + f.getPath());	// 경로 확인
		System.out.println("f의 크기?: " + f.length());	// 용량 확인(byte)
		System.out.println();
		
		File f2 = new File("E:/Programming/Library");
		System.out.println("f2의 유무?: " + f2.exists());
		System.out.println("f2가 파일?: " + f2.isFile());
		System.out.println("f2가 디렉토리?: " + f2.isDirectory());
		System.out.println();
		File[] files = f2.listFiles();	// 폴더의 파일 목록
		for (int i = 0; i < files.length; i++) {
			String type = files[i].isFile() ? "[FILE]\t"  : "[DIR]\t";
			System.out.println(type + files[i].getName()
							+ (files[i].isFile() ? " (" + files[i].length() + "byte)" : ""));
		}
	}
}
