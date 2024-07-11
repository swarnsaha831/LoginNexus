package basePage;

import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public static int websiteChoice;
	public static Scanner scanner = new Scanner(System.in);
	
	public static WebDriver getDriver(int browser) {
		
		WebDriver driver = null;
		
		System.out.println("\nHello, welcome to your login nexus! Which site would you like to sign in to?\n"
				 + "Your choices are to enter 1 for Github, 2 for PracticeTestAutomation, or 3 for Macy's:\n");
		do {
			websiteChoice = scanner.nextInt();
			if (websiteChoice != 1 && websiteChoice != 2 && websiteChoice != 3) {
			System.out.println("Error: Please enter either 1 (Github), 2 (PracticeTestAutomation), or 3 (Macy's) depending on your browser:\n");
			}
		} while (websiteChoice != 1 && websiteChoice != 2 && websiteChoice != 3);
		System.out.println();
		
		switch (browser) {
			case 1:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case 2:
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				break;
			case 3:
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			default:
				throw new IllegalArgumentException("Error: The only choices are '1 for chrome', '2 for edge', or '3 for firefox'.");
		}
		
		switch (websiteChoice) {
		case 1:
			driver.get("https://github.com/login");
			break;
		case 2:
			driver.get("https://practicetestautomation.com/practice-test-login/");
			break;
		case 3:
			driver.get("https://www.macys.com/account/signin");
			break;		
		}
		
		return driver;
		
	}
	
}
