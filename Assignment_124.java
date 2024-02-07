//Launch Growtechminds xpath form do the folllowing  1. Write an Xpath for books 2.Write an Xpath for Mobiles 
//3.Write an Xpath for Clothes 4.Write an Xpath for Chocolates
package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_124 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/#1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement products = driver.findElement(By.xpath("//span[@class=\"folder\"]"));
		products.click();
		WebElement books = driver.findElement(By.xpath("//span[@class=\"folder\"]"));
		books.click();
		
		
	}

}
