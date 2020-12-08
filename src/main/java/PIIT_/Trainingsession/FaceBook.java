package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Name=driver.findElement(By.name("email"));
		WebElement Psswd=driver.findElement(By.name("pass"));
		WebElement Sign=driver.findElement(By.name("login"));
		//WebElement Forgot=driver.findElement(By.partialLinkText("Forgot"));
		WebElement Forgot=driver.findElement(By.linkText("Forgot Password?"));
		WebElement Signbt=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
		Name.sendKeys("Saleem.piit@gmail.com");
		Psswd.sendKeys("shabeez");
		//Sign.click();
		//Forgot.click();
		Signbt.click();
		
		//In selenium We have : i) Absolute Xpath  , ii) Relative Xpath
		
	}

}
