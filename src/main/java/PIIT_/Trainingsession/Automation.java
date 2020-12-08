package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to open browser
		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("twotabsearchtextbox"));
	WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
		
	WebElement Searchbutton=driver.findElement(By.id("nav-search-submit-text"));
	Search.sendKeys("phones");
	Searchbutton.click();	
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		//locators in selenium
		//i) ID
		//ii)linktext
		//iii)Partiallinktext
		//iv)Xpath
		//v)Name
		//vi)Tagname */
		
		
		
		
	}

}
