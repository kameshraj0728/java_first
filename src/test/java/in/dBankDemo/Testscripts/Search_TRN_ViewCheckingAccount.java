package in.dBankDemo.Testscripts;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_TRN_ViewCheckingAccount extends Driver {
	
	
	@Given("the User is on the login page")
	public void the_user_is_on_the_login_page() {
		
		
	}

	@When("the User enter the username and password")
	public void the_user_enter_the_username_and_password(){
		
		signInPage.enterUsername("kamesh@gmail.com");
		signInPage.enterPassword("2424Kamesh");
		signInPage.clickSIgnInBtn();

	}

	@When("the User click on Checking and View Checking")
	public void the_user_click_on_checking_and_view_checking() {
		
		 checkingPage.navigateToChecking(); 

	}

	@Then("the User should enter the {string} on the search box")
	public void the_user_should_enter_the_on_the_search_box(String string) {
		
		searchboxbutton.searchboxButton1("845548551");	
		
		driver.quit();	

		
	}
	
}
		

		


