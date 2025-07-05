package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class AdminPage {

	WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//div[@id='app']//ul)[1]//li[1]")
	WebElement admin;
	@FindBy(xpath="//label[text()='Username']")
	WebElement usr;
	@FindBy(xpath="(//div[@class='oxd-input-group__label-wrapper']//following::input)[1]")
	WebElement txtbo;
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement userrole;
	
	public void admintab() {
		admin.click();
	}
	 public void usetext() {
		 String Actvaltxt=usr.getText();
		 Assert.assertEquals(Actvaltxt,"Username");
	 }
	 public void textbox(String usertxt) {
		 txtbo.sendKeys(usertxt);
	 }
	 public void searchclick() {
		 search.click();
	 }
	 public void userole() {
		 Select sel=new Select(userrole);
		 sel.selectByValue("ESS");
	 }
	
}
