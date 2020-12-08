package Run;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.facebook.Forgot_Password;
import Pages.facebook.Home;
import codetostart.Usability;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewFunctionAccount extends Usability {
	//Third Executed Annotation
	
  //@Test
  public void D() {
	  //Open the facebook site and verify the login function
	  Home ob=new Home(driver);
	  ob.emailofinput("shahbaz@gmail.com");
	  ob.psswrdoffield("leesburg");
	  ob.Signingin();
	  ob.emailofinput("saleem@gmail.com");
	  ob.psswrdoffield("to");
	  ob.Signingin();
	  
  }
  @Test
  public void Forgotlinkforpassword() {
	  //Goto facebook and verify forgot password link
	  Home it=new Home(driver);
	  it.Forgotlink();
	  Forgot_Password ds=new Forgot_Password(driver);
	  SoftAssert gt=new SoftAssert();
	 String Forgoturtext= ds.ForgotYourAccountText().getText();
	 System.out.println(Forgoturtext);
	 gt.assertEquals(Forgoturtext, "Find Your Accountit");
	 //Assert.assertEquals(Forgoturtext, "Find Your Accountit");
	 ds.searchfieldemail("shahbaz@gmail.com");
	  ds.buttonlk();
	  gt.assertAll();
  }
  
  


  
}
