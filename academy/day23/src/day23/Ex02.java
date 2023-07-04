package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";

		Scanner sc = new Scanner(System.in);
		String search;
		System.out.print("상품 이름을 정확히 입력 : ");
		search = sc.nextLine();
		
		String sql = "select * from product where name = '" + search + "'";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
//		SQL Injection : ' or 1=1 -- 을 입력하면, 전체 목록이 출력된다
//		보안의 허점을 이용한 방법
		
		System.out.println("sql : " + sql);
		while(rs.next()) {
			System.out.println("상품이름 : " + rs.getString("name"));
			System.out.println("상품가격 : " + rs.getInt("price"));
		}
		rs.close();
		stmt.close();
		conn.close();
		sc.close();
	}
}
