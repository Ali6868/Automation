package Run;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import codetostart.Usability;

public class Ilisteners extends Usability implements ITestListener {
	static Date dt=new Date();
	
	static String fileName="Extent_"+dt.toString().replace(" ", "_").replace(":", "_")+".html";
	static ExtentReports extent=ExtentManager.createInstance(System.getProperty("user.dir"))+"/reports/"+ fileName);
	public static ThreadLocal<ExtentTest> testReport=new ThreadLocal<ExtentTest>();
	
	public void onTestSuccess(ITestResult result) {

		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		System.out.println("Automation is passed");
		this.driver = ((Usability)result.getInstance()).driver;
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(si);
		File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileHandler.copy(shots,new File("/Users/Ali/Documents/"+si+".png"));
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}

public void onTestFailure(ITestResult result) {

		// TODO Auto-generated method stub

		//ITestListener.super.onTestFailure(result);
		this.driver = ((Usability)result.getInstance()).driver;
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(si);
		File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileHandler.copy(shots,new File("/Users/Ali/Documents/"+si+".png"));
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		 String failurelogg="Test case failed";
		 Markup m=MarkupHelper.createLabel(failurelogg, ExtentColor.RED);
		 testReport.get().log(Status.FAIL, m);
	}



	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
		System.out.println("Automation is started");
	}

}
