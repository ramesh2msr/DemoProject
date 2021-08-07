package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestInstagram {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[3]")).sendKeys("ramesh2msr2022");
		driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]")).sendKeys("testingtesign"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[2]")).sendKeys("ramesh2msr2022"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[3]")).sendKeys("93843llldd");

	}
}
