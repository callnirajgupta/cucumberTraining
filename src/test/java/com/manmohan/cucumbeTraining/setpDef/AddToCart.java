package com.manmohan.cucumbeTraining.setpDef;

import com.manmohan.cucumberTrainig.pageobjectmodel.AddToCart_PO;
import com.manmohan.cucumberTrainig.pageobjectmodel.WelcomePage_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart {
	
	@When("^user searches for the \"([^\"]*)\"$")
	public void user_searches_for_the(String item) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WelcomePage_PO.searchItem(item);
		AddToCart_PO.clickProductImageFromSearchResult(item);
	   
	}

	@When("^user Add To Cart and Proceed to checkout$")
	public void user_Add_To_Cart_and_Proceed_to_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		AddToCart_PO.clickCheckOut();
	    
	}

	@Then("^summary section shows the added item$")
	public void summary_section_shows_the_added_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user delete the item with sku as \"([^\"]*)\"$")
	public void user_delete_the_item_with_sku_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^added item should be removed$")
	public void added_item_should_be_removed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^verify that User successfully log out of the application$")
	public void verify_that_User_successfully_log_out_of_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
