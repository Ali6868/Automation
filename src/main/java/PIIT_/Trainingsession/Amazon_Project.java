package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Ali/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iPhone");
		WebElement SearchButton=driver.findElement(By.xpath("//*[@value='Go']"));
		SearchButton.click();
		WebElement SE=driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		SE.click();
		WebElement color=driver.findElement(By.xpath("(//*[@type='submit'])[24]"));
		color.click();
		WebElement Size=driver.findElement(By.xpath("(//*[@class='a-button-input'])[23]"));
		Size.click();
		WebElement Ad=driver.findElement(By.xpath("(//*[@class='a-column a-span8'])[1]"));
		Ad.click();
		WebElement Addtocart=driver.findElement(By.xpath("(//*[@type='submit'])[31]"));
		Addtocart.click();
		WebElement Protection=driver.findElement(By.xpath("((//*[@type='button'])[2]"));
		Protection.click();
		WebElement cart=driver.findElement(By.xpath("(//*[@class='a-size-base-plus hucInnerButtonText'])[1]"));
		cart.click();
		
		
	}

}
