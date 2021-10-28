package dayOne;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\eva07\\Downloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		 driver.get("http://www.yahoo.com"); 
		 driver.findElementByClassName("_yb_1bmbz").click();
		 Thread.sleep(5000);
		 driver.findElementById("createacc").click();
		 driver.findElementById("usernamereg-firstName").sendKeys("Eva");
		 driver.findElementById("usernamereg-lastName").sendKeys("Sikder");
		 Thread.sleep(5000);
		 driver.findElementById("usernamereg-yid").sendKeys("eva.sikder");
		 driver.findElementById("usernamereg-password").sendKeys("Qaproject123");
		 driver.findElementById("usernamereg-phone").sendKeys("9178479132");
		 driver.findElementByName("usernamereg-month").sendKeys("july");
		 Thread.sleep(5000);
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}