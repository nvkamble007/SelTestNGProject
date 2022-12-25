package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver; // This driver dont have scope

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	private By tryForfree = By.xpath("//a[@id='signup_link']");
	private By error = By.xpath("//div[@id='error']");
	private By forgot = By.xpath("//a[@id='forgot_password_link']");

	// creating methods of each of above

	public LoginPageObject(WebDriver driver2) {
		this.driver = driver2;

	}

	public WebElement enterusername() { // WebElement is used for xpath
		return driver.findElement(username);

		// driver.findelement(By.xpath("//input[@id='username']"));

	}

	public WebElement enterpassword() {
		return driver.findElement(password);

	}

	public WebElement clicklogin() {
		return driver.findElement(login);
	}

	public WebElement clicktryforfree() {
		return driver.findElement(tryForfree);
	}

	public WebElement errormessage() {
		return driver.findElement(error);
	}

	public WebElement forgotpass() {
		return driver.findElement(forgot);
	}
}
