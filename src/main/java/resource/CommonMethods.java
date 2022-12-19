package resource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void selectmethod(WebElement dropdown, int index) {

		Select s = new Select(dropdown);
		s.selectByIndex(index);

	}

	public static void Assertions(String actualstring, String expectedstring) {

		SoftAssert assertions = new SoftAssert();

		String actual = actualstring;
		String expected = expectedstring;
		assertions.assertEquals(actual, expected);
		assertions.assertAll();

	}

}
