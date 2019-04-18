$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "login with ExamplesParameters",
  "description": "",
  "id": "title-of-your-feature;login-with-examplesparameters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@LoginAndLogout_ExamplesParameters"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User \"\u003cUser\u003e\" with password \"\u003cPassword\u003e\" login into the application with correct credentials ExamplesParameters",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User successfully log out of the application after clicking on log out button",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;login-with-examplesparameters;",
  "rows": [
    {
      "cells": [
        "User",
        "Password"
      ],
      "line": 10,
      "id": "title-of-your-feature;login-with-examplesparameters;;1"
    },
    {
      "cells": [
        "callnirajgupta@gmail.com",
        "password1"
      ],
      "line": 11,
      "id": "title-of-your-feature;login-with-examplesparameters;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 736144605,
  "status": "passed"
});
formatter.before({
  "duration": 89258,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "login with ExamplesParameters",
  "description": "",
  "id": "title-of-your-feature;login-with-examplesparameters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@LoginAndLogout_ExamplesParameters"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User \"callnirajgupta@gmail.com\" with password \"password1\" login into the application with correct credentials ExamplesParameters",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User successfully log out of the application after clicking on log out button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "callnirajgupta@gmail.com",
      "offset": 6
    },
    {
      "val": "password1",
      "offset": 47
    }
  ],
  "location": "Login.user_with_password_login_into_the_application_with_correct_credentials_ExamplesParameters(String,String)"
});
