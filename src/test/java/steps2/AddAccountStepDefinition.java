package steps2;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListAccountPage;
import pages.LoginPage;
import pages.TestBase;

public class AddAccountStepDefinition extends TestBase {

	LoginPage loginPage;
	ListAccountPage listAccountPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		listAccountPage = PageFactory.initElements(driver, ListAccountPage.class);
	}

	@Given("User is on codefios login page")
	public void user_is_on_codefios_login_page() {
		driver.get("https://codefios.com/ebilling/");
	}

	@When("User enters userName as {string}")
	public void user_enters_userName_as(String string) {
		loginPage.enterUsername(string);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		loginPage.enterPassword(string);
	}

	@When("User clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		loginPage.clickSignInButton();
	}

	@Then("User lands on the dashboard page")
	public void user_lands_on_the_dashboard_page() {
		String actualDashoboardTitle = loginPage.getTitle();
		String expectedDashboardTitle = "Codefios";
		Assert.assertEquals(expectedDashboardTitle, actualDashoboardTitle);
	}

	@Then("User clicks on List Account;")
	public void user_clicks_on_List_Account() {
		listAccountPage.clickOnListAccount();
	}

	@Then("User clicks on Add Account;")
	public void user_clicks_on_Add_Account() {
		listAccountPage.clickOnAddAccount();
	}

	@Then("User enters Account name as {string};")
	public void user_eneters_Account_name_as(String string) {
		listAccountPage.enterAccountName(string);
	}

	@Then("User enters Initial Balance as {string};")
	public void user_enters_Initial_Balance_as(String string) {
		listAccountPage.enterInitialBalance(string);
	}

	@Then("User enters AC number as {string};")
	public void user_enters_AC_number_as(String string) {
		listAccountPage.enterACNumber(string+generateRandomNumber());
		
	}

	@Then("user clikcs on Save button;")
	public void user_clikcs_on_Save_button() {
		listAccountPage.clickSaveButton();
	}

	@Then("user should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		takeScreenShot(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@After
	public void AfterRun() {
		tearDown();
	}

}
