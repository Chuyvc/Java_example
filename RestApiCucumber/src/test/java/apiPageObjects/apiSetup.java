package apiPageObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class apiSetup {
	Response resp;
	RequestSpecification request;
	public apiSetup() 
	{
		RestAssured.baseURI = "https://reqres.in/api/";
		request = RestAssured.given();
	}
}
