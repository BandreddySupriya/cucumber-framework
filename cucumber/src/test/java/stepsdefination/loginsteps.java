package stepsdefination;

import org.openqa.selenium.WebDriver;

import hooks.HooksSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class loginsteps {

	WebDriver driver;
	LoginPage login;
	
@Given("user is on login page")
public void user_is_on_login_page() {
	//HooksSteps step=new HooksSteps(driver);
	 driver=HooksSteps.driver;
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@Then("^user enters username and password$")
public void user_enters_username_and_password() {
	login=new LoginPage(driver);
	login.enterusername("Admin");
	login.enterpwd("admin123");
    
}

@And("^user click on login button$")
public void user_click_on_login_button() {
    login.loginbutton();
}

@Then("user is navigated to home page")
public void user_is_navigated_to_home_page() {
   System.out.println(driver.getTitle());
}


}
