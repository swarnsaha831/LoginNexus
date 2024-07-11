package testNGPractice;

import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDataProvider {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name = "username")
    private WebElement orangeHRMUsername;
	
	@FindBy (name = "password")
	private WebElement orangeHRMPassword;
	
	@FindBy (xpath = "//*[@type='submit']")
	private WebElement orangeHRMLogin;
	
	@Test (dataProvider = "TestData")
	private void loginTest(String username, String password) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(orangeHRMUsername));
		
		orangeHRMUsername.sendKeys(username);
		orangeHRMPassword.sendKeys(password);
		orangeHRMLogin.click();
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	@DataProvider (name = "TestData")
	private Object[][] loginTestData() {
		
		return new Object[][] {
			
			{"Admin", "admin123"},
			{"Admin", "admin1234"},
			{"Admin1", "admin123"},
			{"Admin1", "admin1234"}
			
		};
		
	}
	
}
