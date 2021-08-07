package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();

		//click the menu tablet
		driver.findElement(By.xpath("(//a[text()='Tablets'])[1]")).click();
		//select the value from drop down
		 WebElement dropdwn =driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select select = new Select(dropdwn);
		 
		 select.selectByIndex(5);
		// select.selectByValue(null);
		// select.selectByVisibleText(""name)
		 
		 
		 
		//click the tablet
		 driver.findElement(By.xpath("//a[text()='Samsung Galaxy Tab 10.1']")).click();
		//click the add to cart
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		 Thread.sleep(2000);
		 //click the cart
		 driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
		 
		 Thread.sleep(2000);
		// swith to the child window
		 
		//click checkout
		 
		 driver.findElement(By.linkText("Checkout")).click();
		
	}

}
