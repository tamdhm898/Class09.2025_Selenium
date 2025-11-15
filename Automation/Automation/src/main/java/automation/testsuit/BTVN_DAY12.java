package automation.testsuit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class BTVN_DAY12 extends CommonBase {

	@Test
	public void selectDropdownlist() {
		driver = initFirefoxDriver(CT_PageURL.GLOBALSQUA_URL);

		// *** KHỐI XỬ LÝ CONSENT/COOKIE ***\
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// ====== CHỜ MÀN HÌNH OVERLAY BIẾN MẤT ======
		try {
			wait.until(ExpectedConditions
					.elementToBeClickable(By.cssSelector(".fc-button.fc-cta-consent.fc-primary-button"))).click();
			System.out.println("Overlay đã biến mất, tiếp tục test...");
		} catch (Exception e) {
			System.out.println("Overlay không xuất hiện hoặc biến mất quá nhanh.");
		}
		// Khối try-catch đảm bảo test không dừng nếu nút CONSENT không xuất hiện.

		// **********************************

		// Bắt đầu thao tác với Dropdown sau khi đã xử lý xong popup
		Select dropSelect = new Select(
				driver.findElement(By.xpath("//div[@class='information closable']/following::select")));
// kiểm tra size
		int size = dropSelect.getOptions().size();
		System.out.println("Size is :" + size);
		// chọn Algeria theo cách 1
		dropSelect.selectByVisibleText("Algeria");
		String Algeria = dropSelect.getFirstSelectedOption().getText();
		System.out.println("Text sau khi chọn Algeria:" + Algeria);
	}
}