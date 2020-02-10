    
@tag
Feature: Validate Employees API


    @GETWithoutParams
    Scenario: Validate user can get an array of employees
        Given User set valid auth key
        When User send a Get request to /users "/users"
        Then User should get 200 as Expected Status Code
        And User should get an array of employees