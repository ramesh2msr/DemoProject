package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		//	System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();

		Set<String> handle = driver.getWindowHandles(); // it will return all the id's of the windows

		for(String s: handle) {

			String title = driver.switchTo().window(s).getTitle();// returns the title of first window
			System.out.println(title);
		}


	}

}
