package automation.testsuit;

import java.util.Scanner;

public class BTVN_DAY7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số lượng nhân viên: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] nhanVien = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập tên nhân viên thứ " + (i + 1) + ": ");
			nhanVien[i] = sc.nextLine();
		}

		System.out.println("\nDanh sách nhân viên:");
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ". " + nhanVien[i]);
		}

		sc.close();
	}
}
