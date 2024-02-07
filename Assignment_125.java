//Perform any action on the disabled component and find out which exception we are getting

package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_125 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/visha/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement LastName = driver.findElement(By.xpath("(/html/body/form/input)[2])"));
		
		//getting  org.openqa.selenium.InvalidSelectorException
		
		LastName.sendKeys("kulkarni");
		

	}

}
