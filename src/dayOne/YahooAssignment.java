package dayOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class YahooAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eva07\\eclipse-workspace\\Selenium Project\\Chromedriver\\chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		
		//String URL="https://www.yahoo.com";
		//driver.get(URL);
		
		 
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String URL="https://www.yahoo.com";
		 driver.get(URL);
		 driver.findElement(By.className("_yb_1nvru")).click();
		 driver.findElement(By.id("root_1")).click();
		 
		
		 
		 
		 
		 
		 
		 
		 
	}

}