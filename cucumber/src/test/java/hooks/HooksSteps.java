package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksSteps {
public static WebDriver driver;

public HooksSteps() {
	
}

@Before
public void intializethebrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}

@AfterStep
public void  teardown(Scenario scenario){
	if(scenario.isFailed()) {
		
		 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot, "image/png", "screenshot on failure");
	}
	
	//driver.close();
	
	
	
	}

public WebDriver getDriver() {
	return driver;
	
}
@After
public void closeBrowser() {
    if (driver != null) {
        driver.quit();
    }
}
	
	
	
}
