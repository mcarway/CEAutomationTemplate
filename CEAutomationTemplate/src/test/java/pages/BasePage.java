package pages;

import java.util.ArrayList;

import org.openqa.selenium.*;
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
	//Mark's new comments
	
	public static Long estimatedTime;
	
	private static String OrID;
	private static String bundleId;
	private static String sEntryID;
	private static String restrictionId;
	private static String stationID;
	private static String equipment;
	private static String titleDesc;
	private static String budgetClass;
	private static String organization;
	private static String outDate;
	private static String outTime;
	private static String startDate;
	private static String startTime;
	private static String returnDate;
	private static String returnTime;
	private static String inServiceDate;
	private static String inServiceTime;
	private static String recallTime;
	private static String recallUnit;
	private static String emergRestTime;
	private static String emergRestUnit;
	private static String dueDate;
	private static String equipmentId;
	private static String outHours;
	private static String outDays;
	private static String serviceType;
	private static String workDescription;
	private static String interChoice;
	private static String continuousorDaily;
	private static String Approver;
	private static String userName;
	private static String cancelReason;
	private static ArrayList outageDays;
	
	//Restriction validation
	private static String rsEndDate;
	private static String rsEndTime;
	private static String rsStartDate;
	private static String rsStartTime;
	private static String restrictionType;
	private static String selectCategory;
	private static String reasonComment;
	private static String highTentionComment;
	private static String transComment;
	private static String vaultsComment;
	private static String vaultsSubComment;
	private static String transitType;
	
	private static String postponeTime;
	
	private static Integer orCounter;
	
	private static String bLevel;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(this.driver, null);
	}
	
	public void setbLevel(String level) {
		BasePage.bLevel=level;
	}
	
	public String getbLevel() {
		return bLevel;
	}

	
	public void setSchedulingEntryID(String setID) {
		BasePage.sEntryID=setID;
	}
	
	public String getSchedulingEntryID() {
		return sEntryID;
	}
	
	public void setBundleId(String bID) {
		BasePage.bundleId=bID;
	}
	
	public String getBundleId() {
		return bundleId;
	}
	
	public void setrestrictionId(String rID) {
		BasePage.restrictionId=rID;
	}
	
	public String getrestrictionId() {
		return restrictionId;
	}
	
	public void setOrId(String var) {
		BasePage.OrID=var;
	}
	
	public String getOrId() {
		return OrID;
	}
	
}
