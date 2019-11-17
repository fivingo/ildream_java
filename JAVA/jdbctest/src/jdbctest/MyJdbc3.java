package jdbctest;
//JDBC 연동3 - SELECT 활용
import java.sql.*;

public class MyJdbc3 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.1.4:1521:orcl";
			String user = "java12";
			String pwd = "java12";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			// Statement
//			Statement st = conn.createStatement();	// 객체 생성 후 쿼리 입력
//			String sql = "SELECT * FROM student";
//			ResultSet rs = st.executeQuery(sql);	// 열거형 클래스 (while 사용)
//			while (rs.next()) {	// 다음 데이터 유무 확인
//				String name = rs.getString("name");	// getXXX 메서드로 값 확인
//				int age = rs.getInt("age");			// 인자값: column_name
//				String tel = rs.getString(3);		// column_index 입력 가능 (비추)
//				String addr = rs.getString(4);
//				System.out.println(name + "\t" + age + "\t" + tel + "\t" + addr);
//			}
			
			// PreparedStatement
			String sql = "SELECT * FROM student";	// 쿼리 입력 후 객체 생성
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				System.out.println(name + "\t" + age + "\t" + tel + "\t" + addr);
			}
			
			// 모든 자원 반환
			rs.close();
//			st.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
