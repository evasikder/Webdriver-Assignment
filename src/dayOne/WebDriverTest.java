package dayOne;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebDriverTest {
	
	public static WebDriver driver;
	
	//complete the tests below to the best of your ability in JAVA
	/* ** Bonus**
	 You have the option to parameterize step 4 to search for 'New York City', 'San Diego', and 'Chicago'.
	 */
	@BeforeTest
	public static void main(){
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eva07\\eclipse-workspace\\Selenium Project\\Chromedriver\\chromedrivernew.exe");
		//webdriver.chrome.driver
		driver = new ChromeDriver();
		}
       
	    @Test
	 public void testYahooPage() throws InterruptedException {
		 driver.get("http://www.yahoo.com");
		 //String title = "Yahoo";
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //Step 1.Assert that we are on the correct page by checking that title = 'Yahoo'
		
		    System.out.println(driver.getTitle());
		 
		 
		 //Step 2.Display the count of links under the search bar ('Mail','COVID-19','News','Finance',...)
		   //including 'More...'option
		
		List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"ybar-navigation\"]//li"));
        System.out.println("Total Links under Search bar is :: " + links.size());
      
        
        //Step 3.Write an enhanced for-each loop that will print each of the links from step 2
		 
          for(WebElement e: links){
           System.out.println(e.getText());
       }
        
         //Step 4.Enter 'New York City' in the search bar on the top
         // driver.findElement(By.xpath("//*[@name='p']")).sendKeys("New York City");
		 
          searchWord("HAWAI");
          
         // searchWord(word);
          
		 //Step 5.Click Search button
		 driver.findElement(By.id("ybar-search")).click();
          
		 //Step 6. Set a 7 second explicit wait for the result of the search
		 // Use an appropriate condition of your choice
		 
		  WebDriverWait wait = new WebDriverWait(driver, 7);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sign In']")));
		 // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='broadway.nyc.com']//parent::div//parent::a")));
		  
		 // driver.findElement(By.xpath("//*[text()='broadway.nyc.com']//parent::div//parent::a")).click();
		  
		  
		  
		  
        //Step 7. Click 'Sign In' button on the top right side
		  driver.findElement(By.xpath("//*[text()='Sign In']")).click();
        
         //Step 8: Display the boolean state of the checkbox next to 'Keep me signed in'
          
           Boolean Select = driver.findElement(By.id("persistent")).isSelected();
           System.out.println("Element selected is : "+Select);
           
          //Step 9: Create a logic that will uncheck the checkbox if it is checked
           
       	  // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='persistent']")));
          
           Thread.sleep(3000);
           
           if (Select == true) {
        	   
        	   driver.switchTo().frame("login-ad-rich");
        	   Thread.sleep(2000);
        	   
        	   driver.findElement(By.xpath("//*[@id='persistent']")).click();
        	   
        	   
        	  // System.out.println("box is checked");
        	   
           } else {
        	   
        	   System.out.println("Its already unchecked!!!");
           }
           
           
           
          //else()
	 }
	
	    
	public static void searchWord (String word) {
		
		driver.findElement(By.xpath("//*[@name='p']")).sendKeys(word);
		
	}
	    

	@AfterTest
	 public void tearDown() {
		 
		 // Step 10: Close the browser
		// driver.close();
	 }
	 
}
