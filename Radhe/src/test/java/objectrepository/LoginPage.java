package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	private By emailField=By.id("input-email");
	private By password=By.id("input-password");
	private By loginButton=By.xpath("//input[@value=\"Login\"]");
	
	public WebElement emailField() {
		return driver.findElement(emailField);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement loginButton() {
		return driver.findElement(loginButton);
	}
}
