package PractiseSet1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class ToCloseChildWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		driver.findElement(By.xpath("//*[text()=\"actiTIME Inc.\"]"));
		Set<String> allId=driver.getWindowHandles();
		for(String id:allId) {
		 driver.switchTo().window(id);
		 if(!id.equals(parentId)) {
			 Thread.sleep(5000);
			 driver.close();
		 }
		}
		
		

	}

}
