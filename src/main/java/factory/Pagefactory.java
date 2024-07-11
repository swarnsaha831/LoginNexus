package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory {

	private WebDriver driver;
	
	@FindBy(id = "login_field")
	private WebElement githubUsername;
	
	@FindBy(id = "password")
	private WebElement githubPassword;
	
	@FindBy(name = "commit")
	private WebElement githubLoginButton;
	
	@FindBy(id = "username")
	private WebElement practiceUsername;
	
	@FindBy(id = "password")
	private WebElement practicePassword;
	
	@FindBy(id = "submit")
	private WebElement practiceLoginButton;
	
	@FindBy(id = "email")
	private WebElement macysUsername;
	
	@FindBy(id = "pw-input")
	private WebElement macysPassword;
	
	@FindBy(id = "sign-in")
	private WebElement macysLoginButton;
	
	public Pagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterGithubUsername(String username) {
		githubUsername.sendKeys(username);
	}
	
	public void enterGithubPassword(String password) {
		githubPassword.sendKeys(password);
	}
	
	public void clickGithubLoginButton() {
		githubLoginButton.click();
	}
	
	public void enterPracticeUsername(String username) {
		practiceUsername.sendKeys(username);
	}
	
	public void enterPracticePassword(String password) {
		practicePassword.sendKeys(password);
	}
	
	public void clickPracticeLoginButton() {
		practiceLoginButton.click();
	}
	
	public void enterMacysUsername(String username) {
		macysUsername.sendKeys(username);
	}
	
	public void enterMacysPassword(String password) {
		macysPassword.sendKeys(password);
	}
	
	public void clickMacysLoginButton() {
		macysLoginButton.click();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
}
