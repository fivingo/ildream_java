package day14;
// HashMap 기초
import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("사과", "apple");		// key, value: 값 삽입 (데이터 갱신)
		map.put("바나나", "banana");
		map.put("plate", "접시");
		
		System.out.println("사과 영어로 뭐냐? " + map.get("사과"));
		System.out.println("plate 뭔뜻이냐? " + map.get("plate"));
		
		map.put("사과", "아이폰");
		System.out.println("사과 영어로 뭐냐? " + map.get("사과"));	// 데이터 갱신
	}
}
