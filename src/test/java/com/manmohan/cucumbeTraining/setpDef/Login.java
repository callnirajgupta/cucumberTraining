package com.manmohan.cucumbeTraining.setpDef;

import org.junit.Assert;

import com.manmohan.cucumberTrainig.pageobjectmodel.HomePage_PO;
import com.manmohan.cucumberTrainig.pageobjectmodel.WelcomePage_PO;
import com.manmohan.cucumberTrainig.util.CommonUtil;
import com.manmohan.cucumberTrainig.util.SeleniumUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
	
	
	@Given("^User \"([^\"]*)\" with password \"([^\"]*)\" login into the application with correct credentials ExamplesParameters$")
	public void user_with_password_login_into_the_application_with_correct_credentials_ExamplesParameters(String userId, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CommonUtil.login(userId, password);
		Assert.assertEquals("the page title is not matching", WelcomePage_PO.WELCOMEPAGE_TITLE, SeleniumUtil.getTitle());
	   
	}

	@Then("^User successfully log out of the application after clicking on log out button$")
	public void user_successfully_log_out_of_the_application_after_clicking_on_log_out_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WelcomePage_PO.clickSignOut();
	}

}
