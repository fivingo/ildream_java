package day13;
// 예외처리 + finally
import java.io.*;

public class ExcepTest5 {
	public static void main(String[] args){
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int dataNumber = 0;		// 데이터입력 개수
		int printNumber = 0;	// 데이터출력 선택
		
		try {
			System.out.print("데이터 몇개 입력?> ");
			dataNumber = Integer.parseInt(br.readLine());
			int dataArr[] = new int[dataNumber];	// 데이터저장 배열
			for (int i = 0; i < dataArr.length; i++) {
				System.out.print("데이터" + (i + 1) + "> ");
				dataArr[i] = Integer.parseInt(br.readLine());
			}
			
			System.out.print("몇번째 출력?> ");
			printNumber = Integer.parseInt(br.readLine()) - 1;
			System.out.println("선택한값: " + dataArr[printNumber]);
		} catch (IOException e) {				// 입출력 예외
		} catch (NumberFormatException e) {		// 정수이외값 예외
			System.out.println("정수만 입력해라");
		} catch (ArrayIndexOutOfBoundsException e) {	// 배열인덱스 벗어난값 예외 
			System.out.println("인덱스번호 범위안에서 입력해라");
		} catch (NegativeArraySizeException e) {		// 배열생성 음수값 예외
			System.out.println("배열 사이즈 양수로 입력해라");
		} catch (Exception e) {					// 나머지 모든 예외	
			System.out.println("일단 뭔가 잘못됨");
		} finally {	// 내가 쓴 (한정된)자원을 무조건 돌려줘야 한다면 - 웹 등등
			try {	// try~catch~finally-try~catch - 웹개발시 무조건 사용
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
