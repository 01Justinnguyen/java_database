package test;

import java.util.ArrayList;

import dao.SachDAO;
import model.Sach;

public class CRUD_Database {
	public static void main(String[] args) {
//		Sach sach1 = new Sach("SBTC", "Thiếu niên nhi đồng", 1000000, 2024);
//		Sach sach2 = new Sach("BLA", "Trạng quỳnh", 30000, 2021);
//
//		SachDAO.getInstance().insert(sach1);

//		for (int i = 0; i < 10; i++) {
//			Sach sach = new Sach("LT" + i, "Lập trình " + i, Integer.parseInt(String.format("%d000", i)), 2000 + i);
//			SachDAO.getInstance().insert(sach);
//		}

		// Test update data
//		SachDAO.getInstance().update(sach1);

		// Test delete data

//		SachDAO.getInstance().delete(sach1);

//		for (int i = 0; i < 10; i++) {
//			Sach sach = new Sach("LT" + i, "Lập trình " + i, 2000 + i, 2000 + i);
//			SachDAO.getInstance().delete(sach);
//		}

		/*
		 * Table khachhang
		 */
//		long millis = System.currentTimeMillis();
//		Date sqlDate = new Date(millis);
//		System.out.println(sqlDate);
//		KhachHang kh1 = new KhachHang(1, "Phuc", sqlDate, "Viet nam");
//
//		KhachHangDAO.getInstance().insert(kh1);

//		ArrayList<Sach> list = SachDAO.getInstance().selectAll();
//
//		for (Sach sach : list) {
//			System.out.println(sach.toString());
//		}

//		Sach find = new Sach();
//		find.setId("LT8");
//		Sach sachFind = SachDAO.getInstance().selectById(find);
//		System.out.println(sachFind);

		ArrayList<Sach> sachFindConditions = SachDAO.getInstance().selectByCondition("giaBan>7000");
		for (Sach sach : sachFindConditions) {
			System.out.println(sach.toString());
		}
	}
}
