package utilities;

import org.testng.Assert;
import java.time.Duration;
import factory.Pagefactory;
import credentials.UserInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebDriverUtil {
	
	private UserInfo info;
	private WebDriver driver;
	private WebDriverWait wait;
	private Pagefactory pagefactory;
	
	public WebDriverUtil(WebDriver driver) {
		this.pagefactory = new Pagefactory(driver); 
		this.info = new UserInfo();
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		PageFactory.initElements(driver, this); 
	}
	
	private void highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		js.executeScript("arguments[0].setAttribute('style', '');", element);
	}
	
	public void navigateTo(String URL) {
		driver.get(URL);
	}
	
	public void waitForElementVisible(WebElement element) {
		highlight(element);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void enterText(WebElement element, String text) {
		highlight(element);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(text);
	}
	
	public void clickElement(WebElement element) {
		highlight(element);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	
	public void enterInfo() {
		if (driver.getCurrentUrl().equals("https://github.com/login")) {
			pagefactory.enterGithubUsername(info.githubUsername());
			pagefactory.enterGithubPassword(info.githubPassword());
		} else if (driver.getCurrentUrl().equals("https://practicetestautomation.com/practice-test-login/")) {
			pagefactory.enterPracticeUsername(info.practiceUsername());
			pagefactory.enterPracticePassword(info.practicePassword());
		} else if (driver.getCurrentUrl().equals("https://www.macys.com/account/signin")) {
			pagefactory.enterMacysUsername(info.macysUsername());
			pagefactory.enterMacysPassword(info.macysPassword());
		}
	}
	
	public void login() {
		if (driver.getCurrentUrl().equals("https://github.com/login")) {
			pagefactory.clickGithubLoginButton();
		} else if (driver.getCurrentUrl().equals("https://practicetestautomation.com/practice-test-login/")) {
			pagefactory.clickPracticeLoginButton();
		} else if (driver.getCurrentUrl().equals("https://www.macys.com/account/signin")) {
			pagefactory.clickMacysLoginButton();
		}
	}
	
	public void checkTest() {
        pagefactory.getCurrentURL();
        Assert.assertTrue(
        	pagefactory.getCurrentURL().equals("https://github.com/") ||
        	pagefactory.getCurrentURL().equals("https://www.macys.com/account/signin") ||
        	pagefactory.getCurrentURL().equals("https://practicetestautomation.com/logged-in-successfully/"),
            "Error: The URL does not match any of the expected URLs."
        );
        System.out.println("Test passed.");
    }
	
}
