package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BuyTicket {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.id("cookie-close")).click();
		Picture("Airlines");
		Thread.sleep(4000);
		WebElement dts=driver.findElement(By.id("T7-departure_1"));
		dts.click();
		Picture("cookies");
		Thread.sleep(3000);
		driver.findElement(By.xpath("[//*[text()='26'])[2]")).click();
		Picture("Dates");
	}
		public static void Picture(String pic) throws IOException {
			//capture the system data or time
			//convert to string format
			//use with picture name
			Date dt=new Date();
			System.out.println(dt);
			String si=dt.toString().replace("", "_").replace(":", "_");
			System.out.println(si);
		File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(shots,new File("/Users/Ali/Documents/"+si+pic+".png"));
		
		
		
	}

}
