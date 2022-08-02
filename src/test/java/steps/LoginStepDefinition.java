package steps;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

//1. we are extending so we dont have to call the driver every time
public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	String accountTitle1;

	@Before
	public void methodName() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page() {
		// initDriver();
		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
	}

	@Then("^User clicks on \"([^\"]*)\" and \"([^\"]*)\">$")
	public void user_clicks_on_and(String arg1, String arg2) {
		loginPage.clickBankAndCash();

	}

	@Then("^User should land of New Account Page$")
	public void user_should_land_of_New_Account_Page() {
		Assert.assertEquals("Accounts- iBilling", loginPage.getPageTitle());
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and_and_and_and_and(String accountTitle, String description, String initialBalance,
			String accountNumber, String contactPerson, String contactPhone, String url) {

		// Generating random number
		// accountTitle will create a new account
		// accountTitle and accountTitle1 are same
		// making accountTitle1 global to access it my validation method.
		int max = 999999999;
		int min = 10000000;
		
		Random random = new Random();
		int newRandom = random.nextInt(((max-min)+1)+ min);
		
		String emptyString = "";
		accountTitle = newRandom + emptyString;
		accountTitle1 = newRandom + emptyString;
		System.out.println("Account Title: " + accountTitle + " will be created!");
		// System.out.println("this is generating a random number: " + accountTitle);
		// System.out.println("this is generating a random number: " + accountTitle1);

		loginPage.enterAccountTitle(accountTitle);
		loginPage.enterDescription(description);
		loginPage.enterAccountBalance(initialBalance);
		loginPage.enterAccountNumber(accountNumber);
		loginPage.enterContactPerson(contactPerson);
		loginPage.enterContactPhone(contactPhone);
		loginPage.enterUrl(url);
	}

	@When("^User clicks on the Submit button$")
	public void user_clicks_on_the_Submit_button() {
		loginPage.clickSignInButton();

	}

	@Then("^User clicks on the new account submit button$")
	public void user_clicks_on_the_new_account_submit_button() {
		loginPage.clickNewAccountSubmit();
	}

	@Then("^user should land on account created page$")
	public void user_should_land_on_account_created_page() {
		Assert.assertEquals("Accounts- iBilling", loginPage.getPageTitle());
	}

	@Then("^validate the account created$")
	public void validate_the_account_created() throws InterruptedException {
		//System.out.println("this is in validate method: " + accountTitle1);

		loginPage.listNewAccountCreated();

		Thread.sleep(3000);
		int rowCount = driver.findElements(By.xpath("//table/tbody/tr")).size();
		int colCount = driver.findElements(By.xpath("//table/tbody/tr/th")).size();
		// System.out.println("Number of rows : " + rowCount);
		// System.out.println("Number of columns : " + colCount);

		// I have to change this to start searching from bottom to top!
		// It takes a lot of time:(
		for (int i = 1; i < rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				String actValue = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[" + (j) + "]"))
						.getText();
				// System.out.println(actValue);
				if (actValue.equals(accountTitle1)) {
					System.out.println("Validating the Account Title : " + accountTitle1 + " account has been created! ");
					// System.out.println("i:" + i);
					// System.out.println("J:" + j);
					break;

				}
			}
		}

	}

	@After
	public void tearDown() {
		// close is closing 1 windows and quit will close all the windows
		driver.close();
		driver.quit();
	}

}
