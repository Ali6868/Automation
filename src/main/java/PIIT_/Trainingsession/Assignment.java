package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Name=driver.findElement(By.name("email"));
		WebElement Psswd=driver.findElement(By.name("pass"));
		Name.sendKeys("SAM@Gmail.com");
		Psswd.sendKeys("S122345hkj");
		Thread.sleep(6000);
		WebElement Signin=driver.findElement(By.name("login"));
		Signin.click();
		Thread.sleep(6000);
		WebElement forgotpass=driver.findElement(By.linkText("Forgot Password?"));
		forgotpass.click();
		driver.navigate().back();
		WebElement CreateAnAccount=driver.findElement(By.xpath("//a[@role='button']"));
		CreateAnAccount.click();
	}

}

