package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoPage;

public class POMSteps {
	 WebDriver driver;   // Declare the driver
	    LoPage obj;  
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		obj = new LoPage(driver); 
	   
	}

	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username,String password) {
	    // Write code here that turns the phrase above into concrete actions
		obj.userpass(username, password);
		
		
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.clickbtn();
	   
	}

	@Then("user is neviagted to home page")
	public void user_is_neviagted_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		obj.banner();
	   
	}

	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}


}
