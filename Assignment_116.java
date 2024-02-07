//Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.
package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_116 
{

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Emirates")).click();
		driver.get("https://www.amazon.in");
		driver.findElement(By.partialLinkText("Kingdom")).click();
		driver.get("https://www.amazon.in");
		driver.findElement(By.partialLinkText("States")).click();

	}

}
