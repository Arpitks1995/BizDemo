package RadheShyam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;



public class LoginTest {
	WebDriver driver;

	@Test
	public void Login() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.emailField().sendKeys("arpitks750@gmail.com");
		loginPage.password().sendKeys("Arpit@123");
		loginPage.loginButton().click();
		
		MyAccountPage myaccountpage=new MyAccountPage(driver);
		Assert.assertTrue(myaccountpage.Accountfield().isDisplayed());
		
	}
	
	@AfterMethod
	public void closure() {
		driver.close();
		
		
	}
	
	
	
	
	

}
