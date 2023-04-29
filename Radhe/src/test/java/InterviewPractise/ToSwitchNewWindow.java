package InterviewPractise;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToSwitchNewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		ArrayList<String> tab=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0)).get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		
	
		
		
		

	}

}
