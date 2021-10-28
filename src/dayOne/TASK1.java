package dayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TASK1 {

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\eva07\\Downloads\\geckodriver.exe");
	 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\eva07\\Downloads\\chromedriver.exe");
	 //WebDriver driver = new ChromeDriver(); //launch FF
	 
	 WebDriver driver = new FirefoxDriver(); //launch FF
	 
	 driver.get("http://www.google.com"); //enter URL
	 
	 //System.out.println(driver.getTitle()); //validate if your title page is correct
	
	// System.out.println(driver.getCurrentUrl()); //validate if landed on the correct url
	
	//System.out.println(driver.getPageSource()); //print page source
	
	 //driver.get("http://yahoo.com");
	 //driver.navigate().back();
	 //driver.navigate().forward();
	 //driver.close(); //closes current browser
	 //driver.quit(); //closes all the browsers opened by selenium script
	 
	 //driver.get("http://facebook.com");// URL IN THE BROWSER
	 //driver.findElement(By.id("email")).sendKeys("this is my first code");
	 //driver.findElement(By.name("pass")).sendKeys("123456");
	 //driver.findElement(By.linkText("Forgot Password?")).click(); 
	 
	driver.get("http://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("hello");
	
	}
	

}
