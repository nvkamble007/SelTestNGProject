package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import resource.BaseClass;
import resource.CommonMethods;
import resource.constant;

public class LoginTestCase extends BaseClass {

	@Test
	public void method() throws IOException {

		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.enterusername().sendKeys(constant.username);
		lpo.enterpassword().sendKeys(constant.password);
		lpo.clicklogin().click();
		// lpo.errormessage();
		// lpo.forgotpass();

		CommonMethods.Assertions(lpo.errormessage().getText(), constant.error);
		CommonMethods.Assertions(lpo.forgotpass().getText(), constant.fyp);

	}

}
