$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Validate The C2TA Appliation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate The Login Opeation of C2TA Appliation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To launch Browser and navigate to url",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Login button",
  "keyword": "Then "
});
formatter.step({
  "name": "Take screenshot and Close The Browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Rahul",
        "Rahul@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The Login Opeation of C2TA Appliation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To launch Browser and navigate to url",
  "keyword": "Given "
});
formatter.match({
  "location": "Change2TestAutomation_Login_TestSteps.to_launch_Browser_and_navigate_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the \"Rahul\" and \"Rahul@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Change2TestAutomation_Login_TestSteps.enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Change2TestAutomation_Login_TestSteps.click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take screenshot and Close The Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Change2TestAutomation_Login_TestSteps.take_screenshot_and_Close_The_Browser()"
});
formatter.result({
  "status": "passed"
});
});