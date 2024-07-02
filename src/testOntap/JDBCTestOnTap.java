package testOntap;

import java.sql.Connection;

import ontap.JDBCOnTap;

public class JDBCTestOnTap {
	public static void main(String[] args) {
		Connection connection = JDBCOnTap.getConnection();

		System.out.println("connection" + connection);
		JDBCOnTap.printInfo(connection);
		JDBCOnTap.closeConnection(connection);
	}
}
