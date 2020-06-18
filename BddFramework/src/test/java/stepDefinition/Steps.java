/*
-----------------------------------------------------------------------------------------------------
|	Developer	: 	Vijay Hire												 					 	 	
*	Project		: 	BddFramework																 
|	Location	: 	Pune																		 
*	Date		: 	2020-06-12											 
|	File		:	Steps.java																 
*	Copyright (C) Abibue Tech - All Rights Reserved												 
|   		Unauthorized copying of this file, via any medium is strictly prohibited			 
*   		Proprietary and confidential														 
|  			Written by Vijay Hire <iamvijayhire@gmail.com>.
-----------------------------------------------------------------------------------------------------										 
*/
package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	@Given("Open Flipkart")
	public void Open_Flipkart() throws Throwable {

		System.out.println("Open Flikart...");

	}

	@And("click on Login button")
	public void click_on_Login_button() throws Throwable {
		System.out.println("Click on Login Button...");
	}

	@When("I enter username")
	public void I_enter_username() throws Throwable {
		System.out.println("I enter username...");
	}

	@And("i enter password")
	public void i_enter_password() throws Throwable {
		System.out.println("I enter password...");
	}

	@Then("I click on ok button")
	public void I_click_on_ok_button() throws Throwable {
		System.out.println("I click on Ok button...");
	}

	@Then("^i am able to login$")
	public void i_am_able_to_login() throws Throwable {
		System.out.println("I am able to login...");
	}
}
