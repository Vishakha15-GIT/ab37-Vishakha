
//Launch GrowTechminds registration form,enter firstname textfield and remove few characters from it using Keys option
package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_120 
{

	public static void main(String[] args)
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Vishakha Deepak Kulkarni");
		for(int i=0;i<8;i++)
		{
			driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		}
		
		

	}

}
