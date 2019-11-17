package day14;

import java.io.*;

public class AnimalTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1.강아지 2.좆냥이 3.오리");
		System.out.print("어떤 동물이 태어났나요? > ");

		String kindAnimal;
		kindAnimal = br.readLine();
		
		if (kindAnimal.equals("강아지")) {
			System.out.println("강아지가 월월웡ㄹ우렁루하고 짖어요~");
		} else if (kindAnimal.equals("좆냥이")) {
			System.out.println("좆냥이가 우워우어엉하고 짜증나게 굴어요~");
		} else if (kindAnimal.equals("오리")) {
			System.out.println("오리가 꽥고객꽤ㅣ괙하고 울어요~");
		} else {
			System.out.println("제대로 입력하셈");
		}
	}
}
