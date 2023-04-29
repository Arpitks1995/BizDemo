package Introduction;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetDimension {
	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		
	    Dimension dimension =driver.manage().window().getSize();
	    System.out.println(dimension);
	    System.out.println(dimension.getHeight());
	    System.out.println(dimension.getWidth());
	    
	    Dimension newDim=new Dimension(700,200);
	    driver.manage().window().setSize(newDim);
		
	}

}
