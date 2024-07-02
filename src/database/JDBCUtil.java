package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;

		try {
			// Đăng ký Mysql Driver với DriverManager
//			DriverManager.registerDriver(new Driver());
			String url = "jdbc:mySQL://localhost:3306/ontap";
			String username = "root";
			String password = "";

			// Tạo kết nối
			c = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printInfo(Connection c) {
		try {
			if (c != null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println("Database name: " + mtdt.getDatabaseProductName());
				System.out.println("Database version: " + mtdt.getDatabaseProductVersion());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
