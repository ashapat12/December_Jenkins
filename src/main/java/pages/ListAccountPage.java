package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListAccountPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//span[text()='List Accounts']")
	WebElement ListAccount;
	@FindBy(how = How.XPATH, using = "//button[text()='Add Account']")
	WebElement AddAccount;
	@FindBy(how = How.XPATH, using = "//input[@id='account_name']")
	WebElement AccountName;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACNumber;
	@FindBy(how = How.XPATH, using = "//button[@id='accountSave']")
	WebElement SaveButton;

	public ListAccountPage() {
		this.driver = driver;
	}

	public void clickOnListAccount() {
		ListAccount.click();

	}

	public void clickOnAddAccount() {
		AddAccount.click();
	}

	public void enterAccountName(String accountName) {
		AccountName.sendKeys(accountName);
	}

	public void enterInitialBalance(String accountBalance) {
		InitialBalance.sendKeys(accountBalance);
	}

	public void enterACNumber(String accountNumber) {
		ACNumber.sendKeys(accountNumber);
	}

	public void clickSaveButton() {
		SaveButton.click();
	}
}
