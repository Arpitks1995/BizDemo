package Introduction;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCloseTheChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	     String parentId=driver.getWindowHandle();
	    driver.findElement(By.xpath("//*[text()=\"actiTIME Inc.\"]")).click();
	    
	    Set<String> allIds=driver.getWindowHandles();
	    for(String id: allIds) {
	    	driver.switchTo().window(id);
	    	if(!id.equals(parentId)) {
	    		Thread.sleep(2000);
	    		driver.close();
	    	}
	    }

	}

}
