package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAccount {

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
		First_Name.sendKeys("ASAD");
		WebElement Last_Name=driver.findElement(By.name("lastname"));
		Last_Name.sendKeys("GOZO");
		WebElement Phone=driver.findElement(By.name("reg_email__"));
		Phone.sendKeys("8324294983");
		WebElement Newpass=driver.findElement(By.name("reg_passwd__"));
		Newpass.sendKeys("A87659387");
		WebElement month=driver.findElement(By.id("month"));
		month.sendKeys("Nov");
		WebElement day=driver.findElement(By.id("day"));
		day.sendKeys("11");
		WebElement Year=driver.findElement(By.id("year"));
		Year.sendKeys("1989");
		WebElement gender=driver.findElement(By.xpath("(//*[@class='_58mt'])[2]"));
		gender.click();
		WebElement Sign=driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
		Sign.click();
	}

}
