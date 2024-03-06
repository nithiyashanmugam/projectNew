package StepDefn;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.*;

import io.cucumber.java.en.*;

public class StepDefn {
	
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws Exception {
	   driver=new ChromeDriver();
	   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(3000);
	}
	@When("User Enter Username {string} and Password {string}")
	public void user_enter_username_and_password(String user, String pass) {
	
	   WebElement userame=driver.findElement(By.name("username"));
	   WebElement password=driver.findElement(By.name("password"));
	   userame.sendKeys(user);
	   password.sendKeys(pass);
	   
	}
	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
		Thread.sleep(3000);
	    WebElement login=driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]"));
	    login.click();
	}
	@Then("Validate user is on Homepage")
	public void validate_user_is_on_homepage() {
	  System.out.println("user in home page");
	  driver.quit();
	}
	
	@When("User Enter below credential")
	public void user_enter_below_credential(DataTable datatable) {
	 
		List<List<String>> credential=datatable.asLists(String.class);
		
		String username=credential.get(0).get(0);
		String password=credential.get(0).get(1);
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	
	}
	
	@When("User Enter below details")
	public void user_enter_below_details(DataTable datatable) {
	   List<Map<String,String>> credentials=datatable.asMaps(String.class,String.class);
	   String uname=credentials.get(0).get("Username");
	   String pass=credentials.get(0).get("Password");
	   driver.findElement(By.name("username")).sendKeys(uname);
	   driver.findElement(By.name("password")).sendKeys(pass);
	   
	}

	
	@When("User Enter the {string} and {string}")
	public void user_enter_the_and(String username, String password) {
		WebElement user=driver.findElement(By.name("username"));
		   WebElement pass=driver.findElement(By.name("password"));
		   user.sendKeys(username);
		   pass.sendKeys(password);
	}
}
