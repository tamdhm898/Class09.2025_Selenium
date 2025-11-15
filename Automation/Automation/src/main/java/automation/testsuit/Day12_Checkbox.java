package automation.testsuit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day12_Checkbox extends CommonBase {
	@Test
	public void checkboxHanhle() {
		driver = initFirefoxDriver(CT_PageURL.DEMOQA_URL);
		// Case 1 : kiểm tra giá trị mặc đinh ( theo yêu cầu REQ)? VD :
		// CÁC CHECKBOC CHƯA ĐƯỢC CHECK
		WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement readCheckbox = driver.findElement(By.id("hobbies-checkbox-2"));
		WebElement musicCheckbox = driver.findElement(By.id("hobbies-checkbox-3"));
		// mong đợi cả 3 checkbox đều chưa check theo REQ
		boolean checkSport = sportCheckbox.isSelected();
		boolean checkReading = readCheckbox.isSelected();
		boolean checkMusic = musicCheckbox.isSelected();

		assertFalse(checkMusic);
		assertFalse(checkReading);
		assertFalse(checkMusic);
	}

	@Test
	public void clickToCheckbox() {
		WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement readCheckbox = driver.findElement(By.id("hobbies-checkbox-2"));
		WebElement musicCheckbox = driver.findElement(By.id("hobbies-checkbox-3"));

		if (readCheckbox.isSelected() == false) {
			driver.findElement(By.xpath("//label[text()='Sport']")).click();
			// sportCheckbox.click();
			assertTrue(sportCheckbox.isSelected());
		}
		if (readCheckbox.isSelected() == false) {
			driver.findElement(By.xpath("//label[text()='Reading']")).click();
			// sportCheckbox.click();
			assertTrue(readCheckbox.isSelected());
			if (readCheckbox.isSelected() == false) {
				driver.findElement(By.xpath("//label[text()='Music']")).click();
				assertTrue(musicCheckbox.isSelected());
			}
		}
	}
}