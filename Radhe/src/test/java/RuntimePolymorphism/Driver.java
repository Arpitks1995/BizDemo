package RuntimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrossBrowser.test(new ChromeDriver());
		System.out.println("Application has been tested on Chrome");
		
		CrossBrowser.test(new EdgeDriver());
		System.out.println("Application has been tested on Edge Driver");

	}

}
