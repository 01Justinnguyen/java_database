package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class UserDAO implements DAOInterface<User> {

	public static UserDAO getInstance() {
		return new UserDAO();
	}

	@Override
	public int insert(User t) {
		int ketQua = 0;

		try {
			// Bước 1: kết nối đến CSDL
			Connection conn = JDBCUtil.getConnection();

			// Bước 2: Tạo câu truy vấn đến CSDL
			String sql = "INSERT INTO User (userName, password, fullName) VALUES (?, ?, ?)";
			System.out.println(sql);
			// Bước 3: Tạo statement
			PreparedStatement prm = conn.prepareStatement(sql);
			prm.setString(1, t.getUserName());
			prm.setString(2, t.getPassword());
			prm.setString(3, t.getFullName());

			// Bước 4: Xử lý kết quả

			ketQua = prm.executeUpdate();
			System.out.println("Số dòng thay đổi " + ketQua);
			if (ketQua > 0) {
				System.out.println("Thêm dữ liệu thành công");
			} else {
				System.out.println("Thêm dữ liệu thất bại");
			}

			// Bước 5: Ngắt kết nối cơ sở dữ liệu
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<User> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectById(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
