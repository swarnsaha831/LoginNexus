package utilities;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	public static void capture(WebDriver driver, String filePath) {
		
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.createDirectories(Paths.get(filePath).getParent());
			Files.copy(srcfile.toPath(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
