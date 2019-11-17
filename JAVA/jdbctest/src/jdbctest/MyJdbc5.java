package jdbctest;

// JDBC ���� - ��ȭ��ȣ��
import java.util.*;
import java.sql.*;

public class MyJdbc5 {
	public static void main(String[] args) {
		try {
			System.out.println("==��ȭ��ȣ��==");
			System.out.println("1. ��ȭ��ȣ ���");
			System.out.println("2. ��ȭ��ȣ �˻�");
			System.out.println("3. ��ȭ��ȣ ����");
			System.out.println("4. ��κ���");
			System.out.println("5. ����");
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
				System.out.print("�޴�> ");
				int menuSelect = sc.nextInt();
				sc.nextLine(); // nextInt()�� ���๮�� ������ �Է��̹Ƿ� ���๮�� ���ι���
				System.out.println();
				switch (menuSelect) {
				case 1:
					System.out.println("1. ��ȭ��ȣ ���");
					sql = "INSERT INTO teldirectory VALUES (?, ?, ?, ?)";
					ps = conn.prepareStatement(sql);

					System.out.print("�̸�> ");
					name = sc.nextLine();
					System.out.println(name);
					ps.setString(1, name);
					System.out.print("����> ");
					age = sc.nextInt();
					sc.nextLine(); // nextInt() ����
					ps.setInt(2, age);
					System.out.print("����> ");
					tel = sc.nextLine();
					ps.setString(3, tel);
					System.out.print("�ּ�> ");
					addr = sc.nextLine();
					ps.setString(4, addr);

					ps.executeUpdate();
					ps.close();
					System.out.println();
					break;
				case 2:
					System.out.println("2. ��ȭ��ȣ �˻�");
					sql = "SELECT * FROM teldirectory WHERE name=?";
					ps = conn.prepareStatement(sql);

					System.out.print("�̸�> ");
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
						System.out.println("���� ������Դϴ�.");
					}
					
					rs.close();
					ps.close();
					System.out.println();
					break;
				case 3:
					System.out.println("3. ��ȭ��ȣ ����");
					sql = "UPDATE teldirectory SET tel=? WHERE name=?";
					ps = conn.prepareStatement(sql);

					System.out.print("�̸�> ");
					name = sc.nextLine();
					ps.setString(2, name);
					System.out.print("�����ȣ> ");
					tel = sc.nextLine();
					ps.setString(1, tel);
					
					int count = ps.executeUpdate();
					System.out.println(count + "���� �����Ǿ����ϴ�.");
					
					ps.close();
					System.out.println();
					break;
				case 4:
					System.out.println("4. ��κ���");
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
					System.out.println("���α׷��� �����մϴ�.");
					conn.close();
					System.exit(0);
				default:
					System.out.println("1~5�� �Է��ϼ���");
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ŭ���� ã�� �� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���� �߸���");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("�߸� �Է���");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ϴ� ���� �߸���");
		}
	}
}
