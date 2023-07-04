package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03_Delete {
	public static void main(String[] args) {

		String sql = "delete product where idx = %s";
		sql = String.format(sql, 6);

		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";

		Connection conn = null;
		Statement stmt = null;
		int row = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			row = stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 불러오는데 실패하였습니다");
		} catch (SQLException e) {
			System.out.println("SQL 예외 발생 : e");
		} finally {
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if(conn != null) conn.close(); } catch (SQLException e) {}
		}
		System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
		System.out.printf("%d 행을 삭제하였습니다", row);
	}
}
