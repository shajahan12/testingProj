package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepsGoogleHomePage {
	
	WebDriver driver = null; // testing dhfk fdfjdfsdf
	String driverPath = "C:\\Users\\sasha\\Documents\\chromedriver\\chromedriver.exe";
	
	@Given("I want to launch Chrome")
	public void i_want_to_launch_chrome() {
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	}
	@When("I open google page")
	public void i_open_google_page() {
	   String url = "https://www.google.com/";
	   driver.get(url);
	}
	@Then("page is displayed")
	public void page_is_displayed() {
	    String title1 = "Google";
	    String title2 = driver.getTitle();
	    Assert.assertEquals(title1, title2);
	}
	@Then("button exists")
	public void button_exists() {
	    String butName = "Google Search";
	    String res = driver.findElement(By.name("btnk")).getAttribute("area-label");
	    Assert.assertEquals(butName, res);
	}




}
