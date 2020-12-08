package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreateAnAccount= driver.findElement(By.linkText("Create New Account"));
		CreateAnAccount.click();
		Thread.sleep(3000);
		WebElement birth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(birth);
		ob.selectByValue("6");
		Thread.sleep(3000);
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select di=new Select(day);
		di.selectByValue("18");
		Thread.sleep(3000);
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select ye=new Select(year);
		ye.selectByValue("1989");
	}

}
