package com.manmohan.cucumberTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/", tags =  "@LoginAndLogout_ExamplesParameters", plugin = {
		"pretty", "html:target/cucumber-html-report",
		"json:target/cucumber.json", "junit:target/cucumber.xml" ,"rerun:target/rerun.txt" }, glue = { "com.manmohan" } )


public class TestRunner {
	@BeforeClass
	public static void beforclass(){
		
		
		if(System.getProperty("Browser")==null){
			System.setProperty("Browser", "chrome");
			
		}
		if(System.getProperty("headless")==null){
			System.setProperty("headless","null");
		}
		if(System.getProperty("ENV")==null){
			System.setProperty("ENV", "SIT");
			
		}
		
		if(System.getProperty("ExecuteOn")==null){
			System.setProperty("ExecuteOn", "null");
			
		}
		
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
	System.setProperty("currentdate", dateFormat.format(new Date()));
	
	}
	
}
