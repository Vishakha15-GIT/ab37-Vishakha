//Launch (JSAM) HTML page get elements by xpath(absolute xpath)
package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_117 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/visha/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("vishakha");//username
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("edf");//hint
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("123edf");//password
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("vishakha"); //Firstname
	//	driver.findElement(By.xpath("(/html/body/form/input)[2]")).sendKeys("kulkarni"); //Lastname(it is disabled currently hence commented the same)
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click(); //submit
		driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();//checkbox1
		driver.findElement(By.xpath("(/html/body/form/input)[5]")).click();//checkbox2
		driver.findElement(By.xpath("(/html/body/form/input)[6]")).click();//checkbox3
		//driver.findElement(By.xpath("(/html/body/form/input)[7]")).click();//submit
		driver.findElement(By.xpath("(html/body/input)[4]"));//Who you are? Male
		driver.findElement(By.xpath("(html/body/input)[5]")).click();//Who you are? Female
		driver.findElement(By.xpath("(html/body/input)[6]")).click();//Are you ready to relocate to banglore?
	}

}
