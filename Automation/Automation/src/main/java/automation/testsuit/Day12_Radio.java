package automation.testsuit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day12_Radio extends CommonBase {
	@Test
	public void clicktoRadior() {
		driver = initFirefoxDriver(CT_PageURL.DEMOQA_URL);
		// kiểm tra
		WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
		WebElement femaleRadio = driver.findElement(By.id("gender-radio-2"));
		WebElement otherRadio = driver.findElement(By.id("gender-radio-3"));
		boolean male = maleRadio.isSelected();
//mong đợi xác nhận bằng male chưa được bấm = false 
		assertFalse(male);
// mong mong đợi xác nhận bằng fmale chưa được bấm = false 
		assertFalse(femaleRadio.isSelected());
// mong đợi xác nhận bằng other chưa được bấm = false 
		assertFalse(otherRadio.isSelected());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", femaleRadio);
//Click Female
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		// femaleRadio.click();
		assertTrue(femaleRadio.isSelected());

	}

}
