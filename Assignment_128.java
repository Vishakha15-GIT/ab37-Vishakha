//Launch amazon india search for shoes,select 30th shoe and add it to the cart inspect shoes using xpath

package selenium_assignments;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_128 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement shoes = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
		shoes.click();
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> pcid = ids.iterator();
		String pid = pcid.next();
		String cid = pcid.next();
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		WebElement AddToCart = driver.findElement(By.id("add-to-cart-button"));
		AddToCart.click();
		
		

	}

}
