$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/CodeFiosLogin.feature");
formatter.feature({
  "name": "Codefios login page functionlity validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CodeFios"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CodeFios"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@CodeFios-Scenario1"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the signin button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User lands on the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_lands_on_the_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});