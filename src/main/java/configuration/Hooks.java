package configuration;

import basePage.BasePage;
import utilities.LoggerUtil;
import utilities.Screenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {

	private static WebDriver driver;
	
	@Before
	public void setUp() {
		
		LoggerUtil.info("Starting new test Scenario.");
		driver = BasePage.getDriver(1);
		if (driver != null) {
			LoggerUtil.info("WebDriver is successfully initialized.");
		} else {
			LoggerUtil.error("WebDriver initialization failed.");
		}
		
	}
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		
		if (scenario.isFailed()) {
			LoggerUtil.error("Scenario failed: " + scenario.getName());
			String screenshotPath = "logs/Screenshot/" + scenario.getName().replaceAll(" ", "") + ".png";
			Screenshot.capture(driver, screenshotPath);
			LoggerUtil.info("Screenshot saved to: " + screenshotPath);
		}
		
		Thread.sleep(5000);
		if (driver != null) {
			driver.quit();
			LoggerUtil.info("WebDriver is closed.");
		}
		
	}
	
	public static WebDriver getDriver() {
        return driver;
    }
	
}
