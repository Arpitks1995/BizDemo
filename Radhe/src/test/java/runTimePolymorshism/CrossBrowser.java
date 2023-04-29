package runTimePolymorshism;

import org.openqa.selenium.WebDriver;

public class CrossBrowser {

	public static void test(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Pass the titee is verified");
		}else 
			System.out.println("Fail : the title is not  verified");
		    driver.quit();
			
		
		
	}
	
}
