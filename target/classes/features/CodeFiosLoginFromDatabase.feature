@DBLoginFeature	@Regression
Feature: Codefios login page functionlity validation

	@DBLoginScenario1
	Scenario: 1 User should be able to login with valid credentials from MySQL Database.
		Given User is on codefios login page
		When User enters "username" from database
		When User enters "password" from database
		When User clicks on the signin button
		Then User lands on the dashboard page
