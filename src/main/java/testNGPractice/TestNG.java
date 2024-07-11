package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeSuite
	public void setup() {
		System.out.println("Setup System property for ChromeDrive");
	}

	@BeforeTest
	public void LunchBrowser() {
		System.out.println("Launch Chrome Browser");
	}

	@BeforeClass
	public void EnterURL() {
		System.out.println("Enter the ur");
	}

	@BeforeMethod
	public void LogIn() {
		System.out.println("LogIn");
	}

	// Test Cases @Test
	@Test
	public void TestExecution1() {
		System.out.println("TestExecution1");
	}

	@Test
	public void TestExecution2() {
		System.out.println("TestExecution2");
	}

	@Test
	public void TestExecution3() {
		System.out.println("TestExecution3");
	}

	// Post conditions @@AfterMethod, @AfterTest, @AfterClass, @AfterSuite
	@AfterMethod
	public void LogOut() {
		System.out.println("LogOut");
	}

	@AfterClass
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}

	@AfterTest
	public void DeleteAllCookies() {
		System.out.println("Delete All the Cookies");
	}

	@AfterSuite
	public void GenerateTestReport() {
		System.out.println("Generate Test Report");
	}

}
