package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Stepdef {

	
	public static WebDriver driver;
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		
		 WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\SVC\\eclipse-workspace\\Batch23Cucumber\\src\\test\\resources\\Drivers101\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get(string);
		

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("Click on Login")
	public void click_on_Login() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions

	}

}
