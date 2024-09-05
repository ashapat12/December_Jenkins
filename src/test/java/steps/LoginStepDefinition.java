package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.Database;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;  //Initiate object
	Database database;

	
	@Before
	public void berforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class); //define object using pageFactory
		database = new Database();
	}
	
	@Given ("User is on codefios login page")
	public void user_is_on_codefios_login_page() {
		driver.get("https://codefios.com/ebilling/");
	}

	//@When("User enters username as {string}") //string starts with lower case
	@When("^User enters username as \"([^\"]*)\"$") //old way of using data
	public void user_enters_username_as(String username) {
		loginPage.enterUsername(username);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		loginPage.clickSignInButton();
	}

	@Then("User lands on the dashboard page")
	public void user_lands_on_the_dashboard_page() {
		takeScreenShot(driver);
		String expected = "Codefios";
		String acutal = loginPage.getTitle();

		Assert.assertEquals(expected, acutal);
		
	}
	@When("User enters {string} from database")
	public void user_enters_from_database(String loginData) {
	    if(loginData.equalsIgnoreCase("username")) {
	    	loginPage.enterUsername(database.getDataFromDb("user_name"));
	    }else if (loginData.equalsIgnoreCase("password")) {
	    	loginPage.enterPassword(database.getDataFromDb("user_password"));
	    }else {
	    	System.out.println("unable to retrieve login data");
	    }
	    
//	    switch(loginData) {
//	    
//	    case "username":
//	    	loginPage.enterUsername(getDataFromDB);
//	    	break;
//	    case "password":
//	    	loginPage.enterPassword(getDataFromDB);
//	    	break;
//	    default:
//	    	System.out.println("unable to retrieve login data");
//	    }
	}
	
	@After
	public void closeTheBrowser() {
		TestBase.tearDown();
	}
	
}
