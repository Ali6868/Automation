package Pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_Password {
	public WebDriver driver;
@FindBy(id="identify_email")
WebElement Search;


@FindBy(name="did_submit")
WebElement searchbutton;
@FindBy(xpath="(//*[text()='Find Your Account'])[2]")
WebElement FindYourAccounting;
public Forgot_Password(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void searchfieldemail(String name) {
	Search.sendKeys(name);
}
public void buttonlk() {
	searchbutton.click();
}
public WebElement ForgotYourAccountText() {
return FindYourAccounting;
}

}