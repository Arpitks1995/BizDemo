package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Arpit\\Desktop\\SeleniumWebPage.html");
		WebElement username=driver.findElement(By.id("123"));
		username.sendKeys("Karate");
		WebElement password=driver.findElement(By.id("345"));
		password.sendKeys("chop");
		

	}

}
