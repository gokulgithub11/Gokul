package outline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class outlinemethod {
	static WebDriver driver;	
	@Given("user should launch browser")
	public void user_should_launch_browser() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Cucumberstart\\Driver\\chromedriver.exe");
driver =new ChromeDriver();
driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user add cusomter link")
	public void user_add_cusomter_link() {
	driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();	
		}
	@When("user provide valid ditails {string},{string},{string},{string},{string}")
	public void user_provide_valid_ditails(String fname, String lname, String email, String address, String phone) {	
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(fname);	
	driver.findElement(By.id("lname")).sendKeys(lname);
	driver.findElement(By.id("email")).sendKeys(email);	
	driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(address);
	driver.findElement(By.id("telephoneno")).sendKeys(phone);	
	driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

	@Then("verfiy the customer ID is displayed")
	public void verfiy_the_customer_ID_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
			
	}
}

