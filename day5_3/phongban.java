package day5_3;

import java.util.ArrayList;

public class phongban {
	private String tenPhongBan;
	private ArrayList<NhanVien> danhSachNhanVien;

	public phongban(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
		this.danhSachNhanVien = new ArrayList<>();
	}

	public void themNhanVien(NhanVien nv) {
		danhSachNhanVien.add(nv);
	}

	public void inDanhSachNhanVien() {
		System.out.println("Danh sách nhân viên phòng ban: " + tenPhongBan);
		for (NhanVien nv : danhSachNhanVien) {
			System.out.println(nv);
		}
		System.out.println();
	}
}
