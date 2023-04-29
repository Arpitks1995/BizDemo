package RadheShyam;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotWithTime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	LocalDateTime ldt=LocalDateTime.now();
	String s1=ldt.toString().replace(";", "-");
	//System.out.println(s1);
	driver.get("https://tutorialsninja.com/demo/index.php");
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	//File destn=new File("./errorshot/error.png"+s1);
    //FileUtils.copyFile(src, dest);
	//FileHandler.copy(src, new File("./errorshot/error"+s1+".png"));
	FileUtils.copyFile(src, new File("C:\\Users\\Arpit\\eclipse-workspace\\Radhe\\src\\test\\java\\errorshot\\error1"+s1+".png"));
	
	
	
		

	}

}
