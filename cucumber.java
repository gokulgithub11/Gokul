package addcustomer;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class cucumber {	
	static WebDriver driver;	
	@Given("user should launch browser")
	public void user_should_launch_browser() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Cucumberstart\\Driver\\chromedriver.exe");
driver =new ChromeDriver();
driver.get("http://demo.guru99.com/telecom/");
driver.manage().window().maximize();
	}

	/*@Given("user add cusomter link")
	public void user_add_cusomter_link() {
	driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();	
		}*/

	/*@When("user provide valid ditails")
	public void user_provide_valid_ditails() {
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys("Gokul");	
	driver.findElement(By.id("lname")).sendKeys("kumar");
	driver.findElement(By.id("email")).sendKeys("kokul.t@gmail.com");	
	driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Chennai");
	driver.findElement(By.id("telephoneno")).sendKeys("9994332955");	
	driver.findElement(By.xpath("//input[@name='submit']")).click();

	}*/

	/*@When("user provide valid ditails {string},{string},{string},{string},{string}")
	public void user_provide_valid_ditails(String fname, String lname, String email, String address, String phone) {	
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(fname);	
	driver.findElement(By.id("lname")).sendKeys(lname);
	driver.findElement(By.id("email")).sendKeys(email);	
	driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(address);
	driver.findElement(By.id("telephoneno")).sendKeys(phone);	
	driver.findElement(By.xpath("//input[@name='submit']")).click();	
	
}*/
	
	/*@When("user provide valid ditails")
	public void user_provide_valid_ditails(io.cucumber.datatable.DataTable dataTable) {
		List<String>oned=dataTable.asList(String.class);
		System.out.println(oned);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(oned.get(0));	
		driver.findElement(By.id("lname")).sendKeys(oned.get(1));
		driver.findElement(By.id("email")).sendKeys(oned.get(2));	
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(oned.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(oned.get(4));	
		driver.findElement(By.xpath("//input[@name='submit']")).click();	
	}*/
	
	/*@When("user provide valid ditails")
	public void user_provide_valid_ditails(io.cucumber.datatable.DataTable dataTable) {
		Map<String,String>onedmap=dataTable.asMap(String.class,String.class);
		System.out.println(onedmap);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(onedmap.get("fname"));	
		driver.findElement(By.id("lname")).sendKeys(onedmap.get("lname"));
		driver.findElement(By.id("email")).sendKeys(onedmap.get("email"));	
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(onedmap.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(onedmap.get("phone"));	
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@Then("verfiy the customer ID is displayed")
	public void verfiy_the_customer_ID_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
			
	}*/
	
	@Given("user should clik add tariff plan")
	public void user_should_clik_add_tariff_plan() {
		  driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
				  
	}

	@When("user provide valid input and sumbit")
	public void user_provide_valid_input_and_sumbit(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> twodimen = dataTable.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(twodimen.get(0).get(0));
	    driver.findElement(By.id("local_minutes")).sendKeys(twodimen.get(0).get(1));
	    driver.findElement(By.id("inter_minutes")).sendKeys(twodimen.get(0).get(2));
	    driver.findElement(By.id("sms_pack")).sendKeys(twodimen.get(1).get(3));
	    driver.findElement(By.id("minutes_charges")).sendKeys(twodimen.get(1).get(4));
	    driver.findElement(By.id("inter_charges")).sendKeys(twodimen.get(0).get(5));
	    driver.findElement(By.id("sms_charges")).sendKeys(twodimen.get(2).get(6));
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    }
	@Then("to verify success message is displayed")
	public void to_verify_success_message_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}
}
