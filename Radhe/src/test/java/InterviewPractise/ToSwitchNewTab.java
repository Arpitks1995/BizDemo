package InterviewPractise;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToSwitchNewTab {

	public static void main(String[] args) {
   WebDriverManager.chromedriver().setup();
   ChromeOptions option=new ChromeOptions();
   option.addArguments("--remote-allow-origins=*");
   WebDriver driver=new ChromeDriver(option);
   driver.manage().window().maximize();
   driver.navigate().to("https://www.google.com/");
   ((JavascriptExecutor)driver).executeScript("window.open()");
   ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
   driver.switchTo().window(tabs.get(1));
   driver.get("https://www.facebook.com/login/");
   driver.switchTo().window(tabs.get(0));
   driver.get("https://www.youtube.com/");
   driver.close();
     
   

	

	}

}
