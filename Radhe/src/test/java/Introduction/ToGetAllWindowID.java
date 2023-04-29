package Introduction;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetAllWindowID {

	public static void main(String[] args) {
		
		//Window id different hoge if new Tabs are opens
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.linkText("actiTIME Inc.")).click();
	   Set<String> allIds= driver.getWindowHandles();
	   System.out.println(allIds);
	   for(String id :allIds) {
		   System.out.println(id);
	   }

	}

}
