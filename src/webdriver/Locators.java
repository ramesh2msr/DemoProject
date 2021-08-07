package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver  = new ChromeDriver();
		
		//driver.get("https://justlogin.com/my/free-trial/");
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		
		
		//css locator--   tagname#id,    [attribute='name', tagname.classname
		
		/*
		 * driver.findElement(By.cssSelector("input#input_1_2_3")).sendKeys("ramesh");
		 * 
		 * driver.findElement(By.cssSelector("[placeholder *='Last Name']")).sendKeys(
		 * "shanmugam");
		 */
		//format of xpath
		
		/*
		 * driver.findElement(By.xpath("//input[@id='input_1_2_3']")).sendKeys("ramesh")
		 * ;
		 * 
		 * 
		 * driver.findElement(By.xpath("//input[@id='input_1_2_6']")).sendKeys(
		 * "shanmugam");
		 * 
		 * String s
		 * =driver.findElement(By.xpath("//h1[text()='Just Sign Up for a Free Trial!']")
		 * ).getText();
		 * 
		 * System.out.println("header===>"+s);
		 * 
		 */
		
		
		//tagname[@attribute='value']
		
		
		
		/*
		 * driver.findElement(By.id("input_1_2_3")).sendKeys("Ramesh");
		 * Thread.sleep(2000);
		 * driver.findElement(By.name("input_2.6")).sendKeys("Shanmugam");
		 * Thread.sleep(2000);
		 * driver.findElement(By.className("large")).sendKeys("Capgemini");
		 * Thread.sleep(2000); //
		 * driver.findElement(By.linkText("privacy policy")).click(); //
		 * Thread.sleep(2000); //
		 * driver.findElement(By.partialLinkText("privacy")).click();
		 * 
		 * //tagname
		 * 
		 * List<WebElement> ele =driver.findElements(By.tagName("input"));
		 */
		/*
		 * for(WebElement element : ele) {
		 * System.out.println(element.getAttribute("placeholder")); }
		 */
		
		
		
		
			
		
	}
	
	}
