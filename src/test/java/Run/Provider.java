package Run;

import org.testng.annotations.Test;

import Pages.facebook.Home;
import codetostart.Usability;

import org.testng.annotations.DataProvider;

public class Provider extends Usability {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  Home ob=new Home(driver);
	  ob.emailofinput(n);
	  ob.psswrdoffield(s);
	  Thread.sleep(6000);
	  ob.Signingin();
	 
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "shahbaz@gmail.com", "leesburg" },
      new Object[] { "saleem@gmail.com", "to" },
      new Object[] { "Automation@hotmail.com", "us" },
    };
  }
}
/* 
* Enter valid username and invalid password
* Enter invalid username andvalid password
* Enter invalid username and invalid password
*/
