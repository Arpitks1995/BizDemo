package RadheShyam;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://tutorialsninja.com/demo/index.php");
    TakesScreenshot ts=(TakesScreenshot) driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\Users\\Arpit\\eclipse-workspace\\Radhe\\src\\test\\java\\errorshot\\error4.png");
    FileUtils.copyFile(src, dest);
    
    
    
    
	}

}
