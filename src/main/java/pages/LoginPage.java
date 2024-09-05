package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement UserName;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SigninButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// methods to interact with elements
	public void enterUsername(String username) {
		UserName.sendKeys(username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SigninButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
