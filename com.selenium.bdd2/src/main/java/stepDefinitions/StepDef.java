/**
 * 
 */
package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author ashish
 *
 */
public class StepDef {
	
	WebDriver driver=new ChromeDriver();
	
	
	@Given("^I am on the login page$")
    public void I_am_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver","/chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
		
	}
	
	@When("^I enter username in usrename field$")
	public void i_enter_username_in_usrename_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("enter user name");
	}

	@When("^I enter password in password field$")
	public void i_enter_password_in_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("enter password");
	}

	@When("^I click on Logon Button$")
	public void i_click_on_Logon_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("click on login button");
	}

	@Then("^I should be logged and redirected to home page$")
	public void i_should_be_logged_and_redirected_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("logged in");
	}
	
	@Then("^Close the Borwser$")
	public void close_the_Borwser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	    driver.quit();
	}

}
