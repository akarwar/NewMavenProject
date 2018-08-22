package stepDeffination;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRMSteps {
	WebDriver driver;
	
	@Given("^user is already on login Page$")
	public void user_is_already_on_login_Page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.freecrm.com");
		 driver.manage().window().maximize();
	    
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		
//SoftAssert sa= new SoftAssert();
		
		String title = driver.getTitle();
		System.out.println(title); //hard assert
		//Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	
		//sa.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
		///sa.assertAll();
	   
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		
		System.out.println("going into this method or not");
		
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys(password);
	  
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+title);
		//Assert.assertEquals("CRMPRO", title);
	    
	}


}
