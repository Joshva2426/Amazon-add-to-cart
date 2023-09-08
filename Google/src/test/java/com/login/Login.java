package com.login;

import io.cucumber.java.en.*;

public class Login {
	
	
	@Given("I Open the Browser")
	public void i_open_the_browser() {
	    
		System.out.println("Inside Step - I Open the Browser");
		
	}

	@Given("I Navigate to the URL")
	public void i_navigate_to_the_url() {
	    
		System.out.println("Inside Step - I Navigate to the URL");
		
	}

	@When("I search for a product")
	public void i_search_for_a_product() {
	    
		System.out.println("Inside Step - I search for a product");
		
	}

	@When("search results is displayed")
	public void search_results_is_displayed() {
	   
		System.out.println("Inside Step - search results is displayed");
		
	}

	@Then("select a product")
	public void select_a_product() {
	    
		System.out.println("Inside Step - select a product");
		
	}

	@Then("I navigate to nextpage")
	public void i_navigate_to_nextpage() {
	    
		System.out.println("Inside Steps-I navigate to nextpage");
		
	}

	@Then("click a add to cart")
	public void click_a_add_to_cart() {
		
		System.out.println("Inside Steps-click a add to cart");
	   
		
		
		
	}

}
