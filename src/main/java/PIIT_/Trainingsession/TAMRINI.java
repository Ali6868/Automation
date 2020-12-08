package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAMRINI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement Search=driver.findElement(By.id("gh-ac"));
		Search.sendKeys("JBL PartyBox 300 Portable Bluetooth Speaker - Black");
		Thread.sleep(2000);
		WebElement SearchBt=driver.findElement(By.id("gh-btn"));
		SearchBt.click();
		WebElement P300=driver.findElement(By.xpath("(//*[@class='s-item__title s-item__title--has-tags'])[2]"));
		P300.click();
		WebElement Qty=driver.findElement(By.id("qtyTextBox"));
		Qty.sendKeys("2");
		WebElement Add=driver.findElement(By.id("isCartBtn_btn"));
		Add.click();
		
		
	}

}
