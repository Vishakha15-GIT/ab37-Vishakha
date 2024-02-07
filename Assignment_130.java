//Launch online sbi link,click on login button, and  inspect username,password and captcha

package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_130 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement continueToLogin = driver.findElement(By.xpath("//a[.='CONTINUE TO LOGIN'][1]"));
		continueToLogin.click();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("cbsudyg563");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("label2"));
		pass.sendKeys("12sdwe4567");
		Thread.sleep(1000);
		WebElement captcha = driver.findElement(By.id("loginCaptchaValue"));
		captcha.sendKeys("687nd");
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.id("Button2"));
		login.click();	
		
	}

}

