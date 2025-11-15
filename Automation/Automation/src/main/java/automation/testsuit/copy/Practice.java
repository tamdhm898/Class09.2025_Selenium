package automation.testsuit.copy;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Practice {

	@Test
	public void tinhTongMang() {
		// Nhập vào một mảng gồm n phần tử
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập độ dài mảng: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử mảng thứ " + (i + 1) + ": ");
			a[i] = sc.nextInt();
			sum += a[i];
		}

		System.out.println("Tổng của mảng là: " + sum);
		sc.close();
	}
}
