package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// Open the chrome brower
		//C:\Users\msramesh\eclipse-workspace\chromedriver.exe

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver  = new ChromeDriver();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//maximize window
		driver.manage().window().maximize();
		
		//browse url
	///	driver.get("https://www.google.com/");
		
	/*	//get title
		String title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Pass");	
		}
		else {
		System.out.println("fail");*/
		
		//page source
		String source = driver.getPageSource();
		System.out.println(source);
		
		// Navigate
		
		driver.navigate().to("https://www.google.com/");
		
		// backward
		
		driver.navigate().refresh();
		
		// close the browser
		driver.close();
		driver.quit();
		
	}
		





	}


