@CodeFios2 @Regression
Feature: Codefios login page functionlity validation

Background: 
		Given User is on codefios login page
	
		@CodeFios2-Scenario1
		Scenario: 1 User should be able to login with valid credentials.
		#Given User is on codefios login page
		When User enters username as "demo@codefios.com"
		When User enters password as "abc123"
		When User clicks on the signin button
		Then User lands on the dashboard page
		
		@CodeFios2-Scenario2
		Scenario: 2 User should be able to login with valid credentials.
		#Given User is on codefios login page
		When User enters username as "demo@codefios.com"
		When User enters password as "abc123"
		When User clicks on the signin button
		Then User lands on the dashboard page
		
		@CodeFios2-Scenario3
		Scenario: 3 User should be able to login with valid credentials.
		#Given User is on codefios login page
		When User enters username as "demo@codefios.com"
		When User enters password as "abc123"
		When User clicks on the signin button
		Then User lands on the dashboard page