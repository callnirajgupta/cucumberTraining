package com.manmohan.cucumbeTraining.setpDef;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.manmohan.cucumberTrainig.util.SeleniumUtil;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class CucumberStepDef {
	Scenario scenario;
	SeleniumUtil seleniumUtil;
	
	@Before()
	public void setup(Scenario sc){
		
		System.out.println("I am inside Before method Scenario Name"+sc.getName());
		scenario=sc;
		System.out.println("the all tag"+sc.getSourceTagNames());
		
		seleniumUtil=SeleniumUtil.getInstance();
		
		
		
		
	}
	
	@Before("~@tag11")
	public void setup1(){
		
		System.out.println("I am inside Before method tag1");
		
		
	}
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I want to write a step with precondition");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("some other precondition");
		if(scenario.getSourceTagNames().contains("@tag11")){
			System.out.println(" i am inside tag1");
		}
		
		//Assert.assertTrue("the test failed", false);
	   
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I complete action");
	   
	}
	
	@Given("^I want to write a step with \"([^\"]*)\"$")
	public void i_want_to_write_a_step_with(String arg1) throws Throwable {
		
		System.out.println("firststep"+arg1);
	
	}

	@When("^I check for the \"([^\"]*)\" in step$")
	public void i_check_for_the_in_step(String arg1) throws Throwable {
		
		System.out.println("SecondStep"+arg1);
	    
	}

	@Then("^I verify the \"([^\"]*)\" in step$")
	public void i_verify_the_in_step(String arg1) throws Throwable {
		
		System.out.println("ThirdStep"+arg1);
	    
		
		Assert.assertTrue("the test is failing ", false);
	}
	
	@After
	public void teardown(Scenario sc) throws WebDriverException, MalformedURLException{
		
		
		
		if(sc.getStatus().equals("failed")){
			final byte[] screenshot = ((TakesScreenshot) seleniumUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png"); // stick it in the report
		}
		
		
		SeleniumUtil.closeBrowser();
		
		SeleniumUtil.setDriver(null);
		
	}
	

	
	
}
