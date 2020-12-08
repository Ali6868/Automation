package Run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.facebook.Home;
import codetostart.Usability;

public class Shots extends Usability {
  @Test
  public void f() throws IOException {
	  Home ob =new Home(driver);
	  Properties pro=new Properties();
	  FileInputStream ds=new FileInputStream("/Users/Ali/eclipse-workspace/Trainingsession/config.properties");
	  pro.load(ds);
	  String name=pro.getProperty("name");
	  String psw=pro.getProperty("password");
	  ob.emailofinput(name);
	  ob.psswrdoffield(psw);
	  ob.Signingin();
  }
  @Test
  public void f6() {
	  Home ob=new Home(driver);
	  ob.emailofinput("shahbaz@gmail.com");
	  ob.psswrdoffield("leesburg");
	  ob.Signingin();
  }
  @Test
  public void f6000() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.findElement(By.id("gj")).click();
  }
  @Test
  public void f60000() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.findElement(By.id("gj")).click();
  }
}
