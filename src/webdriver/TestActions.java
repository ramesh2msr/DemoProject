package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		
		// Try to mouse over on the main menu
		   //Actions- is used to handle all the mouse and keyboard events
		
		WebElement comp = driver.findElement(By.linkText("Components"));
		
		
	    Actions action = new Actions(driver);
	    action.moveToElement(comp).build().perform();// wil mouse over on the main menu
	    
	    Thread.sleep(2000);
	    WebElement moni = driver.findElement(By.linkText("Monitors (2)"));
	    
	    action.moveToElement(moni).click().build().perform(); // this willclick monitor in sub menu
	    Thread.sleep(2000);
		  
	    
		// try to click submenu monitor

	}

}
