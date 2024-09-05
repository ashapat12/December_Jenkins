package pages;

import java.io.File;
import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://codefios.com/ebilling/");

	}

	public void takeScreenShot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File soureFile = ts.getScreenshotAs(OutputType.FILE);  //This will create source/temporary file

		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		
		//System.currentTimeMillis() insted of label can save file using System.current

		try {
			FileUtils.copyFile(soureFile,
					new File(System.getProperty("user.dir") + "/Screenshot/" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int generateRandomNumber() {
		Random random = new Random();
		int generatedNumber = random.nextInt(999);
		return generatedNumber;
	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}
}
