//Count the number of links we have in amazon webpage,locate using tagname

package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_126 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of links on the webpage: "+links.size());
		
		for (int i = 0; i <= links.size() - 1; i++) 
		{
			WebElement a = links.get(i);
			String text_message = a.getText();
			System.out.println(text_message);
		}
		
		
	}

}
