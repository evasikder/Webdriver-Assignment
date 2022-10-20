package dayOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class yahoo {

	public static void main(String[] args) {
		
  System.out.println("testing testing!!");
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\eva07\\eclipse-workspace\\Selenium Project\\Chromedriver\\chromedrivernew.exe");
	//webdriver.chrome.driver
	 WebDriver driver = new ChromeDriver();
  
  
  //Step 1.Assert that we are on the correct page by checking that title = 'Yahoo'
	
	//driver.getTitle();
	
	 
	// String title = driver.getTitle();
	 
	 //System.out.println(title);
	 
	 String expectedtitle = "Yahoo"; 
	 String actualtitle = driver.getTitle();
	 
	if (actualtitle.contains(expectedtitle)) {
		
		
		
		Assert.assertTrue(true);
		//System.out.println("title matched. test passed");
		
	} else {
		
		Assert.assertTrue(false);
		//System.out.println("blah blah");
		
		
		//Assert.assertTrue()
		//Assert.assertFalse()
		//Assert.assertEqual(actual,expected)
		//getText()
		//getTitle()
		
		
		
		
	}
	 
	// Assert.assertEquals(actualtitle, expectedtitle);
	 
  
  
  
  
  
  

	}

}
