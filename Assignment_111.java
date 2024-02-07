//Get the title of flipkart.com and save each word in an array
package selenium_assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_111 
{

	public static void main(String[] args) 
	{
		ChromeDriver C1= new ChromeDriver(); // Launching empty browser
		C1.get("https://www.flipkart.com/");
		System.out.println(C1.getTitle());
		String pageTitle = C1.getTitle();
		char[] arr=pageTitle.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
				
	}

}
