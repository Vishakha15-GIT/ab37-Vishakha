//Launch www.flipkart.com page,search for books and click on second autosuggestion use xpath to locate autosuggestions.

package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_127 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("books");
		Thread.sleep(2000);
		WebElement options = driver.findElement(By.xpath("(//form/ul/li)[2]"));
		options.click();
		
	}

}
