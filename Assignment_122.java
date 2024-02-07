//Launch GrowTechminds registration form,Enter "Manish Kumar Tiwari" in the firstname and copy paste in all 4 text fields using keys
package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_122 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"C");
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
		

	}

}
