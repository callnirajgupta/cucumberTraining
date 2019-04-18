package com.manmohan.cucumbeTraining.setpDef;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumTest {
	 WebDriver driver;
	 Scenario scenario;
	 private static  final Logger LOGGER=LogManager.getLogger(SeleniumTest.class);
	/*@Before
	public void setup(Scenario sc){
		LOGGER.info("I am inside the setup");
		scenario=sc;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		driver=new ChromeDriver();
		
		
		
	}
	*/
	
	@Given("^user open amazon website$")
	public void user_open_amazon_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LOGGER.info("user open amazon website");
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png"); // stick it in the report
	    
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LOGGER.info("user open amazon website");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad");
	    final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png"); // stick it in the report
	    driver.findElement(By.xpath("(//input[@type='submit'])[1]")).submit();
	    
	}

	@Then("^verify that ipad is displayed in page$")
	public void verify_that_ipad_is_displayed_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//span[text()='Apple iPad (Wi-Fi, 32GB) - Space Grey'])[1]")).isDisplayed();
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png"); // stick it in the report
		
		try{
			
		}catch(Exception e){
			
			LOGGER.error("The error occure");
		}
	    
	}
	
	/*@After
	public void teardown(Scenario sc){
		
		
		
		if(sc.getStatus().equals("failed")){
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png"); // stick it in the report
		}
		
		driver.close();
		driver.quit();
		
	}*/

}
