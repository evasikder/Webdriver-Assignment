package dayOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class testngex {

	@BeforeSuite 
	public void setup( ) {
		System.out.println("setup system property for chorme");
	}
	
	@BeforeTest 
	public void login() {
		System.out.println("login method");
	}
	
	@BeforeClass 
	public void launchBrowser() { 
		System.out.println("launch chrome Browser");
	}		
	
	@BeforeMethod 
	public void enterURL() {
		System.out.println("enter URL");
	}	
	
	@Test 
	public void googleTtileTest() {
		System.out.println("Google Title Test");
	}
	
	@AfterMethod 
	public void logOut() {
		System.out.println("logout From App");
	}
		
	@AfterClass 
	public void closeBrower() {
		System.out.println("Close Browser");
	}
	
	@AfterTest 
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	
	@AfterSuite 
	public void generateTestReport() {
		System.out.println("generate Test Report");
	}	
		
}


