package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BankAndCash;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement BankAndCashNewAccount;

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement AccountDescription;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement AccountBalance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement ContactPhone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement Url;

	@FindBy(how = How.XPATH, using = "//button[@type ='submit' and @class='btn btn-primary']")
	WebElement Submit;

	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'List Accounts')]")
	WebElement ListCustomers;

	// Methods to interact with the elements
	public void enterUserName(String username) {
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
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickBankAndCash() {
		BankAndCash.click();
		BankAndCashNewAccount.click();
	}

	public void enterAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
	}

	public void enterDescription(String description) {
		AccountDescription.sendKeys(description);
	}

	public void enterAccountBalance(String initialBalance) {
		AccountBalance.sendKeys(initialBalance);
	}

	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
	}

	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
	}

	public void enterContactPhone(String contactPhone) {
		ContactPhone.sendKeys(contactPhone);
	}

	public void enterUrl(String url) {
		Url.sendKeys(url);
	}

	public void clickNewAccountSubmit() {
		Submit.click();
	}

	public void listNewAccountCreated() {
		BankAndCash.click();
		ListCustomers.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

}
