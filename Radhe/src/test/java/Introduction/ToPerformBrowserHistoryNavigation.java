package Introduction;

import org.openqa.selenium.edge.EdgeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EdgeDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    driver.navigate().to("https://www.facebook.com/");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    
	}

}
