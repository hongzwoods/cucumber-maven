package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	@Given("^Open firefox and start appliation$")
	public void open_firefox_and_start_appliation() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://107.170.213.234/catalog/index.php");
	}

	@When("^Enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys("ziyufang@hotmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id='tdb5']/span[1]")).click();
	}

	@Then("^login successfully$")
	public void login_successfully() throws Throwable {
		String expectTest = "Welcome to iBusiness";
		String actualTest = driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
		Assert.assertEquals(expectTest.trim(), actualTest.trim());
		driver.close();
	}


}
