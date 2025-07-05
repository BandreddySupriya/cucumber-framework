package utilities;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class CommonFunctions {


	WebDriver driver;
	public CommonFunctions(WebDriver driver) {
		this.driver=driver;
	}
	//wait utilities
	public WebElement waitforElementvisible(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;

	}
	public WebElement waitforElementToBeClickeable(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;

	}
	public boolean waitForElementInvisible(By locator) {
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	public boolean isElementPresent(By locator) {
		try {
			driver.findElement(locator);
			return true;
		}
		catch(NoSuchElementException e){
			return false;

		}
}
	
	//Element Interaction
	public void clickElement(WebElement element) {
		waitforElementToBeClickeable(element).click();
	}
	public void enterText(WebElement element, String text) {
        WebElement el = waitforElementvisible(element);
        el.clear();
        el.sendKeys(text);
    }
	public String getText(WebElement element,String text) {
		
		return waitforElementvisible(element).getText();
		
	}
	public boolean isElementDisplayed(WebElement element) {
		try {
			waitforElementvisible(element).isDisplayed();
			return true;
		}
		catch(Exception e){
			return false;
		}
		
		
	}
	 public boolean isElementEnabled(WebElement element) {
	        return waitforElementvisible(element).isEnabled();
	    }

	    public boolean isElementSelected(WebElement element) {
	        return waitforElementvisible(element).isSelected();
	    }
	    
	    //Dropdowns seelection
	    public void selectByVisibleText(WebElement element, String text) {
	        Select sel=new Select(waitforElementvisible(element));
	        sel.selectByVisibleText(text);
	    }
	    public void selectByIndex(WebElement element,int index) {
	    	 Select sel=new Select(waitforElementvisible(element));
	    	 sel.selectByIndex(index);
	    }
	    public List<WebElement> getAllDropdownOptions(WebElement element){
			return new Select(element).getOptions();
	    	
	    }
	    
	    //Actions 
	    public void houseOveElement(WebElement element) {
	    	Actions action=new Actions(driver);
	    	action.moveToElement(waitforElementvisible(element)).build().perform();
	    	
	    }
	     public void draganddrop(WebElement source,WebElement target) {
	    	 Actions action=new Actions(driver);
	    	 action.dragAndDrop(source, target).release().build().perform();
	     }
	     public void doubleclick(WebElement element) {
	    	 Actions action=new Actions(driver);
	    	 action.doubleClick();
	    	 
	     }

}
