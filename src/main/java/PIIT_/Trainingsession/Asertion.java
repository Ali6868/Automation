package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asertion {
	static WebDriver driver;

	public static void main(String[] args) {
		Driver("Chrome","https://www.facebook.com");
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "/Users/Ali/Desktop/geckodriver");
		//driver=new FirefoxDriver();
		//driver.get("https://www.facebook.com");
		
		WebElement CreateNewAccounts=driver.findElement(By.linkText("Create New Account"));
		boolean button=CreateNewAccounts.isDisplayed();
		System.out.println(button);
		WebElement ds= driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
		String textheading=ds.getText();
		System.out.println(textheading);
	}
	public static void Driver(String browser,String URI) {
		if(browser.equalsIgnoreCase("Chrome")) {
		String director =System.getProperty("user.dir");
		System.out.println(director);
			System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
			driver=new ChromeDriver();
			driver.get(URI);
			driver.manage().window().maximize();
			
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/Ali/Desktop/geckodriver");
			driver=new FirefoxDriver();
			driver.get(URI);
			driver.manage().window().maximize();
			
		}
			
}
	
}

