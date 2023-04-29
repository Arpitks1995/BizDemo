package runTimePolymorshism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrossBrowser.test(new ChromeDriver());
		System.out.println("Application has been tested on chrome");
		
		CrossBrowser.test(new FirefoxDriver());
		System.out.println("Application has been tested on firefox");
		
		CrossBrowser.test(new EdgeDriver());
		System.out.println("Application has been tested on Edge");

	}

}
