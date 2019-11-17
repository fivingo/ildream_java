package day04;

import java.io.*;
import java.text.*;

public class Day04_05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("반지름을 실수로 입력: ");
		double radius = Double.parseDouble(br.readLine());
		
		double area = Math.PI * radius * radius;	//Math.PI(변수:field) 호출
		
		//실수 패턴입력
		DecimalFormat df = new DecimalFormat();
		df.applyLocalizedPattern("0.000#");
		
		System.out.println("원의 넓이: " + df.format(area));
	}
}
