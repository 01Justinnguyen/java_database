package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {

	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int ketqua = 0;
		try {
			// Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: Thực thi câu lệnh SQL
			String sql = "INSERT INTO sach (id, tenSach, giaBan, namXuatBan) VALUES ('" + t.getId() + "', '"
					+ t.getTenSach() + "', '" + t.getGiaBan() + "', '" + t.getNamXuatBan() + "')";

			ketqua = st.executeUpdate(sql);

			// Bước 4: Xử lý kết quả
			System.out.println("Số dòng thay đổi " + ketqua);
			if (ketqua > 0) {
				System.out.println("Thêm dữ liệu thành công");
			} else {
				System.out.println("Thêm dữ liệu thất bại");
			}

			// Bước 5: Ngắt kết nối cơ sở dữ liệu
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public int update(Sach t) {
		int ketqua = 0;
		try {
			// Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: Thực thi câu lệnh SQL
			String sql = "UPDATE sach" + " SET " + "tenSach='" + t.getTenSach() + "', giaBan='" + t.getGiaBan()
					+ "', namXuatBan='" + t.getNamXuatBan() + "'" + " WHERE id='" + t.getId() + "'";
			System.out.println(sql);
			ketqua = st.executeUpdate(sql);

			// Bước 4: Xử lý kết quả
			System.out.println("Số dòng thay đổi " + ketqua);
			if (ketqua > 0) {
				System.out.println("Cập nhật dữ liệu thành công");
			} else {
				System.out.println("Cập nhật dữ liệu thất bại");
			}

			// Bước 5: Ngắt kết nối cơ sở dữ liệu
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public int delete(Sach t) {
		int ketqua = 0;
		try {
			// Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: Thực thi câu lệnh SQL
			String sql = "DELETE from sach WHERE id='" + t.getId() + "'";
			System.out.println(sql);
			ketqua = st.executeUpdate(sql);

			// Bước 4: Xử lý kết quả
			System.out.println("Số dòng thay đổi " + ketqua);
			if (ketqua > 0) {
				System.out.println("Xoá dữ liệu thành công");
			} else {
				System.out.println("Xoá dữ liệu thất bại");
			}

			// Bước 5: Ngắt kết nối cơ sở dữ liệu
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
