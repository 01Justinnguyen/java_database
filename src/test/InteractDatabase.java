package test;

import java.sql.Connection;
import java.sql.Statement;

import database.JDBCUtil;

public class InteractDatabase {
	public static void main(String[] args) {
		try {
			// Bước 1: Kết nối cơ sở dữ liệu
			Connection connection = JDBCUtil.getConnection();

			// Bước 2: Tạo đối tượng statement
			Statement stm = connection.createStatement();

			// Bước 3: Thực thi 1 câu lệnh sql
			String sql = "INSERT INTO persons (last_name, first_name, gender, dob, income) VALUES (\"NGUYEN\", \"VAN B\", \"M\", \"1996-05-10\", 150000)";

			int check = stm.executeUpdate(sql);

			// Bước 4: Xử lý kết quả
			System.out.println("Số dòng thay đổi " + check);
			if (check > 0) {
				System.out.println("Thêm dữ liệu thành công");
			} else {
				System.out.println("Thêm dữ liệu thất bại");
			}

			// Bước 5: Ngắt kết nối cơ sở dữ liệu
			JDBCUtil.closeConnection(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
