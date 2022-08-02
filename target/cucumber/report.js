$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Example.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios Login validation",
  "description": "",
  "id": "techfios-login-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OtherLoginFeature1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with correct credential",
  "description": "",
  "id": "techfios-login-validation;user-should-be-able-to-login-with-correct-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@ExampleScenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on \"\u003cbankCash\u003e\" and \"\u003cnewAccount\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should land of New Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters \"\u003caccountTitle\u003e\" and \"\u003cdescription\u003e\" and \"\u003cinitialBalance\u003e\" and \"\u003caccountNumber\u003e\" and \"\u003ccontactPerson\u003e\" and \"\u003ccontactPhone\u003e\" and \"\u003curl\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on the new account submit button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user should land on account created page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "validate the account created",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "techfios-login-validation;user-should-be-able-to-login-with-correct-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "contactPhone",
        "url"
      ],
      "line": 20,
      "id": "techfios-login-validation;user-should-be-able-to-login-with-correct-credential;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "394583049234",
        "mysavings",
        "200000",
        "xdflskdf",
        "sldgiueoir",
        "woeiuoif",
        "lijdfs"
      ],
      "line": 21,
      "id": "techfios-login-validation;user-should-be-able-to-login-with-correct-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2317362300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 836663400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User should be able to login with correct credential",
  "description": "",
  "id": "techfios-login-validation;user-should-be-able-to-login-with-correct-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@ExampleScenario1"
    },
    {
      "line": 1,
      "name": "@OtherLoginFeature1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on \"\u003cbankCash\u003e\" and \"\u003cnewAccount\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should land of New Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters \"394583049234\" and \"mysavings\" and \"200000\" and \"xdflskdf\" and \"sldgiueoir\" and \"woeiuoif\" and \"lijdfs\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on the new account submit button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user should land on account created page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "validate the account created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 13
    },
    {
      "val": "abc123",
      "offset": 37
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 6211738000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_Submit_button()"
});
formatter.result({
  "duration": 4249818300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 16256200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cbankCash\u003e",
      "offset": 16
    },
    {
      "val": "\u003cnewAccount",
      "offset": 33
    }
  ],
  "location": "LoginStepDefinition.user_clicks_on_and(String,String)"
});
formatter.result({
  "duration": 390042600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_of_New_Account_Page()"
});
formatter.result({
  "duration": 9527400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "394583049234",
      "offset": 13
    },
    {
      "val": "mysavings",
      "offset": 32
    },
    {
      "val": "200000",
      "offset": 48
    },
    {
      "val": "xdflskdf",
      "offset": 61
    },
    {
      "val": "sldgiueoir",
      "offset": 76
    },
    {
      "val": "woeiuoif",
      "offset": 93
    },
    {
      "val": "lijdfs",
      "offset": 108
    }
  ],
  "location": "LoginStepDefinition.user_enters_and_and_and_and_and_and(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 782109600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_new_account_submit_button()"
});
formatter.result({
  "duration": 612147100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_account_created_page()"
});
formatter.result({
  "duration": 5548700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_the_account_created()"
});
formatter.result({
  "duration": 65772928400,
  "status": "passed"
});
formatter.after({
  "duration": 4773154000,
  "status": "passed"
});
});