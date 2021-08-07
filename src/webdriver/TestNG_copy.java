package webdriver;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_copy {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@Test(priority=1, groups="URL")
	public void getURL() {
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

	}
	
	@Test(dependsOnMethods= {"getURL"})
	public void keyInFirtName() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Ramesh");
	}

	@Test(dependsOnMethods= {"keyInFirtName"})
	public void keyInSecondName() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("shanmugam");
	}

	@Test(dependsOnMethods= {"keyInSecondName"})
	public void keyInEmail() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[13]")).sendKeys("Ramesh3@gmail.com");
	}
	@Test(dependsOnMethods= {"keyInEmail"})
	public void keyInMobile() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("0112928276");
	}
	@Test(dependsOnMethods= {"keyInMobile"})
	public void keyInUID() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("Ramesh");
	}

	@Test(dependsOnMethods= {"keyInUID"})
	public void keyInPWD() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("Ramesh");
	}
	
	@Test(dependsOnMethods= {"keyInPWD"})
	public void selectTC() {
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
	}

	@Test(dependsOnMethods= {"selectTC"})
	public void clickSubmit() {

		WebElement btn = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		btn.click();
	}




	///@Test(priority=3)
public void closeDriver() {
	driver.close();
}


}
