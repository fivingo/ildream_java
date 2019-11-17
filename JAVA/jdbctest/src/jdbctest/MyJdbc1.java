package jdbctest;
// JDBC 연동1 - INSERT 활용
// 1. import
import java.sql.*;

public class MyJdbc1 {
	public static void main(String[] args) {
		try {
			// 2. 드라이버를 메모리에 로딩
			System.out.println("DB연동 시작");
			Class.forName("oracle.jdbc.driver.OracleDriver");	// 지정 클래스 로드 (객체 생성)
			System.out.println("드라이버 로딩 성공");
			
			// 3. DB와 연결
			String url = "jdbc:oracle:thin:@192.168.1.4:1521:orcl";	// 오라클 전용주소
			String user = "java12";
			String pwd = "java12";
			Connection conn = DriverManager.getConnection(url, user, pwd);	// DB 연결
			System.out.println("DB연동 성공");
			
			// busyness logic
			// Statement 객체 - 정적 쿼리 전달 역할 (객체 하나로 모든 쿼리 사용)
//			Statement st = conn.createStatement();	// 객체 생성 - 매개변수x
//			String sql = "INSERT INTO student VALUES('둘리', 30, '032-2222-2222', '부천')";
//			int count = st.executeUpdate(sql);		// 쿼리 실행 후 횟수 반환 - 작성 쿼리 매개변수
//			System.out.println(count + "행이 수행됨");
			
			// PreparedStatement 객체 - 동적 쿼리 전달 역할 (쿼리마다 미리 객체 생성 후 인자값 입력)
			String sql = "INSERT INTO student VALUES(?, ?, ?, ?)";	// ?는 입력될 실제값
			PreparedStatement ps = conn.prepareStatement(sql);		// 작성된 쿼리 매개변수 객체 생성
			ps.setString(1, "마이콜");			// setXXX 메서드로 값 저장
			ps.setInt(2, 50);				// (파라미터 순서 (1~), 실제데이터)
			ps.setString(3, "02-1233-3333");// 모든 인자값 입력해야함
			ps.setString(4, "서울");
			int count = ps.executeUpdate();	// 쿼리 실행 후 횟수 반환 - 쿼리 매개변수 x
			System.out.println(count + "행이 수행됨");
			
			// 4. 자원 반환 - 역순으로
//			st.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 경로 잘못됨");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속정보 오류");
			e.printStackTrace();
		}
	}
}
