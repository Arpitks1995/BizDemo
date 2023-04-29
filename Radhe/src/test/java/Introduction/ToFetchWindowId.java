package Introduction;

import org.openqa.selenium.edge.EdgeDriver;

public class ToFetchWindowId {

	public static void main(String[] args) {
		
		//ID will be Same because Session is same
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String windowID1=driver.getWindowHandle();
		
		driver.navigate().to("https://www.facebook.com/");
		String windowID2=driver.getWindowHandle();
		
		System.out.println("The ID for Google is : "+windowID1);
		System.out.println("The ID for Facebbok is : "+windowID2);
		
		
	}

}
