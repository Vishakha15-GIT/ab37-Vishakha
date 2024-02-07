//launch amazon.in select category dropdown,select Books using arrow down key then search for software in search text field 
//and press enter using keys function.
package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_119
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).click();
		for (int i=0; i<11; i++)
		{
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		}
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}

}
