package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();// it will switch to alert window
		
		System.out.println(alert.getText());
		Thread.sleep(2000);
		//alert.accept(); // click ok button
		//Thread.sleep(2000);
		alert.dismiss();
		
		
	}

}
