package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	public void BrowserInitialisation() throws IOException {

		// for reading of Properties file
		FileInputStream file = new FileInputStream(
				"C:\\Users\\SHREE\\eclipse-workspace\\Selenium19thSepTestNGProject\\src\\main\\java\\resource\\data.properties");

		// to access the properties file
		Properties prop = new Properties();
		prop.load(file);
		// prop.getProperty("browser");
		String browsername = prop.getProperty("browser"); // save in string

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			// driver.get("https://www.flipkart.com/");
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			// driver.get("https://www.amazon.in/");

		} else {
			System.out.println("please enter valid browser name");
		}

	}

	@BeforeMethod
	public void launch() throws IOException {
		BrowserInitialisation();
		driver.get("https://login.salesforce.com/");

	}

}
