package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functioning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement CreateAnAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateAnAccount.click();
		Thread.sleep(6000);
		WebElement First_Name=driver.findElement(By.name("firstname"));
		First_Name.sendKeys("SAM");
		WebElement Last_Name=driver.findElement(By.name("lastname"));
		Last_Name.sendKeys("BARGHPEIMA");
		WebElement Sign=driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
		Sign.click();
		
		/* i) Open the facebook page
		 * ii) Enter the email and password
		 * iii) Click login
		 * iv) click forgot password
		 * v)come back to login page
		 * vi) Click to create an account */
		 
		
	}

}
