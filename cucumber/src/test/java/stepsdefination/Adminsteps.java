package stepsdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import hooks.HooksSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminPage;

public class Adminsteps {
	WebDriver driver;
	
	AdminPage admin;
@Given("user click admin tab")
public void user_click_admin_tab() {
	driver=HooksSteps.driver;
	admin=new AdminPage(driver);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	admin.admintab();
}
@Then("user verify the name of the Textbox")
public void user_verify_the_name_of_the_textbox() {
    admin.usetext();
}
@And("user enters the text in textbox")
public void user_enters_the_text_in_textbox() {
    admin.textbox("supriya");
}
@Then("user select the role in userrole dropdown")
public void user_select_the_role_in_userrole_dropdown() {
   admin.userole();
}
@And("user click on search button")
public void user_click_on_search_button() {
    admin.searchclick();
}

}
