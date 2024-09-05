@AddAccount @Regression
Feature: Add account under List Accounts functionality Validation

@AddAccount-Scenario1
Scenario Outline: 1 User should be able to login with valid credentials and add customer under list accounts
		Given User is on codefios login page
		When User enters userName as "<userName>"
		When User enters password as "<password>"
		When User clicks on the signin button
		Then User lands on the dashboard page
		And User clicks on List Account;
		And User clicks on Add Account;
		And User enters Account name as "<AccountName>";
		And User enters Initial Balance as "<InitialBalance>";
		And User enters AC number as "999";
		And user clikcs on Save button;
		Then user should be able to validate account created successfully
		Examples:
		|userName|password|AccountName|InitialBalance|
		|demo@codefios.com|abc123|abcTechFios|2500|
	
		