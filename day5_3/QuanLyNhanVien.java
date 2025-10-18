package day5_3;

import java.util.ArrayList;

public class QuanLyNhanVien {
	private ArrayList<NhanVien> danhSachNhanVien;

	public QuanLyNhanVien() {
		danhSachNhanVien = new ArrayList<>();
	}

	// Thêm nhân viên mới
	public void themNhanVien(NhanVien nv) {
		danhSachNhanVien.add(nv);
	}

	// In toàn bộ danh sách nhân viên
	public void inTatCaNhanVien() {
		System.out.println("\n===== DANH SÁCH NHÂN VIÊN TOÀN CÔNG TY =====");
		for (NhanVien nv : danhSachNhanVien) {
			System.out.println(nv);
		}
	}

	// In danh sách nhân viên theo phòng ban
	public void inNhanVienTheoPhongBan(String tenPhongBan) {
		System.out.println("\n== Danh sách nhân viên phòng " + tenPhongBan + " ==");
		for (NhanVien nv : danhSachNhanVien) {
			if (nv.getPhongBan().equalsIgnoreCase(tenPhongBan)) {
				System.out.println(nv);
			}
		}
	}

	// Tìm nhân viên theo tên
	public void timKiemTheoTen(String ten) {
		System.out.println("\n== Kết quả tìm kiếm cho tên: " + ten + " ==");
		boolean found = false;
		for (NhanVien nv : danhSachNhanVien) {
			if (nv.toString().toLowerCase().contains(ten.toLowerCase())) {
				System.out.println(nv);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy nhân viên nào có tên '" + ten + "'");
		}
	}
}
