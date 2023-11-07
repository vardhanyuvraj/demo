package Demo.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	long startTime;
	WebDriver driver;

	@BeforeTest
	public void getStartTime() {
		startTime = System.currentTimeMillis();
	}

	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YUVRAJ\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}

	@AfterTest
	public void getExecutionTime() {
		driver.quit();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Execution Time = " + executionTime / 1000.0 + " sexonds.");
	}

}
