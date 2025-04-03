package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocaters {
	@FindBy(name="username")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement pasword;
	
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	public WebElement login;
}