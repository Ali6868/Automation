package PIIT_.Trainingsession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions its = new Actions(driver);
		its.moveToElement(driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]"))).build().perform();
		its.moveToElement(driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"))).click().build().perform();
		//Window handle : When ever the browser is opening a new Window there is a unique id associated with that new browser session! That id is known as window handle in selenium.
		String parentWindowhandles=driver.getWindowHandle();
		//System.out.println(parentWindowhandles);
		its.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.LEFT_SHIFT).click().build().perform();
		its.keyUp(Keys.LEFT_SHIFT).build().perform();
		
		
		Set<String> MultipleWindows=driver.getWindowHandles();
		for(String Window : MultipleWindows) {
			//System.out.println(Window);
			
		if(Window.equalsIgnoreCase(parentWindowhandles)) {
			System.out.println("This to switch");
		}else {
		driver.switchTo().window(Window);
		}
		
	}
		WebElement name=driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("name");
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowhandles);
		Thread.sleep(2000);
		WebElement user6=driver.findElement(By.id("ap_customer_name"));
		user6.sendKeys("name");
	}
}
