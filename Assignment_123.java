//Launch grotechminds registration form and locate dropdowns skills,country and religion perform action on them

package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_123 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		
		WebElement skill_dd = driver.findElement(By.id("Skills"));
		
		Select s1 = new Select(skill_dd);
		s1.selectByValue("select1"); // select by value
		
		WebElement Country_dd = driver.findElement(By.id("Country"));
		Select s2 = new Select(Country_dd); //select by index
		s2.selectByIndex(5);
		
		WebElement religion_dd = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(religion_dd);
		s3.selectByVisibleText("Hindu");

	}

}
