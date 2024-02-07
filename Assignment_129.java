//Handle JavaScript Popup of grotechmind application and get the title of the page after handling the popup.

package selenium_assignments;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_129 
{

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/visha/OneDrive/Desktop/learningHTML1.html");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

}