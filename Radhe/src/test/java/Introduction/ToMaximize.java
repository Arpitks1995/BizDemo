package Introduction;

import org.openqa.selenium.edge.EdgeDriver;

public class ToMaximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		

	}

}
