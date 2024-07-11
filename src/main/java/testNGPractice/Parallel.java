package testNGPractice;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parallel {
	
	WebDriver driver;
	
	@Test
	public void parallelTesting1() throws InterruptedException {
		//WebDriver driver;
		System.out.println("Parallel test 1. " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.github.com/");
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void parallelTesting2() throws InterruptedException {
		//WebDriver driver;
		System.out.println("Parallel test 2. " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.quit();
	}
}
