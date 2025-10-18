package day5_3;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLyNhanVien ql = new QuanLyNhanVien();

		System.out.print("Nhập số lượng nhân viên: ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			System.out.println("\nNhập thông tin nhân viên thứ " + (i + 1));
			System.out.print("Tên: ");
			String ten = sc.nextLine();

			System.out.print("Tuổi: ");
			int tuoi = Integer.parseInt(sc.nextLine());

			System.out.print("Phòng ban (Developer/Tester/BA): ");
			String phongBan = sc.nextLine();

			System.out.print("Lương: ");
			double luong = Double.parseDouble(sc.nextLine());

			NhanVien nv = new NhanVien(ten, tuoi, phongBan, luong);
			ql.themNhanVien(nv);
		}

		// In toàn bộ danh sách
		ql.inTatCaNhanVien();

		// In theo phòng ban
		ql.inNhanVienTheoPhongBan("Developer");
		ql.inNhanVienTheoPhongBan("Tester");
		ql.inNhanVienTheoPhongBan("BA");

		// Tìm kiếm theo tên
		System.out.print("\nNhập tên nhân viên cần tìm: ");
		String tenTim = sc.nextLine();
		ql.timKiemTheoTen(tenTim);

		sc.close();
	}
}
