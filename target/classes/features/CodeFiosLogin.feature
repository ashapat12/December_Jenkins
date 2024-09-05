@CodeFios	@Regression
Feature: Codefios login page functionlity validation

	@CodeFios-Scenario1 @Smoke
	Scenario: User should be able to login with valid credentials.
		Given User is on codefios login page
		When User enters username as "demo@codefios.com"
		When User enters password as "abc123"
		When User clicks on the signin button
		Then User lands on the dashboard page
		
	@CodeFios-Scenario2 
	Scenario Outline: User should be able to login with valid credentials.
		Given User is on codefios login page
		When User enters username as "<username>"
		When User enters password as "<password>"
		When User clicks on the signin button
		Then User lands on the dashboard page
		Examples:
		|username|password|
		|demo@codefios.com|abc123|
		|demo@codefios.com|abc1234|