package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import resource.BaseClass;
import resource.CommonMethods;
import resource.constant;

public class SignUpTestCases extends BaseClass {

	@Test
	public void method() throws IOException, InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.clicktryforfree().click();

		SignUpPageObject spo = new SignUpPageObject(driver); // pass driver to get constructor in signupobject.java
																// class

		Thread.sleep(4000);
		spo.enterfirstname().sendKeys(constant.firstname);
		spo.enterlastname().sendKeys(constant.lastname);
		spo.enterjobtitle().sendKeys(constant.jobtitle);
		
		/*spo.enteremail().sendKeys(constant.email);
		spo.enterphone().sendKeys(constant.phone);

		CommonMethods.selectmethod(spo.enteremployees(), 1);
		CommonMethods.selectmethod(spo.entercountry(), 98);

		spo.entercompany().sendKeys(constant.company);

		spo.clickagreement().click();
		spo.clickstarttrial().click();*/

		/*
		 * WebElement cou = spo.entercountry(); Select s1 = new Select(cou); this is to
		 * find out india by value s1.selectByValue(constant.value);
		 */

	}

}
