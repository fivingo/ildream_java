package jdbctest;
// JDBC 연동2 - 사용자 입력
import java.sql.*;
import java.util.*;

public class MyJdbc2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("SQL을 입력하세요.");
			System.out.print("> ");
			String sql = sc.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.1.4:1521:orcl";
			String user = "java12";
			String pwd = "java12";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement st = conn.createStatement();

			//String insert = "INSERT INTO student VALUES ('오경덕', 33, '010-4780-2963', '서울')";
			//String update = "UPDATE student SET addr = '부천' WHERE name = '오경덕'";
			//String delete = "DELETE FROM student WHERE name = '오경덕'";
			int count = st.executeUpdate(sql);
			System.out.println(count + "행이 적용되었습니다.");

			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 못찾음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("쿼리문 잘못됨");
			e.printStackTrace();
		}
	}
}
