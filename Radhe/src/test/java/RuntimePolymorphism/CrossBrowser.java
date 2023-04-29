package RuntimePolymorphism;

import org.openqa.selenium.WebDriver;

public class CrossBrowser {
	
	public static void test(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String realTitle=driver.getTitle();
		
		if(realTitle.equals("Google")) {
			System.out.println("Pass: the title is verified");
		}else {
			System.out.println("Fail: the title is not verified");
		}
		
		driver.quit();
	}

}
