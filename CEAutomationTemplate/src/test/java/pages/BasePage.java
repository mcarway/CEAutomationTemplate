package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public abstract class BasePage {
	
	public static String baseUrl = "someURL";
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	public StringBuffer verificationErrors = new StringBuffer();
	public ExtentReports report;
	public ExtentTest logger;

}
