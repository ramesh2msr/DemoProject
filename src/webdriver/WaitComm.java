package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitComm {

	public static void main(String[] args) {
		// Implicit and explicit
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// this 20 sec wait is applicable for all the webelements
		// button with id "ramesh"
		
		//driver.findElement(By.id("Ramesh")).click();// throw exceptios
		
		// explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("Ramesh")));
		
		
		
		
		

	}

}
