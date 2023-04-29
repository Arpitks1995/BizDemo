package apack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		WebElement chosefile=driver.findElement(By.xpath("//input[@id=\"uploadfile\"]"));
		//chosefile.click();
		
		Actions action=new Actions(driver);
		action.moveToElement(chosefile).click();
		action.build().perform();
		
		Runtime.getRuntime().exec("C:\\Users\\Arpit\\eclipse-workspace\\AutoItDemoProject\\AutoIT\\TestPdfAutoItFile.exe");
		
		

	}

}
