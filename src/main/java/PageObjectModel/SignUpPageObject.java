package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

	public WebDriver driver; // this driver is null

	By firstname = By.xpath("//input[@name='UserFirstName']");
	By lastname = By.xpath("//input[@name='UserLastName']");
	By jobtitle = By.xpath("//input[@name='UserTitle']");
	By email = By.xpath("//input[@name='UserEmail']");
	By phone = By.xpath("//input[@name='UserPhone']");
	By employees = By.xpath("//Select[@name='CompanyEmployees']");
	By company = By.xpath("//input[@name='CompanyName']");
	By country = By.xpath("//Select[@name='CompanyCountry']");
	By agreement = By.xpath("(//div[@class='checkbox-ui'])[1]");
	By starttrial = By.xpath("//button[@name='start my free trial']");

	public SignUpPageObject(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}

	public WebElement enterlastname() {
		return driver.findElement(lastname);
	}

	public WebElement enterjobtitle() {
		return driver.findElement(jobtitle);
	}

	public WebElement enteremail() {
		return driver.findElement(email);
	}

	public WebElement enterphone() {
		return driver.findElement(phone);
	}

	public WebElement enteremployees() {
		return driver.findElement(employees);
	}

	public WebElement entercompany() {
		return driver.findElement(company);
	}

	public WebElement entercountry() {
		return driver.findElement(country);
	}

	public WebElement clickagreement() {
		return driver.findElement(agreement);
	}

	public WebElement clickstarttrial() {
		return driver.findElement(starttrial);
	}

}