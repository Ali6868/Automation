package Pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	public WebDriver driver;
	@FindBy(name = "email")
	WebElement emailfieldkeys;
	@FindBy(name = "pass")
	WebElement psswdfielkeys;
	@FindBy(name="login")
	WebElement sign;
	@FindBy(linkText = "Forgot Password?")
	WebElement Forgot;
	
	public Home(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void emailofinput(String name) {
	WebDriverWait it= new WebDriverWait(driver, 10);
	it.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
	emailfieldkeys.clear();
	
	emailfieldkeys.sendKeys(name);
	
	
}


public void psswrdoffield(String field) {
	WebDriverWait it= new WebDriverWait(driver, 10);
	it.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
	psswdfielkeys.sendKeys(field);
	
	
}
public void Signingin() {
	sign.click();
}
public void Forgotlink() {
	Forgot.click();
}
}


/* 
 fill the forms with SendKeys 
 Click on the buttons */ 
 
