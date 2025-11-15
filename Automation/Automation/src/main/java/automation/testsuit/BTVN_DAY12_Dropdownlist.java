package automation.testsuit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class BTVN_DAY12_Dropdownlist extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initFirefoxDriver(CT_PageURL.AUTOMATIONFC_URL);
	}

	@Test
	public void dropboxHandle() {
		WebElement under18 = driver.findElement(By.id("under_18"));
		WebElement over18 = driver.findElement(By.id("over_18"));
		WebElement radioDisabled = driver.findElement(By.id("radio-disabled"));

		assertFalse(under18.isSelected());
		assertFalse(over18.isSelected());
		assertFalse(radioDisabled.isSelected());
	}

	@Test
	public void clickToCheckbox() {
		WebElement under18 = driver.findElement(By.id("under_18"));
		WebElement over18 = driver.findElement(By.id("over_18"));
		WebElement radioDisabled = driver.findElement(By.id("radio-disabled"));

		// Click Under 18
		if (!under18.isSelected()) {
			under18.click();
			assertTrue(under18.isSelected());
		}

		// Radio disabled
		assertFalse(radioDisabled.isEnabled());
	}

	@Test
	public void selectDropdownlist() {
		driver = initFirefoxDriver(CT_PageURL.AUTOMATIONFC_URL);
		Select dropCourse = new Select(driver.findElement(By.id("job1")));

		// Kiểm tra size
		int size = dropCourse.getOptions().size();
		System.out.println("Size is: " + size);

		// Chọn MANUAL theo cách 1
		dropCourse.selectByValue("manual");
		String manual = dropCourse.getFirstSelectedOption().getText();
		System.out.println("Text sau khi chọn manual: " + manual);
	}
}
