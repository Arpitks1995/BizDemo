package Introduction;



import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		Point pos=driver.manage().window().getPosition();
		System.out.println("default X position" +pos.getX());
		System.out.println("default Y position" +pos.getY());
		
		Point newpoint=new Point(100,200);
		driver.manage().window().setPosition(newpoint);

	}

}
