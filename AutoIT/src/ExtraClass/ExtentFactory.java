package ExtraClass;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {

	public static ExtentReports Instance(){
		ExtentReports extent;
		String path="//Users//ankurmarkanda//Desktop//citrusPay.html";
		extent=new ExtentReports(path, false);
		extent.addSystemInfo("SeleniumVersion", "3");
		extent.addSystemInfo("Platform", "mac");
		return extent;
	}
}
