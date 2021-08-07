package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		
		
		WebElement fname = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		 fname.sendKeys("Ramesh");
		 Thread.sleep(2000);
		 fname.clear();
		 Thread.sleep(2000);
		 
		 fname.sendKeys("Ramesh");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("shanmugam");
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("Ramesh1@gmail.com");
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("0112928276");
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("Ramesh");
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("Ramesh");
		
		//gettext
		String lbl = driver.findElement(By.xpath("(//label[@class='col-sm-2 control-label'])[7]")).getText();
		System.out.println("Lable text==>"+ lbl);
		
		//isDisplayed,		iSEnabled,		isSelected
		
		WebElement radiobtn = driver.findElement(By.xpath("(//input[@name='newsletter'])[1]"));
		
		
		boolean isdisplayed = radiobtn.isDisplayed();
		boolean isenabled = radiobtn.isEnabled();
		boolean isselected = radiobtn.isSelected();
		
		System.out.println("Displayed-->"+isdisplayed);

		System.out.println("isenabled-->"+isenabled);
		System.out.println("isselected-->"+isselected);// False
		
		radiobtn.click();  // selecting yes button
		
		boolean isselected1 = radiobtn.isSelected();
		
		System.out.println("isselected1-->"+isselected1);// True

		//getAttribute,		get size,		Getlocation, getCssValue,		getTagname
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		// get element of button
		
		WebElement btn = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		
		String att = btn.getAttribute("type");
		System.out.println("attribute--->"+att); //  attribute
		
		Dimension size =btn.getSize();
		System.out.println("Dimension--->"+size); //size
		
		Point loc = btn.getLocation();
		System.out.println("Location--->"+loc); //location
		
		String color = btn.getCssValue("color"); // color
		System.out.println("color--->"+color);
		
		String tag = btn.getTagName();
		System.out.println("tag--->"+tag);  // tagname;
		
		//Click ,		Submit
		//btn.click();
		
		btn.submit();
		

	}

}
