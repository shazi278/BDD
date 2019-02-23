package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefenition {
	WebDriver driver;
	
	@Given("^user is on CRM login page$")
	public void user_is_on_CRM_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naymath\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");	
	}

	@When("^Title of the webpage is CRMPRO - CRM software$")
	public void title_of_the_webpage_is_CRMPRO_CRM_software() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^User enters UserId and Password and clicks on sign in button$")
	public void user_enters_UserId_and_Password_and_clicks_on_sign_in_button() {
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("shazia");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Test123");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", loginButton);
		
	}

	@Then("^User is on CRM home page$")
	public void user_is_on_CRM_home_page() {
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
		
	}
	
}
