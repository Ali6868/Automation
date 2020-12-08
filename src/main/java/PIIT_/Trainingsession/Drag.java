package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions it=new Actions(driver);
		Thread.sleep(6000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		driver.switchTo().frame(0);	
		WebElement sr=driver.findElement(By.id("draggable"));
		WebElement dr=driver.findElement(By.id("droppable"));
		it.dragAndDrop(sr, dr).build().perform();
	}

}
