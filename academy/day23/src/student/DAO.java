package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String user = "c##itbank";
	private final String password = "it";

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public DAO() {
		try {
			Class.forName("oracle.jdbc.driver.Oracledriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패 : " + e);
		}
	}

	private Connection getConnection() throws SQLException {
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
		}
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception e) {
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
		}

	}

}
