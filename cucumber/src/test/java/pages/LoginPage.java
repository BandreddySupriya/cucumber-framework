package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonFunctions;

public class LoginPage {

	WebDriver driver;
	CommonFunctions utils;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="username")
	WebElement usename;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(xpath="//*[@type='submit']")
	WebElement loginbtn;
	
	public void enterusername(String username) {
		utils=new CommonFunctions(driver);
		utils.enterText(usename, username);
		//usename.sendKeys(username);
		
	}
	public void enterpwd(String password) {
		utils.enterText(pwd, password);
		//pwd.sendKeys(password);
	}
	public void loginbutton() {
		//loginbtn.click();
		utils.clickElement(loginbtn);
	}





}
