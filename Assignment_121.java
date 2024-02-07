//Launch GrowTechminds registration form,locate every element except Dropdowns and Upload file button
//and perform action on each element using WebElement
package selenium_assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_121 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		
		WebElement FirstName = driver.findElement(By.id("fname"));
		FirstName.sendKeys("Vishakha");
		WebElement Lastname = driver.findElement(By.id("lname"));
		Lastname.sendKeys("Kulkarni");
		
		WebElement Username = driver.findElement(By.id("Username"));
		Username.sendKeys("vishakhakulkarni14@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("password");
		
		WebElement WhoUAre = driver.findElement(By.id("FeMale"));
		WhoUAre.click();
		
		WebElement presentAddress = driver.findElement(By.id("w3review"));
		presentAddress.sendKeys("abc d 123, yu756, pune");
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("431203");
		
		WebElement permanantAddress = driver.findElement(By.id("Address"));
		permanantAddress.sendKeys("22des 908llg,12345r678");
		
		WebElement checkbox = driver.findElement(By.id("Agree"));
		checkbox.click();
		WebElement Submit = driver.findElement(By.xpath("(//input[@value='Submit'])[2]"));
		Submit.click();
	}

}
