package automation.testsuit;

import java.util.Scanner;

public class BTVN_Day7 {

	public static void NhapTenNhanVien(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Nhập số lượng nhân viên
		System.out.println(" Nhập số lượng nhân viên ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] NhanVien = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println(" Nhập tên nhân viên thứ " + (i + 1) + ":");
			NhanVien[i] = sc.nextLine();
		}
		System.out.println("\nDanh sách nhân viên:");
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ". " + NhanVien[i]);
		}

		sc.close();
	}

}
