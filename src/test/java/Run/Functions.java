package Run;

import org.testng.annotations.Test;

import Pages.facebook.Home;
import codetostart.Usability;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Functions extends Usability {
	public WebDriver driver;
  @Test(priority = 2,dependsOnMethods = "g")
  public void f() {
  
	  //Open the facebook site and verify the login function
	  Home ob=new Home(driver);
	  ob.emailofinput("shahbaz@gmail.com");
	  ob.psswrdoffield("leesburg");
	  ob.Signingin();
	  ob.emailofinput("saleem@gmail.com");
	  ob.psswrdoffield("to");
	  ob.Signingin();  
  }
  @Test(priority = 1 )
  public void g() {
	  System.out.println("g");
  }
}
