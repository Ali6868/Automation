package codetostart;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Usability {
	public WebDriver driver;
	@Parameters({"browser","URI"})
 
  @BeforeClass
  public void beforeClass(String browser,String site) {
	  if(browser.equalsIgnoreCase("Chrome")) {
			String director =System.getProperty("user.dir");
			System.out.println(director);
				System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
				driver=new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
				
			} else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/Ali/Desktop/geckodriver");
				driver=new FirefoxDriver();
				driver.get(site);
				driver.manage().window().maximize();
			}
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

  
  
}
