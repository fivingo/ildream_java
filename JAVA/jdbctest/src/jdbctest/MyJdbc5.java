package jdbctest;

// JDBC 과제 - 전화번호부
import java.util.*;
import java.sql.*;

public class MyJdbc5 {
	public static void main(String[] args) {
		try {
			System.out.println("==전화번호부==");
			System.out.println("1. 전화번호 등록");
			System.out.println("2. 전화번호 검색");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 모두보기");
			System.out.println("5. 종료");
			System.out.println("-------------");

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.0.2:1521:xe";
			String user = "ildream";
			String pwd = "1234";
//			String url = "jdbc:oracle:thin:@192.168.1.4:1521:orcl";
//			String user = "java12";
//			String pwd = "java12";
			Connection conn = DriverManager.getConnection(url, user, pwd);

			Scanner sc = new Scanner(System.in);
			String name = null;
			int age = 0;
			String tel = null;
			String addr = null;
			String sql = null;
			PreparedStatement ps = null;
			ResultSet rs = null;

			while (true) {
				System.out.print("메뉴> ");
				int menuSelect = sc.nextInt();
				sc.nextLine(); // nextInt()가 개행문자 전까지 입력이므로 개행문자 따로받음
				System.out.println();
				switch (menuSelect) {
				case 1:
					System.out.println("1. 전화번호 등록");
					sql = "INSERT INTO teldirectory VALUES (?, ?, ?, ?)";
					ps = conn.prepareStatement(sql);

					System.out.print("이름> ");
					name = sc.nextLine();
					System.out.println(name);
					ps.setString(1, name);
					System.out.print("나이> ");
					age = sc.nextInt();
					sc.nextLine(); // nextInt() 문제
					ps.setInt(2, age);
					System.out.print("전번> ");
					tel = sc.nextLine();
					ps.setString(3, tel);
					System.out.print("주소> ");
					addr = sc.nextLine();
					ps.setString(4, addr);

					ps.executeUpdate();
					ps.close();
					System.out.println();
					break;
				case 2:
					System.out.println("2. 전화번호 검색");
					sql = "SELECT * FROM teldirectory WHERE name=?";
					ps = conn.prepareStatement(sql);

					System.out.print("이름> ");
					name = sc.nextLine();
					ps.setString(1, name);
					rs = ps.executeQuery();

					if (rs.next()) {
						do {
							name = rs.getString("name");
							age = rs.getInt("age");
							tel = rs.getString("tel");
							addr = rs.getString("addr");
							System.out.println(name + "\t" + age + "\t" + tel + "\t" + addr);
						} while (rs.next());
					} else {
						System.out.println("없는 사용자입니다.");
					}
					
					rs.close();
					ps.close();
					System.out.println();
					break;
				case 3:
					System.out.println("3. 전화번호 수정");
					sql = "UPDATE teldirectory SET tel=? WHERE name=?";
					ps = conn.prepareStatement(sql);

					System.out.print("이름> ");
					name = sc.nextLine();
					ps.setString(2, name);
					System.out.print("변경번호> ");
					tel = sc.nextLine();
					ps.setString(1, tel);
					
					int count = ps.executeUpdate();
					System.out.println(count + "건이 수정되었습니다.");
					
					ps.close();
					System.out.println();
					break;
				case 4:
					System.out.println("4. 모두보기");
					sql = "SELECT * FROM teldirectory";
					ps = conn.prepareStatement(sql);
					rs = ps.executeQuery();
					
					while (rs.next()) {
						name = rs.getString("name");
						age = rs.getInt("age");
						tel = rs.getString("tel");
						addr = rs.getString("addr");
						System.out.println(name + "\t" + age + "\t" + tel + "\t" + addr);
					}

					rs.close();
					ps.close();
					System.out.println();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					conn.close();
					System.exit(0);
				default:
					System.out.println("1~5만 입력하세요");
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스 찾을 수 없음");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리 잘못됨");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("잘못 입력함");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("일단 뭔가 잘못됨");
		}
	}
}
