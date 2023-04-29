package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyAccountPage {
	WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By Accountfield=By.xpath("//*[text()=\"Account\"]");
	
	public WebElement Accountfield() {
		return driver.findElement(Accountfield);
	}
	
	

}
