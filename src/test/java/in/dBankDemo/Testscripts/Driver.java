package in.dBankDemo.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.dBankDemo.pages.CheckingPage;
import in.dBankDemo.pages.SearchBox;
import in.dBankDemo.pages.SignInPage;



public class Driver extends Tools {
	protected static WebDriver driver;
	protected static SignInPage signInPage;
	protected static CheckingPage checkingPage;
	protected static SearchBox searchboxbutton;

	
	

	
	public static void init() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/bank/login");	
		signInPage = new SignInPage(driver);
		checkingPage = new CheckingPage(driver);
		searchboxbutton = new SearchBox(driver);
	
	
		
		
	}

		
	       
	 }