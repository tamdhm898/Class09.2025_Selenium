package automation.testsuit.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day8_Locator extends CommonBase {
	@Test
	public void getElementById() {
		driver = initFirefoxDriver(CT_PageURL.RISE_URL);
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Email element is : " + email);
		WebElement password = driver.findElement(By.name("password"));
		System.out.println("Email element is : " + password);
	}

	@Test
	public void getElementByClass_TagName() {
		driver = initFirefoxDriver(CT_PageURL.BEPANTOAN_URL);
		WebElement h1 = driver.findElement(By.className("inline-block"));
		System.out.println("h1 is:" + h1);
		WebElement h3 = driver.findElement(By.tagName("h3"));
		System.out.println("h3 is:" + h3);
	}
}
