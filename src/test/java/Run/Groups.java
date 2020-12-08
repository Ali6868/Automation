package Run;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Groups {
	
	/*i)Smoke
	 *ii)Regression
	 *iii)Adhoc
	 */
	
	
	
  @Test(groups = {"Smoke"} )
  public void f() {
	  System.out.println("smoke test with f");
  }
  
  @Test(groups = {"Adhoc","Regression"} )
  public void f2() {
	  throw new SkipException("Forcing to Skip");
	  //assert.fail();
	  //System.out.println("adhoc or regressiontest with f2");
  }
  @Test (groups = {"Regression"})
  public void f6() {
	  System.out.println("regression test with f6");
  }
  @Test(groups = {"Smoke","Adhoc"})
  public void f9() {
	  System.out.println("smoke or adhoc test with f9");
  }
  @Test(groups = {"Adhoc"})
  public void f0() {
	  System.out.println("adhoc test with f0");
  }
  @Test(groups = {"Regression"})
  public void f666() {
	  System.out.println("regression test with f666");
  }
}
