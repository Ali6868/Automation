package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions its = new Actions(driver);
		its.moveToElement(driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]"))).build().perform();
		Thread.sleep(3000);
		its.moveToElement(driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"))).click().build().perform();
		its.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.LEFT_SHIFT).click().build().perform();
		its.keyUp(Keys.LEFT_SHIFT).build().perform();
	}

}
