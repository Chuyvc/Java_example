package apiStepDefinitions;

import org.json.JSONObject;
import org.junit.Assert;

import apiPageObjects.GetEmployees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiStepDefinitions {
	GetEmployees employees;
	GetEmployees employee;
	JSONObject json;
	
	int id;
	
	//Get All Employees
	@Given("User set valid auth key")
	public void user_set_valid_auth_key() 
	{
		System.out.println("Correct auth");
	}
	
	@When("User send a Get request to /users {string}")
	public void user_send_a_Get_request_to(String endpoint) 
	{
		//Write code here that returns the phrase above into concrete actions
		employees = new GetEmployees(endpoint);
	}
	
	@Then("User should get {int} as Expected Status Code")
	public void user_should_get_as_Expected_Status_Code(Integer statusCode) 
	{
		//Write code here that returns the phrase above into concrete actions
		System.out.println(statusCode);
		Assert.assertTrue(statusCode == 200);
	}
	
	@Then("User should get an array of employees")
	public void user_should_get_an_array_of_employees() 
	{
		//Write code here that returns the phrase above into concrete actions
		System.out.println(employees.response.asString());
		
	}

}
