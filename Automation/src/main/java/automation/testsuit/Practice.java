
package automation.testsuit;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Practice {

	@Test
	public void timSoNhoNhatMang() {
		// Nhập vào một mảng gồm n phần tử
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập độ dài mảng: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử mảng thứ " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}

		// Tìm phần tử nhỏ nhất
		int min = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Số nhỏ nhất trong mảng là: " + min);
		sc.close();
	}
}
