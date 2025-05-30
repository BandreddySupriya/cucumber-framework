package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

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
		usename.sendKeys(username);
		
	}
	public void enterpwd(String password) {
		pwd.sendKeys(password);
	}
	public void loginbutton() {
		loginbtn.click();
	}





}
