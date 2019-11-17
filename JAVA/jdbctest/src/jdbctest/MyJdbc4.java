package jdbctest;
// JDBC 연동4 - INSERT
import java.sql.*;
import java.util.*;

public class MyJdbc4 {
	public static void main(String[] args) {
		try {
			System.out.println("학생이름을 입력해주세요");
			System.out.print("이름> ");
			Scanner sc = new Scanner(System.in);
			String userInput = sc.nextLine();

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.1.4:1521:orcl";
			String user = "java12";
			String pwd = "java12";
			Connection conn = DriverManager.getConnection(url, user, pwd);

			String sql = "SELECT * FROM student WHERE name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userInput);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				do {
					String name = rs.getString("name");
					int age = rs.getInt("age");
					String tel = rs.getString("tel");
					String addr = rs.getString("addr");
					System.out.println(name + "\t" + age + "\t" + tel + "\t" + addr);
				} while (rs.next());
			} else {
				System.out.println("없는 사용자");
				System.out.print("새로입력함? (y/n)> ");
				String temp = sc.nextLine();
				if (temp.equals("y")) {
					sql = "INSERT INTO student (name, age, tel, addr) VALUES (?, ?, ?, ?)";
					ps = conn.prepareStatement(sql);
					
					System.out.print("이름> ");
					String name = sc.nextLine();
					ps.setString(1, name);
					System.out.print("나이> ");
					int age = sc.nextInt();
					ps.setInt(2, age);
					System.out.print("번호> ");
					String tel = sc.nextLine();
					ps.setString(3, tel);
					System.out.print("주소> ");
					String addr = sc.nextLine();
					ps.setString(4, addr);
					ps.executeUpdate();
				} else if (temp.equals("n")) {
					System.out.println("프로그램 종료");
				} else {
					System.out.println("제대로 입력");
				}
			}

			rs.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
