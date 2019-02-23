package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginFacebookDefination {

	public class StepDefinitions {
		WebDriver driver;

	    @Given("^User is on  Facebook Homepage$")
	    public void user_is_on_facebook_homepage() {
	    	System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Naymath\\Documents\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			
	    }

	    @When("^User login with username and password$")
	    public void user_login_with_username_and_password()  {
	    	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("456");
	    	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("456");
	    	
	    	
	        
	    }
	    @Then("^User clicks on Signin button$")
	    public void user_clicks_on_signin_button()  {
	    	driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
	  
	    }

	    @Then("^sucessful login with Username and password$")
	    public void sucessful_login_with_username_and_password()  {
	       
	    }

	    @Then("^User is on facebook home pag$")
	    public void user_is_on_facebook_home_pag()  {
	        
	    }

	}
	
	
	
}
